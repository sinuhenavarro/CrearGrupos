/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprint3ed;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sinuhe
 */
public class Sprint3 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here     
        Modulo[] m = new Modulo[6]; //Array con los 6 módulos del curso (0,1,2,3,4,5)
        m[0] = new Modulo("0");
        m[1] = new Modulo("1");
        m[2] = new Modulo("2");
        m[3] = new Modulo("3");
        m[4] = new Modulo("4");
        m[5] = new Modulo("5");
        
        leerParticipantes(m);
        leerTutores(m);
        //-----------------------------------------------------------------------------------------
        //Comprobando el grado de desequilibrio de número de participantes entre módulos
        //-----------------------------------------------------------------------------------------
        int[] Nparticipantes = new int[6];
        
        Nparticipantes[0] = m[0].getNumeroParticipantes();
        Nparticipantes[1] = m[1].getNumeroParticipantes();
        Nparticipantes[2] = m[2].getNumeroParticipantes();
        Nparticipantes[3] = m[3].getNumeroParticipantes();
        Nparticipantes[4] = m[4].getNumeroParticipantes();
        Nparticipantes[5] = m[5].getNumeroParticipantes();
        
        //Calculamos el máximo y mínimo de particpantes de los módulos
        // y qué módulo tiene el máx y el min
        int min, max,mmax,mmin;   
        min = max = Nparticipantes[0];
        mmax = mmin = 0;
        for(int i = 0; i < Nparticipantes.length; i++){
            if(min>Nparticipantes[i]){
                    min=Nparticipantes[i];
                    mmin = i;
            }
            if(max<Nparticipantes[i]){
                    max=Nparticipantes[i];
                    mmax = i;
            }
        }
        System.out.println("Máximo: "+Integer.toString(max)+ " en el módulo:"+Integer.toString(mmax));
        System.out.println("Mínimo: "+Integer.toString(min)+ " en el módulo:"+Integer.toString(mmin));
        System.out.println("Diferencia: "+Integer.toString(max-min));
        
        //Si está equilibrado (no hay diferencia de más de 5 participantes) 
        //naturalemente, se crean los grupos y la distribución
        if(max-min<5){
            //Se dejan los grupos y la distribución tal cual están
        }else{
            //Crear grupos en la que se añada un módulo más al tutor que menos participantes tiene
            // y se le asignan participantes dell módulo que más participantes tenga
        }


    
    }

    private static void leerTutores(Modulo[] m) throws NumberFormatException, IOException {
        //----------------------------
        //Leyendo tutores del fichero
        //---------------------------
        FileReader f;
        BufferedReader b;
        int i;
        try {
            f = new FileReader("tutores.txt");
            b = new BufferedReader(f);
            String cadena; //Se usará para leer una línea de los ficheros
            while((cadena = b.readLine())!=null) {
                String [] subcadena = cadena.split(":"); //Separa el nombre y la especialidad de la cadena leída del fichero: Pepito:1
                Tutor t = new Tutor(subcadena[0],Integer.parseInt(subcadena[1]));
                //Asignado a cada módulo su tutor
                i = Integer.parseInt(subcadena[1]); //En subcadena[1] está la especialidad de ese tutor
                m[i].setTutor(t); //Asigna como tutor al módulo del que es especialista t
                
            }
        }catch (FileNotFoundException ex) {
            Logger.getLogger(Sprint3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void leerParticipantes(Modulo[] m) throws NumberFormatException, IOException {
        FileReader f;
        BufferedReader b;
        int i;
        //-----------------------------------
        //Leyendo participantes del fichero
        //----------------------------------
        try {
            f = new FileReader("participantes.txt");
            b = new BufferedReader(f);
            String cadena; //Se usará para leer una línea de los ficheros
            while((cadena = b.readLine())!=null) {
                String [] subcadena = cadena.split(":"); //Separa el nombre y los módulos de la cadena: Pepito : 1,2,3
                System.out.println(subcadena[0]+subcadena[1]);
                Participante p = new Participante(subcadena[0],subcadena[1]);
                //Metiendo a p en cada uno de los 3 módulos que ha elegido
                i = Integer.parseInt(p.getModulo(0)); //Obtiene en formato int el primer módulo elegido por p
                m[i].addParticipante(p); //Añade p al primer módulo que ha elegido
                i = Integer.parseInt(p.getModulo(1)); //Obtiene en formato int el primer módulo elegido por p
                m[i].addParticipante(p); //Añade p al segunddo módulo que ha elegido
                i = Integer.parseInt(p.getModulo(2)); //Obtiene en formato int el primer módulo elegido por p
                m[i].addParticipante(p); //Añade p al tercer módulo que ha elegido
            }
        }catch (FileNotFoundException ex) {
            Logger.getLogger(Sprint3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
