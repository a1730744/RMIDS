// @author faisal001
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author faisal001
 */
public class RMICalculatorClient {
    public static void main(String args[]){
      
       RMICalculatorClient c=new RMICalculatorClient();
       c.connectServer();
        }
    
   private void connectServer(){
   try
   {
      Registry reg=LocateRegistry.getRegistry("localhost",1022);
      CalculatorImplementionInterface a=(CalculatorImplementionInterface) reg.lookup("server");
     // Scanner number1= new Scanner(System.in);
   //   number1.nextInt();      
  //    Scanner number2= new Scanner(System.in);
   //   number2.nextInt();
      System.out.println("THE LCM IS:"+a.lcm(12,8));
      System.out.println("THE GCD IS:"+a.gcd(12,8));
      System.out.println("THE MIN NUMBER:"+Math.min(12,8)); 
      System.out.println("THE MIN NUMBER:"+Math.max(12,8));
       
      
      
         }
   catch(Exception e)
   {
       System.out.println(e);
       
   }
   } 
   
    }
