package controller;

import lanzamientos.Lanzamiento;
import rules.ControladorReglas;

public class Main {

	public static void main(String[] args) {

		Lanzamiento lanzador = new Lanzamiento();
		lanzador.setDistPeso("Medio");
		lanzador.setPies("NoAlineado");
		lanzador.setSoltadoPelota("Medio");
		lanzador.setMovMunieca("Medio");
		lanzador.setTraza("Recta");
		lanzador.setVelocidad("Alta");
		
		ControladorReglas reglas = new ControladorReglas(lanzador);
		reglas.ejecutar();
		
		System.out.println("Resultado Esperado : Fastball Resultado Obtenido: "+ lanzador.getLanzamiento());
	}
}
