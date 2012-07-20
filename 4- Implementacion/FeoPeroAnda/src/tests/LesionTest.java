/*package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import rules.ControladorReglas;
import sintomas.Dolor;
import sintomas.Estabilidad;
import sintomas.Inflamacion;
import sintomas.Rigidez;
import sintomas.Ruido;
import sintomas.Sintoma;
import sintomas.Zona;
import lesiones.TipoLesion;

public class LesionTest{
	
	@org.junit.Test
	public void testLCA(){
		
		List<Sintoma> sintomas = new ArrayList<Sintoma>();
		
		sintomas.add(new Dolor(Sintoma.Valor.ALTO));
		sintomas.add(new Rigidez(Sintoma.Valor.MEDIO));
		sintomas.add(new Estabilidad(Sintoma.Valor.BAJO));
		sintomas.add(new Zona(Sintoma.Valor.ANTERIOR));
		sintomas.add(new Ruido(Sintoma.Valor.CRUJIENTE));
		sintomas.add(new Inflamacion(Sintoma.Valor.ALTO));
		
		ControladorReglas reglas = new ControladorReglas(sintomas);
		List<TipoLesion> lesiones = reglas.ejecutar();
		TipoLesion lesion = lesiones.get(0);
		
		assertEquals(1, lesiones.size());
		assertEquals(TipoLesion.LCA, lesion);
	}
	
	@org.junit.Test	
	public void testLCP(){
		
		List<Sintoma> sintomas = new ArrayList<Sintoma>();
		
		sintomas.add(new Dolor(Sintoma.Valor.ALTO));
		sintomas.add(new Rigidez(Sintoma.Valor.MEDIO));
		sintomas.add(new Estabilidad(Sintoma.Valor.BAJO));
		sintomas.add(new Zona(Sintoma.Valor.POSTERIOR));
		sintomas.add(new Ruido(Sintoma.Valor.CRUJIENTE));
		sintomas.add(new Inflamacion(Sintoma.Valor.ALTO));
		
		ControladorReglas reglas = new ControladorReglas(sintomas);
		List<TipoLesion> lesiones = reglas.ejecutar();
		TipoLesion lesion = lesiones.get(0);
		
		assertEquals(1, lesiones.size());
		assertEquals(TipoLesion.LCP, lesion);
	}
	
	@org.junit.Test
	public void testLCAP(){
		
		List<Sintoma> sintomas = new ArrayList<Sintoma>();
		
		sintomas.add(new Dolor(Sintoma.Valor.MUY_ALTO));
		sintomas.add(new Rigidez(Sintoma.Valor.BAJO));
		sintomas.add(new Estabilidad(Sintoma.Valor.MUY_BAJO));
		sintomas.add(new Zona(Sintoma.Valor.AMBOS));
		sintomas.add(new Ruido(Sintoma.Valor.CRUJIENTE));
		sintomas.add(new Inflamacion(Sintoma.Valor.ALTO));
		sintomas.add(new Inflamacion(Sintoma.Valor.MUY_ALTO));
		
		ControladorReglas reglas = new ControladorReglas(sintomas);
		List<TipoLesion> lesiones = reglas.ejecutar();
		TipoLesion lesion = lesiones.get(0);
		
		assertEquals(1, lesiones.size());
		assertEquals(TipoLesion.LCAP, lesion);
	}
		
	@org.junit.Test
	public void testMeniscos(){
		
		List<Sintoma> sintomas = new ArrayList<Sintoma>();
		
		sintomas.add(new Dolor(Sintoma.Valor.ALTO));
		sintomas.add(new Rigidez(Sintoma.Valor.ALTO));
		sintomas.add(new Estabilidad(Sintoma.Valor.NORMAL));
		sintomas.add(new Zona(Sintoma.Valor.AMBOS));
		sintomas.add(new Ruido(Sintoma.Valor.RUIDOSECO));
		sintomas.add(new Inflamacion(Sintoma.Valor.MEDIO));
		
		ControladorReglas reglas = new ControladorReglas(sintomas);
		List<TipoLesion> lesiones = reglas.ejecutar();
		TipoLesion lesion = lesiones.get(0);
		
		assertEquals(1, lesiones.size());
		assertEquals(TipoLesion.MENISCOS, lesion);
	}
	
	@org.junit.Test
	public void testTendinitis(){

		List<Sintoma> sintomas = new ArrayList<Sintoma>();
		
		sintomas.add(new Dolor(Sintoma.Valor.ALTO));
		sintomas.add(new Dolor(Sintoma.Valor.MEDIO));
		sintomas.add(new Rigidez(Sintoma.Valor.ALTO));
		sintomas.add(new Estabilidad(Sintoma.Valor.NORMAL));
		sintomas.add(new Zona(Sintoma.Valor.FRONTAL));
		sintomas.add(new Ruido(Sintoma.Valor.NINGUNO));
		sintomas.add(new Inflamacion(Sintoma.Valor.MEDIO));
		sintomas.add(new Inflamacion(Sintoma.Valor.ALTO));
		
		ControladorReglas reglas = new ControladorReglas(sintomas);
		List<TipoLesion> lesiones = reglas.ejecutar();
		TipoLesion lesion = lesiones.get(0);
		
		assertEquals(1, lesiones.size());
		assertEquals(TipoLesion.TENDINITIS, lesion);
	}
	
	@org.junit.Test
	public void testArtritis(){
		
		List<Sintoma> sintomas = new ArrayList<Sintoma>();
				
		sintomas.add(new Dolor(Sintoma.Valor.MEDIO));
		sintomas.add(new Rigidez(Sintoma.Valor.MEDIO));
		sintomas.add(new Rigidez(Sintoma.Valor.ALTO));
		sintomas.add(new Estabilidad(Sintoma.Valor.BAJO));
		sintomas.add(new Estabilidad(Sintoma.Valor.NORMAL));
		sintomas.add(new Zona(Sintoma.Valor.AMBOS));
		sintomas.add(new Ruido(Sintoma.Valor.NINGUNO));
		sintomas.add(new Inflamacion(Sintoma.Valor.MEDIO));
		
		ControladorReglas reglas = new ControladorReglas(sintomas);
		List<TipoLesion> lesiones = reglas.ejecutar();
		TipoLesion lesion = lesiones.get(0);
		
		assertEquals(1, lesiones.size());
		assertEquals(TipoLesion.ARTRITIS, lesion);
	}	
}
*/