package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
	public static void main(String[] args) {
		int x = 400;
		int y = 50;
		boolean isRacing = true;
		Robot[] robots = new Robot[3];
		for(int i = 0; i<robots.length; i++) {
			robots[i] = new Robot();
		}
		
		for(int i = 0; i<robots.length; i++) {
			
			robots[i].setSpeed(15);
			robots[i].setX(x);
			robots[i].setY(y);
			robots[i].turn(90);
			y +=70;
			
			
		}
		/*
		while(isRacing == true) {
		for(int i = 0; i<robots.length; i++) {
			 
				Random rand = new Random();
				robots[i].move(rand.nextInt(50));
			if(robots[i].getY() <50) {
				isRacing =false;
				for(int j = 0; j<robots.length; j++) {
					robots[j].turn(360);
				}
				
			}
		}
		}
		*/
		
		while(isRacing == true) {
			for(int i = 0; i<robots.length; i++) {
				Random rand = new Random();
				int random = rand.nextInt(4);
				for(int k = 0; k<random; k++) {
					robots[i].move(2);
					robots[i].turn(1);
					if(robots[i].getX()==400 && robots[i].getY()==50) {
						isRacing = false;
						System.out.println("Robot "+i+" wins!");
						break;
					}
				}
				
			}
		}
		
		
		
	}
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.
	
		//4. make each robot start at the bottom of the screen, side by side, facing up
	
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.

}