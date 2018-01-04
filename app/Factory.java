package app;
import tools.IActivite;
import tools.Employee;
import tools.IDay;
import tools.ITask;

public class Factory{
	Employee employee;
	ITask task;
	IActivite activity;
	
	
	public boolean affectPost(Employee employee, ITask task){
		this.employee = employee;
		this.task = task;
		//System.out.println(employee.getName()+" est affect� depuis le "+day.getDay()+" au poste de "+task.getName());
		return true;
	}
	
	public void createActivity(Employee employee, IActivite activity){
		//if()
		this.employee = employee;
		this.activity = activity;
		System.out.println("L'activit� ("+this.activity.getNameActivity()+") cr��e pour "+employee.getName());
	}
}
