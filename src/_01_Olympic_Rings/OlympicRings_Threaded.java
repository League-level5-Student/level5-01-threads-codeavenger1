package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot blue = new Robot(350, 100);
		Robot yellow = new Robot(500, 400);
		Robot black = new Robot(650, 100);
		Robot green = new Robot(800, 400);
		Robot red = new Robot(950, 100);
		
		blue.setSpeed(10);
		yellow.setSpeed(10);
		black.setSpeed(10);
		green.setSpeed(10);
		red.setSpeed(10);
		
		blue.penDown();
		yellow.penDown();
		black.penDown();
		green.penDown();
		red.penDown();
		
		blue.setPenColor(Color.BLUE);
		yellow.setPenColor(Color.YELLOW);
		black.setPenColor(Color.BLACK);
		green.setPenColor(Color.GREEN);
		red.setPenColor(Color.RED);
		
		blue.hide();
		yellow.hide();
		black.hide();
		green.hide();
		red.hide();
	}
}
