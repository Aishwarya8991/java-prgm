
public class SumOfDigits {

	public static void main(String[] args ) {
	           int number =34578;
	          int  Lastdigit=number;
	          int  Firstdigit=number;
	          
	          while(Lastdigit>=10)
	          {
	        	   
	        	   Lastdigit=Lastdigit/10;
	           
	        	   while(Lastdigit>=10) {
	        	  
	        	   Lastdigit=Lastdigit%10;
	        }
	        	   System.out.println("The second last digit is :"  +  Lastdigit);
	     }
	            
	           while(Firstdigit>=10) {
	        	   Firstdigit=Firstdigit/10;
	        	   System.out.println("The first digit is :" +Firstdigit);
	           
	             }
	           int Sum = Firstdigit+ Lastdigit;
	           System.out.println("The sum of first and second last digit is:" + Sum);
	           
	           }
}
