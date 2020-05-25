package _02_Advanced_Robot_Race;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	static boolean go = true;

	// Re-do the robot race recipe from level 3 module 0.
	// This time, use threads to make all of the robots go at the same time.
	public static void main(String[] args) {
		Random rand = new Random();

		Robot[] rob = new Robot[5];
		Thread[] threadArray = new Thread[5];

		rob[0] = new Robot(70, 650);
		rob[1] = new Robot(170, 650);
		rob[2] = new Robot(270, 650);
		rob[3] = new Robot(370, 650);
		rob[4] = new Robot(470, 650);

		for (int i = 0; i < 5; i++) {
			Robot r = rob[i];
			int j = i;
			threadArray[i] = new Thread(() -> {

				while (go) {

					if (r.getY() <= 80) {
						go = false;
						int winner = j + 1;
						JOptionPane.showMessageDialog(null, "Robot " + winner + " won!");
						break;
					}

					if (!go) {
						break;
					}

					else {
						r.move(rand.nextInt(50));
					}

				}

			});

			threadArray[i].start();
		}

	}
}
