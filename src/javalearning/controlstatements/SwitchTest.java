package javalearning.controlstatements;

public class SwitchTest {

	public static void main(String[] args) {
		
		int month = 12;
		String monthString;
		
		switch(month) {
		
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "February";
			break;
		case 3:
			monthString = "March";
			break;
		case 4:
			monthString = "April";
			break;
		case 5:
			monthString = "May";
			break;
		case 6:
			monthString = "June";
			break;
		case 7:
			monthString = "July";
			break;
		case 8:
			monthString = "August";
			break;
		case 9:
			monthString = "Septembor";
			break;
		case 10:
			monthString = "Octobor";
			break;
		case 11:
			monthString = "Nov";
			break;
		case 12:
			monthString = "Dec";
			break;
		default:
			monthString = "Invalid Month";
		}
		System.out.println(monthString);
	}

}
