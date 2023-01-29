import java.rmi.*;
import java.rmi.server.*;  

public class Puagme extends UnicastRemoteObject implements Puagme_Interface {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int currentYear;
	private static final int REFERENCE_YEAR = 2011;
	private int numberOfDays;
	public void setYear(int current_year){
		if(current_year>0000 && current_year<9999 && (int)current_year==current_year) {
			currentYear = current_year;
		}
		else {
			System.out.print("please enter a proper year");
		}
	}
	private void setNumberOfDays(){
		if(currentYear % REFERENCE_YEAR == 4 || REFERENCE_YEAR % currentYear == 4)
			numberOfDays = 6;
		else numberOfDays = 5;
		
	}
	public int getYear() throws RemoteException{
		return currentYear;
	}
	public int getNumberOfDays() {
		setNumberOfDays();
		return numberOfDays;
	}
	public Puagme(int current_year) throws RemoteException{
		super();
		currentYear = current_year;
		
	}

}
