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
    public String codigo;
    public ArrayList<Respuesta> respuestas;
    public Image image;
    
    private int _respuestaElegida;
    
    public Pregunta(String codigo) {
        respuestas = new ArrayList<Respuesta>();
        _respuestaElegida = 0;
        this.codigo = codigo;
    }
    
    public void elegirRespuesta(int rta) {
        _respuestaElegida = rta;
    }
    
    public int respuestaElegida() {
        return _respuestaElegida;
    }

    public Respuesta getRespuestaElegida() {
        return respuestas.get(_respuestaElegida);
    }
}
