/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_capitulo11;

/**
 *
 * @author Darwin W. Diaz Simon
 */
public class WeekendSubscriber extends NewspaperSubscriber{
    private Double costo;
	private Subscription sub;
	
	public WeekendSubscriber() {
		
		setRate(2.00);
		
	}
	

	public Subscription getSub() {
		return sub;
	}


	public void setSub(Subscription sub) {
		this.sub = sub;
	}


	@Override
	public String toString() {
	
		return " Direccion : " + getDireccion() + " Cuota : $ " + costo + " \n Tipo de Servicio : " + sub + " \n "; 
	}



	@Override
	public void setRate(Double cost) {
		costo = cost;
		
	}
    
}
