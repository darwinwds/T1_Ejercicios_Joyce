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
public class NonMetalElement extends Element{
    public NonMetalElement(String s, Integer num, Double m) {
		super(s, num, m);

	}

	
	public void describeElement() {
	
		System.out.println( " \n Element Symbol : \t " + getSymbol() );
		System.out.println( " Atomic Number : \t " + getAtomicNumber() );
		System.out.println( " Atomic Weight : \t " + getAtomicWeight() );
		System.out.println( " Is Poor Electricity Conductor. ");
		
	}
    
}
