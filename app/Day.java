package app;

import tools.IDay;

public class Day implements IDay{
	private String day;
	
	public Day(String day){
		this.day = day;
	}
	@Override
	public void setDay(String day) {
		this.day = day;
	}
	@Override
	public String getDay() {
		// TODO Auto-generated method stub
		return this.day;
	}
	
}
