package com.lep4.restaurante;

public class Pizza extends Comida{
	
	private int porciones;
	private String tipoMasa;
	
	public Pizza() {
		super();
	}
	public Pizza(String nombre, double precio) {
		super(nombre, precio);
	}
	public int getPorciones() {
		return porciones;
	}
	public void setPorciones(int porciones) {
		this.porciones = porciones;
	}
	public String getTipoMasa() {
		return tipoMasa;
	}
	public void setTipoMasa(String tipoMasa) {
		this.tipoMasa = tipoMasa;
	}
	
	
	
	

}
