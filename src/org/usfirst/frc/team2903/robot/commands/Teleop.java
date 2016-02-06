package org.usfirst.frc.team2903.robot.commands;

import org.usfirst.frc.team2903.robot.OI;
import org.usfirst.frc.team2903.robot.Robot;
import org.usfirst.frc.team2903.robot.subsystems.Drive2903;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Teleop extends Command {

    public Teleop() {
    	requires(Robot.driveSubsystem);
//        requires(Robot.pneumaticsSubsystem);
    }

    protected void initialize() {
    	//Robot.elevatorSubsystem.encoder.reset();
    	
    	    }

   // @SuppressWarnings("deprecation")
	protected void execute() {
		
		double forward = OI.Joy2.getY(); // logitech gampad left X, positive is forward
    	double turn = OI.Joy2.getX(); //logitech gampad right X, positive means turn right
    	
    	double leftSpeed;
    	double rightSpeed;
    	//boolean retval = Robot.driveSubsystem.robotDrive.isAlive();
		Robot.driveSubsystem.arcadeDrive(turn, forward);
/*
 * when a is pressed and held, both motors turn in opposite directions outward
 * on release they stop
 * when b is pressed and held, both motors turn in opposite directions inward 
 * on release they stop 
 */
		if(OI.controller.getRawButton(1)) 
			// high goal 
			Robot.shooterSubsystem.enableHighGoalMode();
		else if (OI.controller.getRawButton(2))
			Robot.shooterSubsystem.enableLowGoalMode();
		else
			// stop shooter motors
			Robot.shooterSubsystem.disableShooter();
		
		if(OI.controller.getTrigger(Hand.kRight))
			//activate kickera
			;
			
		if(OI.controller.getRawButton(4))
			Robot.shooterSubsystem.enablePickupMode();
			;
			
		if (OI.Joy1.getRawButton(1))
			Robot.driveSubsystem.driveType = Drive2903.DriveType.ArcadeMode2Joystick;
		else if (OI.Joy1.getRawButton(2))
			Robot.driveSubsystem.driveType = Drive2903.DriveType.ArcadeMode2Joystick;
		else if (OI.Joy1.getRawButton(3))
			Robot.driveSubsystem.driveType = Drive2903.DriveType.ArcadeModeController1Joystick;
		else if (OI.Joy1.getRawButton(4))
			Robot.driveSubsystem.driveType = Drive2903.DriveType.ArcadeModeController2Joystick;
		else if (OI.Joy1.getRawButton(5))
			Robot.driveSubsystem.driveType = Drive2903.DriveType.TankDriveController;
		else if (OI.Joy1.getRawButton(6))
			Robot.driveSubsystem.driveType = Drive2903.DriveType.TankDriveJoysticks;
		
		//if (Robot.driveSubsystem.driveType != Drive2903.DriveType.TankDriveController &&
				//Robot.driveSubsystem.driveType != Drive2903.DriveType.TankDriveJoysticks)
	
		{
			switch (Robot.driveSubsystem.driveType)
					{
				case ArcadeMode1Joystick:
					forward = OI.Joy1.getX(); // logitech gampad left X, positive is forward
		    		turn = OI.Joy1.getY(); //logitech gampad right X, positive means turn right
		    		Robot.driveSubsystem.arcadeDrive(forward, turn);
					break;
				case ArcadeMode2Joystick:
					forward = OI.Joy1.getX(); // logitech gampad left X, positive is forward
		    		turn = OI.Joy2.getY(); //logitech gampad right X, positive means turn right
		    		Robot.driveSubsystem.arcadeDrive(forward, turn);
					break;
				case ArcadeModeController1Joystick:
					forward = OI.controller.getY(Hand.kLeft); // logitech gampad left X, positive is forward
		    		turn = OI.controller.getX(Hand.kLeft); //logitech gampad right X, positive means turn right
		    		Robot.driveSubsystem.arcadeDrive(forward, turn);
					break;
				case ArcadeModeController2Joystick:
					forward = OI.controller.getY(Hand.kLeft); // logitech gampad left X, positive is forward
					turn = OI.controller.getX(Hand.kRight); //logitech gampad right X, positive means turn right
		    		Robot.driveSubsystem.arcadeDrive(forward, turn);
					break;
				case TankDriveController:
					leftSpeed = OI.controller.getY(Hand.kLeft);
					rightSpeed = OI.controller.getY(Hand.kRight);
					Robot.driveSubsystem.tankDrive(leftSpeed, rightSpeed);
					break;
				case TankDriveJoysticks:
					leftSpeed = OI.Joy1.getX();
					rightSpeed = OI.Joy2.getY();
					Robot.driveSubsystem.tankDrive(leftSpeed, rightSpeed);
					break;
					
					}
	    		
			
		}
		//else
		{
			 //tank drive
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
