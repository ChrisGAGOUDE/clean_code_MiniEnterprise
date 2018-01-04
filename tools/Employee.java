package tools;

public abstract class Employee {
	protected String name;
	ITask task;
	IDay day;
	
	public abstract void Standby(int x, int y);
	
	public void Work(int x, int y) {		
		System.out.println(name + " a travaillé de "+x+"h"+" à "+y+"h");
	}

	public void Eat(int x, int y) {
		System.out.println(name + " a mangé de "+x+"h"+" à "+y+"h");
	}	

	public void Other(int x, int y) {
		System.out.println(name + " a fais autre chose de "+x+"h"+" à "+y+"h");
	}
	public String getName() {
		return name;
	}

}
