/**
 *
 * @author faisal001
 */
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculatorImplementionInterface extends Remote {
   public  int gcd(int a, int b)throws RemoteException;
   public int lcm(int a, int b)throws RemoteException;
  // public int minimumnum(int a,int b)throws RemoteException; 
   // public int maximumnum(int a,int b)throws RemoteException; 
      
}