package org.usfirst.frc.team2903.robot.commands;

import org.usfirst.frc.team2903.robot.Robot;
import org.usfirst.frc.team2903.robot.subsystems.Drive2903;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.interfaces.Gyro;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Teleop extends Command {

	public Teleop() {
		requires(Robot.driveSubsystem);
		requires(Robot.armSubsystem);

		// requires(Robot.pneumaticsSubsystem);
	}

	protected void initialize() {
		// Robot.elevatorSubsystem.encoder.reset();

	}

	// @SuppressWarnings("deprecation")
	protected void execute() {
		double forward = Robot.joy1.getY(); // logitech Y, positive
											// is forward
		//double turn = Robot.joy1.getZ()/1.5; // logitech X, positive
		// means turn right
		double turn = Robot.joy1.getX(); // logitech X, positive
											// means turn right


		Robot.driveSubsystem.arcadeDrive(turn, forward);
		/*
		 * when a is pressed and held, both motors turn in opposite directions
		 * outward on release they stop when b is pressed and held, both motors
		 * turn in opposite directions inward on release they stop
		 */
		
		if (Robot.joyOp.getPOV() == 0)
			//raise arm 
			Robot.armSubsystem.raiseArm();
		else if (Robot.joyOp.getPOV() == 4)
			//lower arm
			Robot.armSubsystem.lowerArm();
		else 
			//stop arm
			Robot.armSubsystem.stopArm();
		
//		if (Robot.joyOp.getRawButton(3))
//			// high goal
			
		

		// if(Robot.joyOp.getRawButton(1))
		// //activate kicker
		// ;

		
		
			
			}


	protected boolean isFinished() {
		return false;
	}

	protected void end() {
	}

	protected void interrupted() {
	}
}
