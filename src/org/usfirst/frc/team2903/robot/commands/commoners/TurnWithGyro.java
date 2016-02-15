/**
 * 
 */
package org.usfirst.frc.team2903.robot.commands.commoners;

import org.usfirst.frc.team2903.robot.*;
import org.usfirst.frc.team2903.robot.subsystems.Drive2903;
import org.usfirst.frc.team2903.robot.subsystems.Gyro2903;

/**
 * @author robotics
 *
 */
public class TurnWithGyro {
	public void GyroPID(Drive2903 driveSubsystem, Gyro2903 gyroSubsystem) {
		double targetAngle = 0;
		double gyroAngle = gyroSubsystem.gyro.getAngle();

		double leftSpeed;
		double rightSpeed;

		// requires(Robot.driveSubsystem);

		if (gyroAngle != targetAngle) {
			if (gyroAngle > 180 - targetAngle) {
				leftSpeed = 0.5;
				rightSpeed = -0.5;
				driveSubsystem.tankDrive(leftSpeed, rightSpeed);

			}
			if (gyroAngle < 180 - targetAngle) {
				leftSpeed = -0.5;
				rightSpeed = 0.5;
				driveSubsystem.tankDrive(leftSpeed, rightSpeed);

			}
		}

	}
}
