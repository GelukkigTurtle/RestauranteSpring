package com.lep4.restaurante;

import java.util.List;

public class Orden {
	
	private List<Comida> detalle;
	private int numero;
	


	public Orden(int numero) {
		super();
		this.numero = numero;
	}

	public Orden(List<Comida> detalle) {
		super();
		this.detalle = detalle;
	}

	public List<Comida> getDetalle() {
		return detalle;
	}

	public void setDetalle(List<Comida> detalle) {
		this.detalle = detalle;
	}
	
	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		String valor = "Detalle de la Orden ---> "+ numero +"\n";
		for(Comida c : detalle) {
			valor = valor + "\t #"+ c + "\n";
		}
			
		return valor;
	}
	
	
	
	
	
}
