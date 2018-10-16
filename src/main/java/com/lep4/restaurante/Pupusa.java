package com.lep4.restaurante;

import java.util.List;

public class Pupusa extends Comida{
	
	private String tipoDeMasa; //arroz o maiz
	
	private List<String> extras;

	public Pupusa() {
		super();
	}

	public Pupusa(String nombre, double precio) {
		super(nombre, precio);
	}

	public String getTipoDeMasa() {
		return tipoDeMasa;
	}

	public void setTipoDeMasa(String tipoDeMasa) {
		this.tipoDeMasa = tipoDeMasa;
	}

	public List<String> getExtras() {
		return extras;
	}

	public void setExtras(List<String> extras) {
		this.extras = extras;
	}

	@Override
	public String toString() {
		String valor = super.toString();
		valor = valor + "; extras:";
		for(String e : extras) {
			valor = valor + " " + e + "," ;
		}
		return valor;
		
	}
	
	
	

	

}
