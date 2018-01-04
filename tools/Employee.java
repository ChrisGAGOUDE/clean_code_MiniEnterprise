package tools;

public abstract class Employee {
	protected String name;
	ITask task;
	IDay day;
	
	public abstract void Standby(int x, int y);
	
	public void Work(int x, int y) {		
		System.out.println(name + " a travaill� de "+x+"h"+" � "+y+"h");
	}

	public void Eat(int x, int y) {
		System.out.println(name + " a mang� de "+x+"h"+" � "+y+"h");
	}	

	public void Other(int x, int y) {
		System.out.println(name + " a fais autre chose de "+x+"h"+" � "+y+"h");
	}
	public String getName() {
		return name;
	}

}
