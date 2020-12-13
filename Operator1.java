
public class Operator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int a=34;
			int b=21;
			int c=a++ + ++b;
			System.out.println(" the value of C :" + c);
			int d= --a + --b + c--;
			System.out.println(" the value of D :" + d);
			
			int e= a + +b + +c + d--;
			System.out.println(" the value of E :" + e);
			int f= -a + b-- + -c - d++;
			System.out.println(" the value of F :" + f );
			int sum= a+b+c+d+e+f;
			System.out.println("sum = " +sum);
	}

}
