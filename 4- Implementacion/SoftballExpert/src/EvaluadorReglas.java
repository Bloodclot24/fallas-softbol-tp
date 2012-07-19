import java.io.InputStreamReader;
import java.io.Reader;
import org.drools.RuleBase;
import org.drools.RuleBaseFactory;
import org.drools.WorkingMemory;
import org.drools.compiler.PackageBuilder;
import org.drools.rule.Package; 
	
public class EvaluadorReglas {
	 
	    public String evaluarReglas(Lanzador lanzador) {
	        try {
	            //Cargamos la base de reglas
	            RuleBase ruleBase = leerReglas();
	            WorkingMemory workingMemory = ruleBase.newStatefulSession();
	            workingMemory.insert(lanzador);
	            
	            //Disparamos las reglas de Drools
	            workingMemory.fireAllRules();
	            
	            
	 
	        } catch (Throwable t) {
	            t.printStackTrace();
	        }
	        return lanzador.getLanzamiento();
            
	    }
	 
	    
	    private static RuleBase leerReglas() throws Exception {
	        //Leemos el archivo de reglas (DRL)
	        Reader source = new InputStreamReader(
	            EvaluadorReglas.class.getResourceAsStream("reglasV1.drl"));
	 
	        //Construimos un paquete de reglas
	        PackageBuilder builder = new PackageBuilder();
	 
	        //Parseamos y compilamos las reglas en un único paso
	        builder.addPackageFromDrl(source);
	 
	        // Verificamos el builder para ver si hubo errores
	        if (builder.hasErrors()) {
	            System.out.println(builder.getErrors().toString());
	            throw new RuntimeException(
	                "No se pudo compilar el archivo de reglas.");
	        }
	 
	        //Obtenemos el package de reglas compilado
	        Package pkg = builder.getPackage();
	 
	        //Agregamos el paquete a la base de reglas 
	        //(desplegamos el paquete de reglas).
	        RuleBase ruleBase = RuleBaseFactory.newRuleBase();
	        ruleBase.addPackage(pkg);
	        return ruleBase;
	    }
}

