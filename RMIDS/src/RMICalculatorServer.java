// @author faisal001
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Stack;

/**
 *
 * @author faisal001
 */
public abstract  class RMICalculatorServer extends UnicastRemoteObject implements CalculatorImplementionInterface{
  
    public RMICalculatorServer()throws RemoteException{
           super();
    
       }  
       
    
    //bmnbm
  
  /*  @Override
    public int minimumnum(int a,int b)throws RemoteException{
     int resualt;
     resualt=Math.min(a,b);
        return resualt;
    }
    
    public int maximum(int a,int b)throws RemoteException{
        int resualt;
        resualt=Math.max(a, b);
        return resualt;
    }
    */
            /* gcd function*/
       
       
       
    public  int gcd(int a, int b)throws RemoteException{
           int gcd=1;
            for(int i = 1; i <= a && i <= b; i++){  
           //returns true if both conditions are satisfied   
           if(a%i==0 && b%i==0)  
           //storing the variable i in the variable gcd  
            gcd = i;
            }  
           return gcd;
           }  
       //
    @Override
        public int lcm(int a, int b)throws RemoteException{
            
           return (a*b) / gcd(a,b);        
                }        
        
        ////
        
     public static void main(String args[])throws RemoteException
     {
        try {
          Registry reg = LocateRegistry.createRegistry(1022);
          reg.rebind("server",new RMICalculatorServer(){});
          System.out.println("Server is started.");
       }
         catch (Exception e)
       {
           System.out.println(e);
       }
  }
}