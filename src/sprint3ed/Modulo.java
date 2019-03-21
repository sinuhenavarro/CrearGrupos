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
public class Modulo {
    private String IdModulo;
    private int NumeroParticipantes;
    private ArrayList<Participante> ListaParticipantes = new ArrayList<>();
    private Tutor Tutor;

    public Modulo(String IdModulo, Tutor t) {
        this.IdModulo = IdModulo;
        this.NumeroParticipantes = 0;
        this.Tutor = t;
    }
    
    public Modulo(String IdModulo) {
        this.IdModulo = IdModulo;
        this.NumeroParticipantes = 0;
        this.Tutor = null;
    }
  
    public String getIdModulo() {
        return IdModulo;
    }

    public void setIdModulo(String IdModulo) {
        this.IdModulo = IdModulo;
    }

    public ArrayList<Participante> getListaParticipantes() {
        return ListaParticipantes;
    }

    public void setListaParticipantes(ArrayList<Participante> ListaParticipantes) {
        this.ListaParticipantes = ListaParticipantes;
    }
    
    public int getNumeroParticipantes() {
        return NumeroParticipantes;
    }

    public void setNumeroParticipantes(int n) {
        this.NumeroParticipantes = n;
    }

    public Tutor getTutor() {
        return Tutor;
    }

    public void setTutor(Tutor Tutor) {
        this.Tutor = Tutor;
    }
    
    public void addParticipante(Participante p){
        ListaParticipantes.add(p);
        this.NumeroParticipantes++;
    }
    
    public boolean isParticipante(Participante p){
        boolean encontrado = false;
        for (int i = 0; i < this.ListaParticipantes.size(); i++) {
            if(this.ListaParticipantes.get(i).getNombre() == p.getNombre())
                encontrado = true;
        }
        return encontrado;
    }
    
}
