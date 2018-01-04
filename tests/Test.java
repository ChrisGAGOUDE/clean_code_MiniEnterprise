package tests;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import app.Activite;
import app.Day;
import app.Factory;
import app.ListActivities;
import app.Output;
import app.Ouvrier;
import app.Robot;
import app.Task;
import tools.Employee;
import tools.IActivite;
import tools.IDay;
import tools.ITask;

public class Test {

	public static void main(String[] args) {
		IActivite Work = new Activite("Work");
		IActivite Eat = new Activite("Eat");
		IActivite Sleep = new Activite("Sleep");
		IActivite Other = new Activite("Other");
		
		Employee Peter = new Ouvrier("Peter");
		Employee R2D2 = new Robot("R2D2");
		
		ITask task1 = new Task("Task1");
		IDay day = new Day("2016-12-24");

		Factory factory = new Factory();
		boolean res = factory.affectPost(Peter, task1);
		if(res) {
			System.out.println(Peter.getName()+" est affecté depuis le "+day.getDay()+" au poste de "+task1.getName());
			factory.createActivity(Peter, Work);
		}
		
		ListActivities listActivities = new ListActivities(Peter, Work, 9, 12);
		ListActivities listActivities2 = new ListActivities(Peter, Eat, 13, 17);
		ListActivities listActivities3 = new ListActivities(Peter, Other, 17, 22);
		ListActivities listActivities4 = new ListActivities(Peter, Sleep, 22, 8);
		ListActivities listActivities5 = new ListActivities(Peter, Work, 9, 12, day);
		
		
		List<ListActivities> list = new ArrayList<ListActivities>();
		list.add(listActivities);
		list.add(listActivities2);
		list.add(listActivities3);
		list.add(listActivities4);
		list.add(listActivities5);
		
		for(ListActivities activite : list){
			activite.affiche();
		}
		
		R2D2.Standby(17, 9);
		
		
		Output output = new Output(list);
		//output.output(list);
		
		
		
	}

}
