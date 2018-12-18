package gms;

public class MyCalendar {
	public String leapYear(String year) {
		String y = "";
		int ly = Integer.parseInt(year);
		switch ("1") {
		case "1":y = "1월 31일\n";
		case "2":
			if(ly%4 == 0 && ly%100 != 0 || ly%400 == 0) {
				y += "2월 29일(윤년)\n";
			}else {
				y += "2월 28(평년)\n";
			}
		case "3":y += "3월 31일\n";
		case "4":y += "4월 30일\n";
		case "5":y += "5월 31일\n";
		case "6":y += "6월 30일\n";
		case "7":y += "7월 31일\n";
		case "8":y += "8월 31일\n";
		case "9":y += "9월 30일\n";
		case "10":y += "10월 31일\n";
		case "11":y += "11월 30일\n";
		case "12":y += "12월 31일\n";
			
			break;
		}
		return y;
	}

}
