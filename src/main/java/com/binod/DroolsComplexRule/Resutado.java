package com.binod.DroolsComplexRule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Resutado {
	private Map<String, ArrayList<Store>> resultado = new HashMap<String, ArrayList<Store>>();

	public Map<String, ArrayList<Store>> getResultado() {
		return resultado;
	}

	public void setResultado(Map<String, ArrayList<Store>> resultado) {
		this.resultado = resultado;
	}

}
