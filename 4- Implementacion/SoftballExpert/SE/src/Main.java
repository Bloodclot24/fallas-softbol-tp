import com.drools.EvaluadorReglas;
import com.drools.Lanzador;


public class Main {

	public static void main(String[] args) {
		EvaluadorReglas ev = new EvaluadorReglas();
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
