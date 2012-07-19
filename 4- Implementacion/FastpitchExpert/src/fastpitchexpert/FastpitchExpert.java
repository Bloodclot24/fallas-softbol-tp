package fastpitchexpert;

import java.util.ArrayList;

/**
 *
 * @author Luuu
 */
public class FastpitchExpert {
    
    private ArrayList<Pregunta> _preguntas = null;
    private int _next;
    private static FastpitchExpert instance = new FastpitchExpert();
    
    private FastpitchExpert() {
        init();
    }
    
    public static FastpitchExpert getInstance() {
        return instance;
    }
    
    public void init() {
        
        _next = 0;
        //inicializar las preguntas
        _preguntas = new ArrayList<Pregunta>();
        
        Pregunta p = new Pregunta();
        _preguntas.add(p);
        
        p.pregunta = "¿Cómo fué la traza del recorrido de la pelota?";
        Respuesta r = new Respuesta();
        r.respuesta = "Recta";
        r.descripcion = "La pelota describe una trayectoria recta en el aire.";
        p.respuestas.add(r);
        r = new Respuesta();
        r.respuesta = "Curva";
        r.descripcion = "La pelota es lanzada con un efecto curvo.";
        p.respuestas.add(r);
    }
    
    public Pregunta getProximaPregunta() {
        return _preguntas.get(_next++);
    }
    
    public Pregunta getPreviaPregunta() {
        if(_next > 0)
            return _preguntas.get(--_next);
        else
            return null;
    }
    
   public boolean hayProxima() {
        return _next < _preguntas.size();
    }
   
   public boolean hayPrevia() {
        return _next > 1;
    }

}
