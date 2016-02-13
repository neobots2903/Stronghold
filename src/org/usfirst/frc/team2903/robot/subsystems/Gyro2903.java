package org.usfirst.frc.team2903.robot.subsystems;

import org.usfirst.frc.team2903.robot.RobotMap;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Gyro2903 extends Subsystem {
	public AnalogGyro gyro;

	public Gyro2903() {
		gyro = new AnalogGyro(RobotMap.Gyro);
	}

	public void gyroPID(Drive2903 driveSubsystem) {
		double targetAngle = 0;
		double gyroAngle = gyro.getAngle();

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

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}
}