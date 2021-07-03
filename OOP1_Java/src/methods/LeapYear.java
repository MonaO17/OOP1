package methods;

public class LeapYear {

	public static void main(String[] args) {
		//variables
		int year=2021;

		//call method
		System.out.println(year+" is leap year is: "+isLeapYear(year));

	}

	public static boolean isLeapYear (int year) {
		boolean leapYear=false;

		if(year%4==0 || year%4==0 && year%100!=0 || year%4==0 && year%100==0 && year%400==0) {
			leapYear=true;
		}else {
			leapYear=true;
		}

		return leapYear;
	}

}
