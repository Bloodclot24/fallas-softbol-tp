/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fastpitchexpert;

import java.awt.Image;
import java.util.*;

/**
 *
 * @author Luuu
 */
public class Pregunta {
    
    public String pregunta;
    public ArrayList<Respuesta> respuestas;
    public Image image;
    
    private Respuesta _respuestaElegida = null;
    
    public Pregunta() {
        respuestas = new ArrayList<Respuesta>();
    }
    
    public void elegirRespuesta(Respuesta rta) {
        _respuestaElegida = rta;
    }
    
    public boolean hayRespuesta() {
        return _respuestaElegida != null;
    }

}
