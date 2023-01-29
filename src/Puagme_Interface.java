import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Puagme_Interface extends Remote {
   public int getYear() throws RemoteException;
   public void setYear(int currentYear) throws RemoteException;
   public int getNumberOfDays() throws RemoteException;
}
