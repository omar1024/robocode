package bit;
import robocode.*;
import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * Bitch - a robot by omar
 */
public class Bitch extends Robot
{

	public void run() {
	// main loop for robot working
		while(true) {
			ahead(100);
			turnGunRight(360);
			back(100);
			turnGunRight(360);
		}
	}

	// on seeing other robot
	public void onScannedRobot(ScannedRobotEvent e) {
		fire(1);
	}

	//what to do when hit by a bullet
	public void onHitByBullet(HitByBulletEvent e) {

		back(10);
	}
	
	// on hitting the wall
	public void onHitWall(HitWallEvent e) {
		back(20);
	}	
}
