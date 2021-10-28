package com.binod.DroolsComplexRule;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DroolTest {

	public static void main(String[] args) {
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession("first-ksession-rule");
		
//		PaymentOffer paymentOffer = new PaymentOffer();
//		paymentOffer.setChannel("paytm");
//		paymentOffer.setFestival("xmas");
//		paymentOffer.setFirstTimeCustomer(true);
		
		//Store store = new Store("teste 1", "Ceara");
		
		//FactHandle factHandler;
		
		Resutado resultado = new Resutado();
		Container container = new Container();
		
		Map<String, ArrayList<Store>> lista = new HashMap<String, ArrayList<Store>>();
		
//		kSession.setGlobal("tests2", lista);

		kSession.insert(new Store("teste 1", "Ceara"));
		kSession.insert(new Store("teste 2", "Piaui"));
		kSession.insert(new Store("teste 3", "Amazonas"));
		kSession.insert(new Store("teste 13", "Ceara"));
		kSession.insert(new Store("teste 13", "Ceara"));
		kSession.insert(resultado);
//		container.getListStore().add(new Store("teste 1", "Ceara"));
//		container.getListStore().add(new Store("teste 2", "Piaui"));
//		container.getListStore().add(new Store("teste 3", "Amazonas"));
//		container.getListStore().add(new Store("teste 13", "Ceara"));
//		container.getListStore().add(new Store("teste 13", "Ceara"));
//		kSession.insert(container);
		
//		kSession.insert(container);
		
		
		kSession.fireAllRules();
		
		System.out.println("rsultado : " + resultado);
		//System.out.println("The cashback for this payment channel VIA KIE " + paymentOffer.getDiscount());
	}
}
