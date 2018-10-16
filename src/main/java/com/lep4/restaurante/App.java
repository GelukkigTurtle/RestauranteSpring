package com.lep4.restaurante;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new GenericXmlApplicationContext("app-context.xml");
    	
    	Orden orden1 =  new Orden(1);
    	Orden orden2 =  new Orden(2);
    	
    	ArrayList<Comida> detalle1 = new ArrayList<Comida>();
    	ArrayList<Comida> detalle2 = new ArrayList<Comida>();

    	Comida bigking = (Comida) context.getBean("bigking");
    	Comida pupusa = (Comida) context.getBean("quesoLoroco");
    	Comida peperoni = (Comida) context.getBean("peperoni");
    	Comida suprema = (Comida) context.getBean("suprema");

    	detalle1.add(bigking);
    	detalle1.add(peperoni);
    	
    	orden1.setDetalle(detalle1);
    	
    	detalle2.add(pupusa);
    	detalle2.add(suprema);
    	
    	orden2.setDetalle(detalle2);
    	
    	System.out.println(orden1);
    	System.out.println(orden2);

    }
}
