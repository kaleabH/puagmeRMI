import java.rmi.*;
import java.util.Scanner;
public class Puagme_Client {

	public static void main(String args[]) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("client has started ...");
			System.out.println("************************************************************");
			System.out.println("*               PUAGME DAYS COUNT FINDER                   *");
			System.out.println("* tells the amount of days found in the ethiopian month of *");
			System.out.println("* puagme for a given year. (start year is 2011 E.C)        *");
			System.out.println("*                      CLIENT                              *");
			System.out.println("************************************************************");
		Puagme_Interface stubYear=(Puagme_Interface)Naming.lookup("rmi://localhost:5000/puagme"); 
//		System.out.print(stubYear.getNumberOfDays());
		String choice = new String();
		while(!choice.equalsIgnoreCase("exit")) {
			System.out.println("enter a 'enter' to enter year");
			System.out.println("enter a 'year' to get the year entered");
			System.out.println("enter a 'days' to get the number of days on puagme of year entered");
			System.out.println("enter a 'exit' to enter year");
			choice = scan.next();
			if(!choice.equalsIgnoreCase("exit")) {
			switch(choice) {
			case "enter":
				stubYear.setYear(scan.nextInt());
				break;
			case "year":
				System.out.printf("the year :- %d \n \n",stubYear.getYear());
				break;
			case "days": 
				System.out.printf("the amount days is :- %d \n \n",stubYear.getNumberOfDays());
				break;
			default:
				System.out.println("enter a correct prompt");
				break;
			}
			}
			else {
				
				System.out.println("program exited !!");
				scan.close();
			}
		}
		}
		catch(Exception e) {
      System.out.print(e);
		}
	}

}
