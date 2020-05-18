package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot[] robArray = new Robot[5];
		Thread[] threadArray = new Thread[5];

		robArray[0] = new Robot(350, 150);
		robArray[1] = new Robot(450, 300);
		robArray[2] = new Robot(550, 150);
		robArray[3] = new Robot(650, 300);
		robArray[4] = new Robot(750, 150);

		robArray[0].hide();
		robArray[1].hide();
		robArray[2].hide();
		robArray[3].hide();
		robArray[4].hide();

		robArray[0].setSpeed(10);
		robArray[1].setSpeed(10);
		robArray[2].setSpeed(10);
		robArray[3].setSpeed(10);
		robArray[4].setSpeed(10);

		robArray[0].penDown();
		robArray[1].penDown();
		robArray[2].penDown();
		robArray[3].penDown();
		robArray[4].penDown();

		robArray[0].setPenColor(Color.BLUE);
		robArray[1].setPenColor(Color.YELLOW);
		robArray[2].setPenColor(Color.BLACK);
		robArray[3].setPenColor(Color.GREEN);
		robArray[4].setPenColor(Color.RED);

		for (int i = 0; i < 5; i++) {
			Robot rob = robArray[i];
			
			threadArray[i] = new Thread(() -> {
				for (int j = 0; j < 360; j++) {
					rob.setSpeed(10);
					rob.turn(1);
					rob.move(2);
				}
			});
			
			threadArray[i].start();
		}
	}
}
