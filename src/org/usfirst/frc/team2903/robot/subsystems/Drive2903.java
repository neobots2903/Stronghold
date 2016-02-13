package org.usfirst.frc.team2903.robot.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;

import org.usfirst.frc.team2903.robot.OI;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drive2903 extends Subsystem {
	
	static int count = OI.enc2.get();
	static int rawcount = OI.enc2.get();
	
	public enum DriveType {
		ArcadeMode1Joystick,
		ArcadeMode2Joystick,
		ArcadeModeJoyOp,
		//ArcadeModeJoyOp2,
		TankDriveJoysticks,
		//TankDriveJoyOp
	};
	
	//drive mode selection 
	public DriveType driveType;
	
	public RobotDrive robotDrive;
	
	public Drive2903 () {
		
    	robotDrive = new RobotDrive(OI.leftFrontMotor, OI.leftRearMotor, OI.rightFrontMotor, OI.rightRearMotor);	
		robotDrive.setInvertedMotor(MotorType.kRearLeft, true);
    	robotDrive.setInvertedMotor(MotorType.kFrontLeft, true);
    			
    	driveType = DriveType.ArcadeMode1Joystick;
    	
    	//boolean retval = robotDrive.isAlive();
	
	}
			

	public void arcadeDrive(double forward, double turn) {
		
		robotDrive.arcadeDrive(forward, turn);
		
	}

	public void tankDrive(double leftSpeed, double rightSpeed) {
		
		robotDrive.tankDrive(leftSpeed, rightSpeed);
		
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}