package org.usfirst.frc.team2903.robot.commands;

import org.usfirst.frc.team2903.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team2903.robot.commands.commoners.DriveStraightWithGyro;
public class Auto extends Command {

	public Auto() {
		requires(Robot.driveSubsystem);
//		requires(Robot.gyroSubsystem);
	}

	 //private void requires(Gyro2903 gyroSubsystem) {
	// // TODO Auto-generated method stub
	//
	 //}

	protected void end() {

	}

	protected void execute() {

		Robot.driveSubsystem.arcadeDrive(0.5, 0);

			//Robot.gyroSubsystem.GyroPostion();
			DriveStraightWithGyro.GyroPID(Robot.driveSubsystem, Robot.gyroSubsystem);

	}

	protected void initialize() {
		// double autoForwardSpeed = (double) 0.25;
		int autoDuration = 150000;
		long startTime = System.currentTimeMillis();
		long stopTime = startTime;
		double leftSpeed;
		double rightSpeed;
		leftSpeed = 0.5;
		rightSpeed = 0.5;
		Robot.gyroSubsystem.gyro.calibrate();

		// Robot.driveSubsystem.arcadeDrive(0,autoForwardSpeed);

//		Robot.driveSubsystem.tankDrive(leftSpeed, rightSpeed);
//
//		while (stopTime <= (startTime + autoDuration)) {
//			stopTime = System.currentTimeMillis();
////			Robot.gyroSubsystem.gyroPID(Robot.driveSubsystem);
//			Robot.gyroSubsystem.GyroPostion();
//			TurnWithGyro.GyroPID(Robot.driveSubsystem, Robot.gyroSubsystem);
//		}

		// Robot.driveSubsystem.arcadeDrive(0,0);

	}

	protected void interrupted() {

	}

	protected boolean isFinished() {
		return false;
	}

}
