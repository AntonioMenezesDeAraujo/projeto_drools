package com.binod.DroolsComplexRule;

import java.util.ArrayList;

public class Container {

	private ArrayList<Store> listStore = new ArrayList<Store>();
	private ShowCase showCase;

	public ArrayList<Store> getListStore() {
		return listStore;
	}

	public void setListStore(ArrayList<Store> listStore) {
		this.listStore = listStore;
	}

	public ShowCase getShowCase() {
		return showCase;
	}

	public void setShowCase(ShowCase showCase) {
		this.showCase = showCase;
	}

}
