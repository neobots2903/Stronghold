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
		
		double forward = OI.Joy1.getY(); // logitech gampad left X, positive is forward
    	double turn = OI.Joy1.getX(); //logitech gampad right X, positive means turn right
    	
//    	double leftSpeed;
//    	double rightSpeed;
    	//boolean retval = Robot.driveSubsystem.robotDrive.isAlive();
		Robot.driveSubsystem.arcadeDrive(turn, forward);
/*
 * when a is pressed and held, both motors turn in opposite directions outward
 * on release they stop
 * when b is pressed and held, both motors turn in opposite directions inward 
 * on release they stop 
 */
		if(OI.JoyOp.getRawButton(3)) 
			// high goal 
			Robot.shooterSubsystem.enableHighGoalMode();
		else if (OI.JoyOp.getRawButton(4))
			Robot.shooterSubsystem.enableLowGoalMode();
		else
			// stop shooter motors
			Robot.shooterSubsystem.disableShooter();
		
//		if(OI.JoyOp.getRawButton(1))
//			//activate kicker
//			;
			
		if(OI.JoyOp.getRawButton(5))
			Robot.shooterSubsystem.enablePickupMode();
			;
			
		if (OI.JoyOp.getRawButton(7))
			Robot.driveSubsystem.driveType = Drive2903.DriveType.ArcadeMode1Joystick;
//		else if (OI.Joy1.getRawButton(8))
//			Robot.driveSubsystem.driveType = Drive2903.DriveType.ArcadeMode2Joystick;
		else if (OI.JoyOp.getRawButton(9))
			Robot.driveSubsystem.driveType = Drive2903.DriveType.ArcadeModeJoyOp;
//		else if (OI.Joy1.getRawButton(4))
//			Robot.driveSubsystem.driveType = Drive2903.DriveType.ArcadeModeJoyOp2;
//		else if (OI.Joy1.getRawButton(5))
//			Robot.driveSubsystem.driveType = Drive2903.DriveType.TankDriveJoyOp;
//		else if (OI.Joy1.getRawButton(10))
//			Robot.driveSubsystem.driveType = Drive2903.DriveType.TankDriveJoysticks;
		
		//if (Robot.driveSubsystem.driveType != Drive2903.DriveType.TankDriveJoyOp &&
				//Robot.driveSubsystem.driveType != Drive2903.DriveType.TankDriveJoysticks)
	
		{
			switch (Robot.driveSubsystem.driveType)
					{
				case ArcadeMode1Joystick:
					forward = OI.Joy1.getX(); // logitech gampad left X, positive is forward
		    		turn = OI.Joy1.getY(); //logitech gampad right X, positive means turn right
		    		Robot.driveSubsystem.arcadeDrive(forward, turn);
					break;
//				case ArcadeMode2Joystick:
//					forward = OI.Joy1.getX(); // logitech gampad left X, positive is forward
//		    		turn = OI.Joy2.getY(); //logitech gampad right X, positive means turn right
//		    		Robot.driveSubsystem.arcadeDrive(forward, turn);
//					break;
				case ArcadeModeJoyOp:
					forward = OI.JoyOp.getY(); // logitech gampad left X, positive is forward
		    		turn = OI.JoyOp.getX(); //logitech gampad right X, positive means turn right
		    		Robot.driveSubsystem.arcadeDrive(forward, turn);
					break;
//				case ArcadeModeJoyOp2:
//					forward = OI.JoyOp.getY(Hand.kLeft); // logitech gampad left X, positive is forward
//					turn = OI.JoyOp.getX(Hand.kRight); //logitech gampad right X, positive means turn right
//		    		Robot.driveSubsystem.arcadeDrive(forward, turn);
//					break;
//				case TankDriveJoyOp:
//					leftSpeed = OI.JoyOp.getY();
//					rightSpeed = OI.JoyOp.getY();
//					Robot.driveSubsystem.tankDrive(leftSpeed, rightSpeed);
//					break;
//				case TankDriveJoysticks:
//					leftSpeed = OI.Joy1.getX();
//					rightSpeed = OI.Joy2.getY();
//					Robot.driveSubsystem.tankDrive(leftSpeed, rightSpeed);
//					break;
					
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
