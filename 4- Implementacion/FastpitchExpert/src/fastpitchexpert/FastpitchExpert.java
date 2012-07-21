package fastpitchexpert;

import java.util.ArrayList;
import lanzamientos.DescrTipoLanzamiento;
import lanzamientos.Lanzamiento;
import rules.ControladorReglas;

/**
 *
 * @author Luuu
 */
public class FastpitchExpert {
    
    private ArrayList<Pregunta> _preguntas = null;
    private int _current;
    private static FastpitchExpert instance = new FastpitchExpert();
    private Lanzamiento _lanzamiento;
    
    private FastpitchExpert() {
        init();
    }
    
    public static FastpitchExpert getInstance() {
        return instance;
    }
    
    public final void init() {
        
        _current = -1;
        //inicializar las preguntas
        _preguntas = new ArrayList<Pregunta>();
        
        preguntaRecorrido();
        preguntaVelocidad();
        preguntaCuerpo();
        preguntaMunieca();
        preguntaSoltado();
        preguntaPies();
    }
    
   private void preguntaMunieca() {
        Pregunta p = new Pregunta("munieca");
        _preguntas.add(p);
        p.pregunta = "¿Cuánto efecto de muñeca realizó el lanzamiento la pitcher?";

        Respuesta r = new Respuesta();
        r.respuesta = "Poco";
        r.codigo = "Poco";
        r.descripcion = "La lanzadora no le imprimió un gran efecto a la pelota, utilizando la muñeca.";
        p.respuestas.add(r);
        
        r = new Respuesta();
        r.respuesta = "Medio";
        r.codigo = "Medio";
        r.descripcion = "La lanzadora le dió un efecto normal al lanzamiento.";
        p.respuestas.add(r);
        
        r = new Respuesta();
        r.respuesta = "Mucho";
        r.codigo = "Mucho";
        r.descripcion = "La lanzadora realizó un gran movimiento de muñeca para imprimirle efecto al lanzamiento.";
        p.respuestas.add(r);
   }
   
   private void preguntaSoltado() {
        Pregunta p = new Pregunta("lugar");
        _preguntas.add(p);
        p.pregunta = "¿En qué lugar se soltó la pelota?";

        Respuesta r = new Respuesta();
        r.respuesta = "Atrás";
        r.codigo = "Atras";
        r.descripcion = "La lanzadora soltó la pelota cuando su brazo estaba detrás de sus piernas.";
        p.respuestas.add(r);
        
        r = new Respuesta();
        r.respuesta = "Medio";
        r.codigo = "Medio";
        r.descripcion = "La lanzadora soltó la pelota a la altura de la cintura.";
        p.respuestas.add(r);
        
        r = new Respuesta();
        r.respuesta = "Delante";
        r.codigo = "Delante";
        r.descripcion = "La lanzadora soltó la pelota cuando su brazo estaba delante de sus piernas.";
        p.respuestas.add(r);
   }
   
   private void preguntaPies() {
        Pregunta p = new Pregunta("pies");
        _preguntas.add(p);
        p.pregunta = "¿Cuál era la posición de los pies de la lanzadora?";

        Respuesta r = new Respuesta();
        r.respuesta = "Alineados";
        r.codigo = "Alineado";
        r.descripcion = "La lanzadora tenía sus pies alineados con su cuerpo.";
        p.respuestas.add(r);
        
        r = new Respuesta();
        r.respuesta = "No Alineados";
        r.codigo = "NoAlineado";
        r.descripcion = "Los pies de la lanzadora no estaban alineados con su cuerpo.";
        p.respuestas.add(r);
   }
   
   private void preguntaCuerpo() {
        Pregunta p = new Pregunta("peso");
        _preguntas.add(p);
        p.pregunta = "¿Cómo era la distribución del peso de la pitcher?";

        Respuesta r = new Respuesta();
        r.respuesta = "Atrás";
        r.codigo = "Atras";
        r.descripcion = "La lanzadora estaba posicionada llevando su peso hacia atrás.";
        p.respuestas.add(r);
        
        r = new Respuesta();
        r.respuesta = "Medio";
        r.codigo = "Medio";
        r.descripcion = "La lanzadora estaba firmemente parada, con un balance hacia el centro del cuerpo.";
        p.respuestas.add(r);
        
        r = new Respuesta();
        r.respuesta = "Delante";
        r.codigo = "Delante";
        r.descripcion = "La lanzadora llevó su peso hacia adelante para lanzar.";
        p.respuestas.add(r);
   }
   
   private void preguntaVelocidad() {
       Pregunta p = new Pregunta("velocidad");
        _preguntas.add(p);
        p.pregunta = "¿Qué velocidad promedio alcanzó la pelota?";

        Respuesta r = new Respuesta();
        r.respuesta = "Baja";
        r.codigo = "Baja";
        r.descripcion = "La pelota fué lanzada lentamente.";
        p.respuestas.add(r);
        
        r = new Respuesta();
        r.respuesta = "Media";
        r.codigo = "Media";
        r.descripcion = "La pelota alcanzó una velocidad media o normal.";
        p.respuestas.add(r);
        
        r = new Respuesta();
        r.respuesta = "Alta";
        r.codigo = "Alta";
        r.descripcion = "La pelota fué lanzada muy velozmente.";
        p.respuestas.add(r);
   }
   
   private void preguntaRecorrido() {
        Pregunta p = new Pregunta("traza");
        _preguntas.add(p);
        p.pregunta = "¿Cómo fué la traza del recorrido de la pelota?";

        Respuesta r = new Respuesta();
        r.respuesta = "Recta";
        r.codigo = "Recta";
        r.descripcion = "La pelota describió una trayectoria recta en el aire.";
        p.respuestas.add(r);
        
        r = new Respuesta();
        r.respuesta = "Curva";
        r.codigo = "Curva";
        r.descripcion = "La pelota fué lanzada con un efecto curvo.";
        p.respuestas.add(r);
        
        r = new Respuesta();
        r.respuesta = "Baja";
        r.codigo = "Baja";
        r.descripcion = "La pelota fué lanzada con un efecto descendente.";
        p.respuestas.add(r);
        
        r = new Respuesta();
        r.respuesta = "Trepa";
        r.codigo = "Trepa";
        r.descripcion = "La pelota fué lanzada con un efecto ascendente.";
        p.respuestas.add(r);
   }
    
   public Pregunta getProximaPregunta() {
        return _preguntas.get(++_current);
    }
    
   public Pregunta getPreviaPregunta() {
        if(_current > 0)
            return _preguntas.get(--_current);
        else
            return null;
    }
    
   public boolean hayProxima() {
        return (_current+1) < _preguntas.size();
    }
   
   public boolean hayPrevia() {
        return _current > 0;
    }
   
   private void generarLanzamiento() {
       this._lanzamiento = new Lanzamiento();
       for ( Pregunta p : _preguntas ) {
           System.out.println("Respuesta: " +p.getRespuestaElegida().codigo);
           if(p.codigo.equals("peso")) {
               _lanzamiento.setDistPeso(p.getRespuestaElegida().codigo);
           }else if (p.codigo.equals("pies")) {
               _lanzamiento.setPies(p.getRespuestaElegida().codigo);
           }else if (p.codigo.equals("munieca")){
               _lanzamiento.setMovMunieca(p.getRespuestaElegida().codigo);
           }else if (p.codigo.equals("velocidad")) {
               _lanzamiento.setVelocidad(p.getRespuestaElegida().codigo);
           }else if (p.codigo.equals("traza")) {
               _lanzamiento.setTraza(p.getRespuestaElegida().codigo);
           }else if (p.codigo.equals("lugar")) {
               _lanzamiento.setSoltadoPelota(p.getRespuestaElegida().codigo);
           }
       }
   }
   
   public DescrTipoLanzamiento obtenerResultado() {
       generarLanzamiento();
       ControladorReglas controller = new ControladorReglas(_lanzamiento);
       controller.ejecutar();
       return DescrTipoLanzamiento.getDescripcion(_lanzamiento.getLanzamiento());
   }

}
