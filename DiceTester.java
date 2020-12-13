
public class DiceTester {

	public static void main(String[] args) {
		
		
		Dice square = new Dice();
		square.shape = "rectangle";
		square.color = "blue";
		square.NoOfSides = 12;
		square.NoOfCorners=8;
		square.NoOfFaces=6;
		
		System.out.println("shape of dice :" +square.shape);
		System.out.println("color of dice :" + square.color);
		System.out.println("no of sides od dice :" +square.NoOfSides);
		System.out.println("no of corners of dice:" +square.NoOfCorners);
		System.out.println(" no of faces of dice:" +square.NoOfFaces);
		
				
				
				
		

	}

}
