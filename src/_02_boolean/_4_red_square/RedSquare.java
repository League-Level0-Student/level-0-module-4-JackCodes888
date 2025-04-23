package _02_boolean._4_red_square;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
import javax.swing.JOptionPane;
public class RedSquare {
	
	static boolean drewRedSquare = false;
	static boolean drewBlueSquare = false;
	static boolean drewRedTriangle = false;
	static boolean drewBlueTriangle = false;
	
	public static void main(String[] args) {
		
		boolean isRed = false;
		boolean isSquare = true;
		
		// The && shown here means that both booleans must be true for the 
		// entire if statement to be true. It is referred to as the "and"
		// operator. 
		if(isRed && isSquare) {
			
			drawRedSquare();
		}
		else if(!isRed && isSquare ) {
			drawBlueSquare();
		
		}else if(isRed&&!isSquare)  {
		
		drawRedTriangle();
		
	}else if(!isRed&&!isSquare) {
		drawBlueTriangle();
		
	}else{
            JOptionPane.showMessageDialog(null, "No shape was drawn!");
        }
		
		// 1. Run the program and notice no shape is drawn.
		
		// 2. Initialize isRed to true instead of false and run the program 
		//    again.
		
		// 3. Write an else if statement after the if statement that calls 
		//    drawBlueSquare if isRed is false AND isSquare is true. 
		//    Hint: Use ! and &&.
		
		// 4. Write an else if statement that calls drawRedTriangle() if isRed
		//    is true and isSquare is false.
		
		// 5. Write an else if statement that calls drawBlueTriangle if both
		//    isRed and isSquare are false.
		
		// 6. Keep rerunning your program, initializing isRed and isSquare to 
		//    different values until you've seen a red square, red triangle, 
		//    blue square and blue triangle drawn.
		
		// Much like the "and" operator, the "or" operator || can be used to 
		// combine two boolean statements. However the statement becomes true
		// if either boolean is true rather than only if both are true.
		
		// 7. Write an if statement using the static booleans at the top of 
		//    the program. If drewRedSquare OR drewBlueSquare are true, then
		//    tell the user they drew a square in a pop-up. Hint: ||
		if(drewRedSquare||drewBlueSquare) {
			JOptionPane.showMessageDialog(null,"you drew a square");
		}else if(drewRedTriangle||drewBlueTriangle) {
			JOptionPane.showMessageDialog(null, "Guess what,  you drew a triangle");
		}
		//    Notice these static booleans start off false, but update to true 
		//    whenever you call their matching method.
		
		// 8. Write an else if statement that tells the user they drew a 
		//    triangle if drewRedTriangle or drewBlueTriangle are true.
		
		// 9. Keep rerunning the program and change the isRed and isSquare 
		//    variables like you did in step 6. Make sure that when it draws
		//    a shape that the pop-up correctly says what it drew. 
		
	}
	
	static void drawRedSquare() {
		
		Robot r = new Robot();
		r.penDown();
		r.setSpeed(100);
		r.setPenColor(255,0,0);
		for (int i = 0; i < 4; i++) {
			r.turn(90);
			r.move(100);
		}
		
		drewRedSquare = true;
	}	
	
	static void drawBlueSquare() {
		
		Robot rb = new Robot();
		rb.penDown();
		rb.setSpeed(100);
		rb.setPenColor(0,0,255);
		for (int i = 0; i < 4; i++) {
			rb.turn(90);
			rb.move(100);
		}
		
		drewBlueSquare = true;
	}
	
	static void drawRedTriangle() {
		
		Robot ro = new Robot();
		ro.penDown();
		ro.setSpeed(100);
		ro.setPenColor(255,0,0);
		for (int i = 0; i < 3; i++) {
			ro.turn(120);
			ro.move(100);
		}
		
		drewRedTriangle = true;
	}
	
	static void drawBlueTriangle() {
		
		
		Robot ob = new Robot();
		ob.penDown();
		ob.setSpeed(100);
		ob.setPenColor(0,0,255);
		for (int i = 0; i < 3; i++) {
			ob.turn(120);
			ob.move(100);
		}
		
		drewBlueTriangle = true;
		
	}
}
