package com.lep4.restaurante;

public class Hamburguesa  extends Comida{
	
	private String tipoCarne;

	public Hamburguesa() {
		super();
	}

	public Hamburguesa(String nombre, double precio) {
		super(nombre, precio);
	}

	public String getTipoCarne() {
		return tipoCarne;
	}

	public void setTipoCarne(String tipoCarne) {
		this.tipoCarne = tipoCarne;
	}
	
}
