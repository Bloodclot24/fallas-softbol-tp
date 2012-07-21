/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lanzamientos;

import java.util.ArrayList;

/**
 *
 * @author Luuu
 */
public class DescrTipoLanzamiento {
    public String descripcion;
    public String tipoLanzamiento;
    //public Video video;
    
    static private ArrayList<DescrTipoLanzamiento> _descripciones;
    
    private DescrTipoLanzamiento() {
        
    }
    
    static public DescrTipoLanzamiento getDescripcion(String tipoLanzamiento) {
        if (_descripciones == null) {
            crearDescripciones();
        }
        
        for (DescrTipoLanzamiento descr : _descripciones) {
            if (descr.tipoLanzamiento.equals(tipoLanzamiento)) {
                return descr;
            }
        }
        
        return null;
    }
    
    static private void crearDescripciones() {
        _descripciones = new ArrayList<DescrTipoLanzamiento>(6);
        crearFastball();
        crearChangeup();
        crearCurveball();
        crearRiseball();
        crearDropball();
        crearScrewball();
    }
    
    static private void crearFastball() {
        DescrTipoLanzamiento descr = new DescrTipoLanzamiento();
        descr.tipoLanzamiento = "Fastball";
        descr.descripcion = "Lanzamiento rápido y recto.";
        _descripciones.add(descr);
    }
    
    static private void crearChangeup() {
        DescrTipoLanzamiento descr = new DescrTipoLanzamiento();
        descr.tipoLanzamiento = "Changeup";
        descr.descripcion = "Lanzamiento lento y con efecto.";
        _descripciones.add(descr);
    }
    
    static private void crearCurveball() {
        DescrTipoLanzamiento descr = new DescrTipoLanzamiento();
        descr.tipoLanzamiento = "Curveball";
        descr.descripcion = "Lanzamiento curvo.";
        _descripciones.add(descr);
    }
    
    static private void crearRiseball() {
        DescrTipoLanzamiento descr = new DescrTipoLanzamiento();
        descr.tipoLanzamiento = "Riseball";
        descr.descripcion = "Lanzamiento alto.";
        _descripciones.add(descr);
    }
    
    static private void crearDropball() {
        DescrTipoLanzamiento descr = new DescrTipoLanzamiento();
        descr.tipoLanzamiento = "Dropball";
        descr.descripcion = "Lanzamiento bajo";
        _descripciones.add(descr);
    }
    
    static private void crearScrewball() {
        DescrTipoLanzamiento descr = new DescrTipoLanzamiento();
        descr.tipoLanzamiento = "Screwball";
        descr.descripcion = "Lanzamiento con mucho efecto.";
        _descripciones.add(descr);
    }
}
