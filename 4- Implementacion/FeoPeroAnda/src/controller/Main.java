package controller;

import java.util.ArrayList;
import java.util.List;



import rules.ControladorReglas;
import sintomas.Diagnostico;

public class Main {

	public static void main(String[] args) {
/*
		List<Sintoma> sintomas = new ArrayList<Sintoma>();
		
		sintomas.add(new Dolor(Sintoma.Valor.ALTO));
		sintomas.add(new Ruido(Sintoma.Valor.CRUJIENTE));
		sintomas.add(new Zona(Sintoma.Valor.ANTERIOR));
		sintomas.add(new Rigidez(Sintoma.Valor.MEDIO));
		sintomas.add(new Estabilidad(Sintoma.Valor.BAJO));
		sintomas.add(new Inflamacion(Sintoma.Valor.ALTO));
		*/
		Diagnostico lanzador = new Diagnostico();
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
