/**
 * @author Sophie
 * @date 2018/10/26
 * @version 1.0 2018/10/26
 * @description In this code i am going to use my knowledge from recursion to make a snow flake image with changing colours and changing background
 *
 */
import java.awt.*;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.Timer;


public class ZhangSRecursiveSnowflake extends JComponent {

	public static JFrame window = new JFrame();
	public static Timer timer = new Timer();//timer to cahnge background colour
	public static int X = ((int) (1+ (Math.random()*450))); //Random starting X
	public static int Y = ((int) (1+ (Math.random()*350))); //Random starting Y
	public static int size = ((int) (1+ (Math.random()*100))); //Random size
	public static int Red = ((int) (1+ (Math.random()*255))); //Random Red value 
	public static int Blue = ((int) (1+ (Math.random()*255))); //Random Blue value
	public static int Yellow = ((int) (1+ (Math.random()*255))); //Random Yellow value 
	static Graphics graph; //Graphics class


	//start of drawStar method
	private void drawStar( int x, int y, int size )  {
		if (size < 1) {
			return;
		}//end of if    
		// Six lines radiating from (x,y)

		for (int i = 1; i <= 7; i++) {
			int endX = (int) (x + (size * Math.cos((2 * Math.PI / 7) * i))); //Finding our endX value
			int endY = (int) (y - (size * Math.sin((2 * Math.PI / 7) * i))); //Finding our endY value
			//System.out.println("1 " +x + " 2 " + y + " 3 " + endX + " 4 " + endY);
			graph.drawLine(x, y ,endX, endY); //drawing another line off the previous line 
			drawStar(endX, endY, size/4);//calling draw star again but using the end position and the new starting position
		}//end of for loop

	}//end of drawStar method


	//start of paint method
	//colors the background
	public void paint(Graphics g) {
		int length = window.getHeight();
		int width = window.getWidth();
		graph = g;
		
		try{ //start of try and catch for timer
			Thread.sleep(1500);  //time in millseconds 
			
			g.setColor(new Color(Red,Blue,Yellow)); //Create a new random color
			g.fillRect( 0, 0, width, length);//background size
			
			this.repaint(); //this method will call the paint method after each time the Thread counts the seconds
		} catch (InterruptedException ex)    {
			// do nothing
		}//end of try/catch

	
		for (int i = 0; i < 20; i++) {
			X = (int) (1+ (Math.random()*length)); //Random X
			Y = (int) (1+ (Math.random()*width)); //Random Y
			size = (int) (30+ (Math.random()*150)); //Random size
			Red = ((int) (1+ (Math.random()*255))); //Random red
			Blue = ((int) (1+ (Math.random()*255))); //Random blue 
			Yellow = ((int) (1+ (Math.random()*255))); //Random yellow 
			g.setColor(new Color(Red,Blue,Yellow)); //create a new color
			drawStar(X,Y,size); //call drawStar method
		}//end of for loop

	}//end of paint method


	//start of main method
	public static void main(String[] a) {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(30, 30, 600, 400);
		window.getContentPane().add(new ZhangSRecursiveSnowflake());
		window.setVisible(true);

	}//end of main Method


}//end of class
