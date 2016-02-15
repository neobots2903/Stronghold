package org.usfirst.frc.team2903.robot.commands;

import org.usfirst.frc.team2903.robot.Robot;
import org.usfirst.frc.team2903.robot.subsystems.Drive2903;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.interfaces.Gyro;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Teleop extends Command {

	public Teleop() {
		requires(Robot.driveSubsystem);
		// requires(Robot.pneumaticsSubsystem);
	}

	protected void initialize() {
		// Robot.elevatorSubsystem.encoder.reset();

	}

	// @SuppressWarnings("deprecation")
	protected void execute() {
		double forward = Robot.joy1.getY(); // logitech gampad left X, positive
											// is forward
		double turn = Robot.joy1.getX(); // logitech gampad right X, positive
											// means turn right

		// double leftSpeed;
		// double rightSpeed;
		// boolean retval = Robot.driveSubsystem.robotDrive.isAlive();
		Robot.driveSubsystem.arcadeDrive(turn, forward);
		/*
		 * when a is pressed and held, both motors turn in opposite directions
		 * outward on release they stop when b is pressed and held, both motors
		 * turn in opposite directions inward on release they stop
		 */
//		if (Robot.joyOp.getRawButton(3))
//			// high goal
//			Robot.shooterSubsystem.enableHighGoalMode();
//		else if (Robot.joyOp.getRawButton(4))
//			Robot.shooterSubsystem.enableLowGoalMode();
//		else
//			// stop shooter motors
//			Robot.shooterSubsystem.disableShooter();
//
//		// if(Robot.joyOp.getRawButton(1))
//		// //activate kicker
//		// ;
//
//		if (Robot.joyOp.getRawButton(5))
//			Robot.shooterSubsystem.enablePickupMode();
//		;

		if (Robot.joyOp.getRawButton(7))
			Robot.driveSubsystem.driveType = Drive2903.DriveType.ArcadeMode1Joystick;
		// else if (Robot.joyOp.getRawButton(8))
		// Robot.driveSubsystem.driveType =
		// Drive2903.DriveType.ArcadeMode2Joystick;
		else if (Robot.joyOp.getRawButton(9))
			Robot.driveSubsystem.driveType = Drive2903.DriveType.ArcadeModeJoyOp;
		// else if (Robot.joyOp.getRawButton(4))
		// Robot.driveSubsystem.driveType =
		// Drive2903.DriveType.ArcadeModeJoyOp2;
		// else if (Robot.joyOp.getRawButton(5))
		// Robot.driveSubsystem.driveType = Drive2903.DriveType.TankDriveJoyOp;
		// else if (Robot.joyOp.getRawButton(10))
		// Robot.driveSubsystem.driveType =
		// Drive2903.DriveType.TankDriveJoysticks;

		// if (Robot.driveSubsystem.driveType !=
		// Drive2903.DriveType.TankDriveJoyOp &&
		// Robot.driveSubsystem.driveType !=
		// Drive2903.DriveType.TankDriveJoysticks)

		{
			switch (Robot.driveSubsystem.driveType) {
			case ArcadeMode1Joystick:
				forward = Robot.joy1.getX(); // logitech gampad left X, positive
												// is forward
				turn = Robot.joy1.getY(); // logitech gampad right X, positive
											// means turn right
				Robot.driveSubsystem.arcadeDrive(forward, turn);
				break;
			// case ArcadeMode2Joystick:
			// forward = Robot.joy1.getX(); // logitech gampad left X, positive
			// is forward
			// turn = Robot.joy1.getY(); //logitech gampad right X, positive
			// means turn right
			// Robot.driveSubsystem.arcadeDrive(forward, turn);
			// break;
			case ArcadeModeJoyOp:
				forward = Robot.joy1.getY(); // logitech gampad left X, positive
												// is forward
				turn = Robot.joy1.getX(); // logitech gampad right X, positive
											// means turn right
				Robot.driveSubsystem.arcadeDrive(forward, turn);
				break;
			// case ArcadeModeJoyOp2:
			// forward = Robot.joyOp.getY(Hand.kLeft); // logitech gampad left
			// X, positive is forward
			// turn = Robot.joyOp.getX(Hand.kRight); //logitech gampad right X,
			// positive means turn right
			// Robot.driveSubsystem.arcadeDrive(forward, turn);
			// break;
			// case TankDriveJoyOp:
			// leftSpeed = Robot.joyOp.getY();
			// rightSpeed = Robot.joyOp.getY();
			// Robot.driveSubsystem.tankDrive(leftSpeed, rightSpeed);
			// break;
			// case TankDriveJoysticks:
			// leftSpeed = Robot.joy1.getX();
			// rightSpeed = Robot.joy2.getY();
			// Robot.driveSubsystem.tankDrive(leftSpeed, rightSpeed);
			// break;
			
			}
		}
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
	}

	protected void interrupted() {
	}
}
