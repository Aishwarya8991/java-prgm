
public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1= 9;
		primeNo(num1);
		
		int num2 = 4;
		primeNo(num2);
		
		int num3 = 79;
		primeNo(num3);

	    
		
		
	
		}
		 static  void primeNo(int num) {
			 boolean flag = false;
			for(int i = 2; i <= num/2; ++i) {
				if(num % i == 0) {
                   flag = true; 
                   break;
				}
			}
		
		if(!flag) {
			System.out.println(num+ " is a prime number.");
		}else {
			System.out.println(num + " is not a prime number");
		}
				
	}
}


