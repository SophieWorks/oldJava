	import java.util.Random;
//to test out code 
public class MethodsTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		long number = (long) Math.floor(Math.random() * 9000000000L) + 1000000000L;		
//	System.out.println(number);
		String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random r = new Random();
		
		for (int i = 0; i < 50; i++) {
		      System.out.println(alphabet.charAt(r.nextInt(alphabet.length())));
		} // prints 50 random 
		
}//end of main method
	}//end of class
