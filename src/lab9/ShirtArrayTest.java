package lab9;

public class ShirtArrayTest {
	

	 public static void main (String args[]) {	
	
	Shirt[] shirt=new Shirt[3];
	shirt[0] =new Shirt (1, "description", 'U', 30.5d, 20);
	shirt[1] =new Shirt (2, "description", 'W', 45.5d, 15);		
	shirt[2] =new Shirt (3, "description", 'G', 39.5d, 10);
	 for (int i = 0; i <3; i++) {
		 shirt[i].display();
	 }
	 }
}
