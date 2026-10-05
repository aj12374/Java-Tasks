package ExceptionATM;
import java.util.*;

public class ATM {
	
		public static void main(String[] args) {
		    int amount= 5000;
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter your with Draw Amount");
		    int with_draw = sc.nextInt();
		    try{
		        if(amount>with_draw){
		            System.out.println("amount with draw successful");
		        }
		        throw new Exception("Low Balance");
		    }
		    catch( Exception e){
		        System.out.println(e);
		    }
		}
	

}
