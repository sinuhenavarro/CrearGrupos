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
public class Distribucion {
    private int Puntos;
    private int DesequilibrioP; //Diferencia entre el máx y el min número de participantes de cada módulo
    private int DesequilibrioM; //Diferencia entre el máx y el min de número de módulos que tutoriza un tutor
    private int NModulos; //Media del número de módulos que tutoriza cada tutor
    private ArrayList ListaGrupos;
 
    
    /**
     *
     */
    public Distribucion() {
        this.Puntos = 0;
        this.ListaGrupos = new ArrayList();
    }

    /**
     *
     * @return
     */
    public int getPuntos() {
        return Puntos;
    }

    /**
     *
     * @return
     */
    public ArrayList getListaGrupos() {
        return ListaGrupos;
    }

    /**
     *
     * @param puntos
     */
    public void setPuntos(int puntos) {
        this.Puntos = puntos;
    }

    /**
     *
     * @param g
     */
    public void addGrupo(Grupo g) {
        this.ListaGrupos.add(g);
        this.recalculaPuntos();
    }

    /**
     *
     */
    public void recalculaPuntos(){
        //implementar
    }
    
    
}
