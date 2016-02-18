/**
 * 
 */
package org.usfirst.frc.team2903.robot.commands.commoners;

import org.usfirst.frc.team2903.robot.subsystems.Drive2903;
import org.usfirst.frc.team2903.robot.subsystems.Gyro2903;
import org.usfirst.frc.team2903.robot.*;

/**
 * @author robotics
 *
 */
public class TurnWithGyro {

	double TargetAngle = 0;

	enum TurnDirection {
		Left, Right
	}

	TurnDirection turnDirection;

	public static void RobotTurn(){
		double targetAngle = 0;
		double gyroAngle = gyroSubsystem.gyro.getAngle() % 360;

		double leftSpeed;
		double rightSpeed;
		// requires(Robot.driveSubsystem);

		if (gyroAngle != targetAngle) {
			if (gyroAngle > (targetAngle)) {
				leftSpeed = -0.5;
				rightSpeed = 0.5;
				driveSubsystem.arcadeDrive(0, leftSpeed);

			} else {// (gyroAngle < (targetAngle)) {
				leftSpeed = 0.5;
				rightSpeed = -0.5;
				driveSubsystem.arcadeDrive(0, leftSpeed);

			}
			// if (targetAngle / 180 == 0) {
			// //turn right
			// }
			// else if(targetAngle / 180 == 1){
			// //turn left
			// }

		}

	}

	public double getTargetAngle() {
		return TargetAngle;
	}

	public void setTargetAngle(double targetAngle) {
		TargetAngle = targetAngle;
		// adjust angle down to one circle
		TargetAngle = TargetAngle % 360;
		if (TargetAngle < 0) {
			turnDirection = TurnDirection.Right;
		}

		else {
			TargetAngle -= 360;
			turnDirection = TurnDirection.Left;
		}
	}
	
}
