package rules;

import lanzamientos.Lanzamiento;

public class ControladorReglas {

	private Lanzamiento lanzamiento;
	
	public ControladorReglas(Lanzamiento lanzamiento) {
		this.lanzamiento = lanzamiento;
	}

	/**
	 * Analiza las reglas y determina las posibles lesiones.
	 */
	public String ejecutar(){
		String path = "rules/ReglasTipoLanzamiento.drl";
		Drools drools = new Drools(path);
		
		//Diagnostico diagnostico = new Diagnostico();
		//drools.setVariableGlobal("lesion", diagnostico);

		//for (Sintoma sintoma : sintomas)
		drools.insertarEnBase(lanzamiento);
		
		drools.analizarReglas();
		
		return lanzamiento.getLanzamiento();
	}
}
