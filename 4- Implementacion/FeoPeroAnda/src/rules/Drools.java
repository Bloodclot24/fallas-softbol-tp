package rules;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.Resource;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;

public class Drools {

	StatefulKnowledgeSession ksession;

	public Drools(String archivoDrools) {
		KnowledgeBase kbase;
		try {
			kbase = leerBaseDeConocimiento(archivoDrools);
			ksession = kbase.newStatefulKnowledgeSession();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private KnowledgeBase leerBaseDeConocimiento(String archivoDrools)
			throws Exception {

		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		Resource newClassPathResource = ResourceFactory.newClassPathResource(archivoDrools);
		kbuilder.add(newClassPathResource,	ResourceType.DRL);
		KnowledgeBuilderErrors errors = kbuilder.getErrors();

		if (errors.size() > 0){
			for (KnowledgeBuilderError error: errors) {
				System.err.println(error);
			}
			throw new IllegalArgumentException("Error al leer la base de conocimientos.");
		}
		
		KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
		return kbase;
	}

	public void insertarEnBase(Object obj) {
		ksession.insert(obj);
	}

	public void analizarReglas() {
		ksession.fireAllRules();
	}

	public void setVariableGlobal(String nombre, Object obj) {
		ksession.setGlobal(nombre, obj);
	}
}
