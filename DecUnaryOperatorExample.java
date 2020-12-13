
public class DecUnaryOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("illustrating DecUnaryOperation");
			
			int a= 10;
			int preDecNum = --a;
			
			System.out.println("value of preDecNum is :"+ preDecNum);
			
			int b= 5;
			int postDecNum = b--;
			
			System.out.println("value of postDecNum is :"+ postDecNum);
			System.out.println("value of  b is :" + b);
			 int i=10 , j= 5, k= 6;
			int result = i++ - --j + i-- +  ++k - ++i;
			System.out.println("value of  result is :" + result);

	}

}
