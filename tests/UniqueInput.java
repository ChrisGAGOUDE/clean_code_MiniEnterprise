package tests;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UniqueInput {
	
	public static String getLocalDate(){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate localDate = LocalDate.now();
		return dtf.format(localDate);
	}
	
	public static void main(String[] args) {

		String command="";
		String task="";
		String nameEmployee="";
		String activity="";
		String startHour="";
		String endHour="";
		String day="";
		
		
		if(args.length==7){
				if(args[1] == "activity"){
					task = args[1];
					nameEmployee = args[2];
					activity = args[3];
					startHour = args[4];
					endHour = args[5];
					day = args[6];
				}else if(args[0] == "robot"){
					task = args[1];
					nameEmployee = args[2];
					activity = args[3];
					startHour = args[4];
					endHour = args[5];
					day = getLocalDate();
				}
		}
		
		/*
		  Pattern pattern = Pattern.compile(args[1]);
		 Matcher matcher = pattern.matcher("");
		System.out.println(args[0]);
	*/
	}

}
