
public class FindNoPosOrNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = -67;
		findNoPosOrNeg(num1);
		
		int num2 = 987;
		findNoPosOrNeg(num2);
		
		int num3 = 26;
		findNoPosOrNeg(num3);
		}
		
		static void findNoPosOrNeg(int num) {
		if(num>0) {
			System.out.println("The number is positive");
		}
		else {
			System.out.println("The number is negative");
		}
     }
}
