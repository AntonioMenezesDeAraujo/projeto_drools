package com.binod.DroolsComplexRule;

public class Store {

	private String name;
	private String state;

	public Store(String name, String state) {
		super();
		this.name = name;
		this.state = state;
	}

	public void exibeTexto(String algumTexto) {
		long hora = System.currentTimeMillis();

		System.out.println("hora = " + hora + " - " + algumTexto);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Store [name=" + name + ", state=" + state + "]";
	}

	
}
