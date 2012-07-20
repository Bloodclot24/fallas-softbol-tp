package drools;
import com.drools.*;

import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;
import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.definition.KnowledgePackage;
import org.drools.io.Resource;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;

public class EV {
	
		private static KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();

	    private static Collection<KnowledgePackage> pkgs;
	    private static KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
	    private static StatefulKnowledgeSession ksession;
	 
	 public String evaluarReglas(Lanzador lanzador) {
	        try {
	            //Cargamos la base de reglas
	            
	        	leerReglas();
	        	ksession.insert(lanzador);
	            ksession.fireAllRules();
	        } catch (Throwable t) {
	            t.printStackTrace();
	        }
	        return lanzador.getLanzamiento();
         
	    }
	 
	    
	    private static void leerReglas() throws Exception {
	    	kbuilder.add( ResourceFactory.newClassPathResource( "/drools/reglasV1.drl",EV.class),ResourceType.DRL );
	    	pkgs = kbuilder.getKnowledgePackages();
	    	kbase.addKnowledgePackages( pkgs );
	    	ksession = kbase.newStatefulKnowledgeSession();
	    
	    }
}