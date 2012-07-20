/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fastpitchexpert;

/**
 *
 * @author Luuu
 */
public class Respuesta {
    
    public String respuesta;    //para mostrar al usuario
    public String descripcion;  //descripcion de la respuesta
    public String codigo;       //codigo interno para drools
    
    @Override
    public String toString() {
        return respuesta;
    }
}
