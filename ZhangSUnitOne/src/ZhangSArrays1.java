/*
 * @version 1.00 2018/09/12
 * @author Sophie
 */
import java.lang.reflect.Array;
import java.util.Scanner;

public class ZhangSArrays1 {//start of class

	//
	private static int [] a = new int [10]; //an array of 10 integers


	public static int[] InitalizeArray(int[] array1,int num) {
		for(int i = 0; i<array1.length;i ++) {
			array1 [i] = num;
		}//end of for loop
		return (array1);
	}//end of fillArray method

	public static void ShowArray(int[] array1) {
		for(int l = 0; l<array1.length;l ++) {
			System.out.print(array1[l] + " " );
				}//end of for loop
		System.out.println();
	}//end of ShowArray method
	
	public static int[] EnterFromKeyboard(int[] array1) {
		System.out.println("Enter your 10 intergers");
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0;i<a.length;i ++) {
			array1[i]=sc.nextInt();
			
		}//end of for loop
		return array1;
	}//end of EnterFromKeyboard method
	
	//start of Sum method
	public static int Sum(int[] add) {
		int sum = 0;
		for (int i = 0; i<add.length;i ++) {
			sum+=add[i];
		}//end of for loop in the Sum method
	System.out.println("The Sum is:" + total);
	}// end of Sum method
	
	//start of Average method
	public static double Average(double[] a) {
		int averagesum = 0;
		for (int i = 0; i<add.length;i ++) {
			averagesum+=a[i];
		}//end of for loop
		double average = averagesum/a.length;			
		System.out.println("The average is:" + average);
	}//end of Average 
	
	
	//start of main Method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EnterFromKeyboard(a);
		ShowArray(a);
		

	}//end of main method

}//end of class