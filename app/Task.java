package app;

import tools.Employee;
import tools.ITask;

public class Task implements ITask{
	Employee ouvier;
	
	private String name;
	
	public Task(String name){
		this.name = name;
	}
	
	
	
	@Override
	public void affectTask(Employee ouvrier, String day) {
		// TODO Auto-generated method stub
		 System.out.println(ouvrier.getName()+"est affecté depuis le "+day);
	}



	public String getName() {
		return name;
	}

}
