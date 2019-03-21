/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprint3ed;

/**
 *
 * @author sinuhe
 */
public class Tutor extends Persona {
    private int Especialidad;

    public Tutor(String Nombre, int e) {
        super(Nombre);
        this.Especialidad = e;
    }

    public int getEspecialidad() {
        //n indica el orden de la preferencia (0=preferido, 6=el de menor preferencia)
        return Especialidad;
    }
    
    public void setEspecialidad(int e) {
        this.Especialidad = e;
    }
    
    
}
