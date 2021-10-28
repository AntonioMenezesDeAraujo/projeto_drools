package com.binod.DroolsComplexRule;

import org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DroolTest {

	public static void main(String[] args) {
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession("first-ksession-rule");

		Resutado resultado = new Resutado();


		kSession.insert(new Store("teste 1", "Ceara"));
		kSession.insert(new Store("teste 2", "Piaui"));
		kSession.insert(new Store("teste 3", "Amazonas"));
		kSession.insert(new Store("teste 13", "Ceara"));
		kSession.insert(new Store("teste 13", "Ceara"));
		kSession.insert(resultado);


		kSession.fireAllRules();
		Set<String> keySet =resultado.getResultado().keySet();
		for( String key : keySet) {
			System.out.println("Estado: " + key);
			for(Store store : resultado.getResultado().get(key)) {
				System.out.println("\t >> " + store.getName());
			}
		}

	}
}
