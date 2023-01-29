import java.rmi.*;
import java.util.Scanner;  
//import java.rmi.registry.*;  
public class Puagme_Server {

	public static void  main(String args[]) throws RemoteException{
		try {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("server is starting ...");
			
			System.out.println("************************************************************");
			System.out.println("*               PUAGME DAYS COUNT FINDER                   *");
			System.out.println("* tells the amount of days found in the ethiopian month of *");
			System.out.println("* puagme for a given year. (start year is 2011 E.C)        *");
			System.out.println("*                      SERVER                              *");
			System.out.println("************************************************************");
			
		Puagme_Interface stubYear = new Puagme(2011);
		
		Naming.rebind("rmi://localhost:5000/puagme",stubYear);  

//		System.out.printf("the amount days is :- %d",stubYear.getNumberOfDays());
//		
//		stubYear.setYear(2015);
//		System.out.println();
//		System.out.printf("the amount days is :- %d",stubYear.getNumberOfDays());
//		System.out.printf("the year :- %d",stubYear.getYear());
		
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
