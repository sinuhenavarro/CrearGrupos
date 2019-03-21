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
public class Participante extends Persona{
    private String Modulos;

    public Participante(String Nombre, String m) {
        super(Nombre);
        this.Modulos = m;

    }
    public String getModulos() {
        return this.Modulos;
    }
    
    public String getModulo(int n) {
        String[] temp = Modulos.split(",");
        return temp[n];
    }
    public void setModulos(String m) {
        this.Modulos = m;

    }

}
