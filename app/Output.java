package app;

import java.io.*;
import java.util.List;

public class Output {
	
	private List<ListActivities> list;
	String result;
	File file;
	FileWriter writer;
	
	public Output(List<ListActivities> list){
		this.list = list;
	}
	public void output(List<ListActivities> list){
		
		for(ListActivities activite : list){
			try {
					file = new File("file.log");
					writer.write(activite.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
