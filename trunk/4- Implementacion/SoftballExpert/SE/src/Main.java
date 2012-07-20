import com.drools.EvaluadorReglas;
import com.drools.Lanzador;

import drools.EV;


public class Main {

	public static void main(String[] args) {
		//EvaluadorReglas ev = new EvaluadorReglas();
		EV ev = new EV();
		Lanzador lanzador = new Lanzador();
		lanzador.setDistPeso("Medio");
		lanzador.setPies("NoAlineado");
		lanzador.setSoltadoPelota("Medio");
		lanzador.setMovMunieca("Medio");
		lanzador.setTraza("Recta");
		lanzador.setVelocidad("Alta");
		ev.evaluarReglas(lanzador);
		System.out.println("Resultado Esperado : Fastball Resultado Obtenido: "+ lanzador.getLanzamiento());
		
	}
}
