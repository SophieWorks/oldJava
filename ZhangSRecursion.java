/**
 * @author sophie zhang
 * @version 1.1 
 * @date 2018/11/01
 * @description Calls and runs different recursive methods 
 */
public class ZhangSRecursion {

	
	//start of Square Method
	public static int Square(int n) {
		if (n == 1) {
			return 1;//base case
		} else {
			return Square(n-1) + 2*n -1;//calls itself
		}//end of if/else
	}//end of Square method 
	
	
	//start of Cube Method
	public static int Cube(int n) {
		if(n==1) {
		return 1; //base case
		} else {
			return Cube(n-1) + (3*Square(n)) - 3*n + 1;//calls itself and square method
		}//end of if/else
	}//end of Cube method 
	
	
	//start of Factorial Method
	public static int Factorial(int n) {
		if (n == 1) {
			return 1;//base case
		}
		return n*Factorial(n-1);//calls itself
	}//end of Factorial Method

	
}//end of class
