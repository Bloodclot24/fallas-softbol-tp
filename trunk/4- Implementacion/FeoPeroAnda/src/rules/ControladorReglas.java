package rules;

import java.util.List;

import lesiones.TipoLesion;

import sintomas.Diagnostico;
import sintomas.Sintoma;

public class ControladorReglas {

	private Diagnostico sintoma;
	
	public ControladorReglas(Diagnostico sintomas) {
		this.sintoma = sintomas;
	}

	/**
	 * Analiza las reglas y determina las posibles lesiones.
	 */
	public String ejecutar(){
		String path = "rules/ReglasSintomas.drl";
		Drools drools = new Drools(path);
		
		//Diagnostico diagnostico = new Diagnostico();
		//drools.setVariableGlobal("lesion", diagnostico);

		//for (Sintoma sintoma : sintomas)
		drools.insertarEnBase(sintoma);
		
		drools.analizarReglas();
		
		return sintoma.getLanzamiento();
	}
}
