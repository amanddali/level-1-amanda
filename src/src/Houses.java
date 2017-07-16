import java.awt.Color;
import java.util.Random;
import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot bob = new Robot("mini");
	static Random randomMaker = new Random();
	
	public static void main(String[] args) {
		Robot.setWindowColor(Color.black);
		bob.moveTo(100, 800);
		bob.setPenWidth(5);
		bob.setSpeed(10);
		bob.penDown();
		drawHouses(20);
	}
	
	public static void drawHouses(int times){
		int height;
		for (int i = 0; i < times; i++) {
			height = randomMaker.nextInt(300) + 100;
			bob.setRandomPenColor();
			bob.move(height);
			if (height>250) {
				drawFlatRoof();
			} else {
				drawPointyRoof();
			}
			bob.move(height);
			bob.turn(-90);
			bob.setPenColor(Color.green);
			bob.move(30);
			bob.turn(-90);
		}
	}
	
	public static void drawPointyRoof(){
		bob.turn(45);
		bob.move(25);
		bob.turn(90);
		bob.move(25);
		bob.turn(45);
	}
	
	public static void drawFlatRoof(){
		bob.turn(90);
		bob.move(50);
		bob.turn(90);
	}
}
