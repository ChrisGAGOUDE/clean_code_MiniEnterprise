package app;

import tools.Employee;

public class Robot extends Employee{
	
	public Robot(String name){
		this.name = name;
	}
	@Override
	public void Standby(int x, int y) {
		System.out.println( name + " s'est rechargé de "+x+"h"+" à "+y+"h");
	}

}
