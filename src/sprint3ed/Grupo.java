/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprint3ed;

import java.util.ArrayList;

/**
 *
 * @author sinuhe
 */
public class Grupo {
    private int IdGrupo;
    private int NParticipantes; //Númereo de participantes total del grupo
    private int NModulos; //Número de módulos que tienen que tutorizarse en este grupo
    private ArrayList ListaParticipantes;
    private Tutor Tutor;
    private boolean[] Modulos; //array de 6 caractares con valor false si dicho módulo (por índice está incluido) y true si dicho módulo no está incluido en el grupo
    
    public Grupo(int IdGrupo, Tutor Tutor) {
        this.IdGrupo = IdGrupo;
        this.NParticipantes = 0;
        this.ListaParticipantes = new ArrayList();
        this.Tutor = Tutor;
        this.Modulos = new boolean[5];
        this.Modulos[0]=false;
        this.Modulos[1]=false;
        this.Modulos[2]=false;
        this.Modulos[3]=false;
        this.Modulos[4]=false;
        this.Modulos[5]=false;
        this.Modulos[Tutor.getEspecialidad()] = true;
        this.NModulos = 1;
    }


//------- MODULOS ------------------------------------
    public int getNModulos() {
        return NModulos;
    }

    public void setNModulos(int NModulos) {
        this.NModulos = NModulos;
    }

    public boolean[] getModulos() {
        return Modulos;
    }

    //Devuelve true si hay algún participante en el grupo con ese módulo
    public boolean isModulo(int i)
    {
        return Modulos[i];
    }
    
    public void addModulo(int m) {
        this.Modulos[m] = true;
        this.NModulos++;
    }
//------- IDGRUPO ---------------------------------------
    public void setIdGrupo(int IdGrupo) {
        this.IdGrupo = IdGrupo;
    }
    
    public int getIdGrupo() {
        return IdGrupo;
    }
    
//------- PARTICIPANTES ---------------------------------
    public void addParticipante(Participante p){
        this.ListaParticipantes.add(p);
        this.NParticipantes++;
    }   
  
    public ArrayList getListaParticipantes() {
        return ListaParticipantes;
    }   
    
    public void setNParticipantes(int NParticipantes) {
        this.NParticipantes = NParticipantes;
    }
    
    public int getNParticipantes() {
        return NParticipantes;
    }
//------- TUTOR -------------------------------------   
    public void setTutor(Tutor Tutor) {
        this.Tutor = Tutor;
    }

    public Tutor getTutor() {
        return Tutor;
    }


    
}
