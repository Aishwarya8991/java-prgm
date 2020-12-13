
public class FindingIfNoIsEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 89;
		findingEven(num1);
		
		int num2 = 56;
		findingEven(num2);
		
		int num3=1987;
		findingEven(num3);
	}
          static void findingEven(int num) {
		  if(num % 2 == 0) {
			 System.out.println("the number is even" );
			  }
		 else{
			 System.out.println("the number is odd");
			 }
	}
}
