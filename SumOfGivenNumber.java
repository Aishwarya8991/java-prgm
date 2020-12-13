
public class SumOfGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int num=453, sum=0;
		 System.out.println("enter the number");
		 
		 while(num!=0)
		 {
			 sum+=num%10;
			 num/=10;
			 
			 
		 }
		 System.out.println("sum of digits of number is "  +sum);

	}

}
