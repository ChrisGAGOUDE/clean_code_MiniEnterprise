package app;

import tools.Employee;

public class Ouvrier extends Employee{

	public Ouvrier(String name){
		this.name = name;
	}
	@Override
	public void Standby(int x, int y) {
		System.out.println( name + " s'est repos� de "+x+"h"+" � "+y+"h");
	}
	
}
