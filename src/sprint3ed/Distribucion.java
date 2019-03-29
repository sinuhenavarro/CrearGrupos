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
    private int puntos;
    private ArrayList listaGrupos;
 
    
    /**
     *
     */
    public Distribucion() {
        this.puntos = 0;
        this.listaGrupos = new ArrayList();
    }

    /**
     *
     * @return
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     *
     * @return
     */
    public ArrayList getListaGrupos() {
        return listaGrupos;
    }

    /**
     *
     * @param puntos
     */
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    /**
     *
     * @param g
     */
    public void addGrupo(Grupo g) {
        this.listaGrupos.add(g);
        this.recalculaPuntos();
    }

    /**
     *
     */
    public void recalculaPuntos(){
        //implementar
    }
    
    
}
