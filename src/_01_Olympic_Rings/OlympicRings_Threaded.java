package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot one = new Robot(200,300);
		one.penDown();
		one.setPenColor(0, 0, 800);
		Robot two = new Robot(400, 300);
		two.penDown();
		Robot three = new Robot(600,300);
		three.penDown();
		three.setPenColor(800, 0, 0);
		Robot four = new Robot(300, 500);
		four.penDown();
		four.setPenColor(600, 600, 0);
		Robot five = new Robot(500, 500);
		five.penDown();
		five.setPenColor(0, 600, 600);
		Thread uno = new Thread(() -> DrawRing(one));
		Thread dos = new Thread(() -> DrawRing(two));
		Thread tres = new Thread(() -> DrawRing(three));
		Thread quatro = new Thread(() -> DrawRing(four));
		Thread cinco = new Thread(() -> DrawRing(five));
		uno.start();
		dos.start();
		tres.start();
		quatro.start();
		cinco.start();
	}
	public static void DrawRing(Robot a) {
		Thread ohmygod = new Thread(() -> a.turn(360));
		Thread wow = new Thread(() -> a.move(-360));
		for(int i = 0; i < 360; i++) {
		a.turn(1);
		a.move(2);
			//ohmygod.start();
			//wow.start();
		}
	}
}

