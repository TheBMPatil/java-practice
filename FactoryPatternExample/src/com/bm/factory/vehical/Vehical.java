package com.bm.factory.vehical;

import com.bm.factory.Factory;

public abstract class Vehical implements Factory {
	int id;
	String manDate;

	public Vehical() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getManDate() {
		return manDate;
	}

	public void setManDate(String manDate) {
		this.manDate = manDate;
	}

}
