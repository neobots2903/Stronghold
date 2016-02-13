package org.usfirst.frc.team2903.robot.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;

import org.usfirst.frc.team2903.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drive2903 extends Subsystem {
	
	static int count;
	static int rawcount;
	
	CANTalon leftFrontMotor = new CANTalon(RobotMap.LeftFrontMotor);
	CANTalon leftRearMotor = new CANTalon(RobotMap.LeftRearMotor);
	CANTalon rightFrontMotor = new CANTalon(RobotMap.RightFrontMotor);
	CANTalon rightRearMotor = new CANTalon(RobotMap.RightRearMotor);

	// here is the encoder
	public static Encoder driveSpeedEncoder = new Encoder(0, 1, false, Encoder.EncodingType.k4X);

	
	public enum DriveType {
		ArcadeMode1Joystick,
		//ArcadeMode2Joystick,
		ArcadeModeJoyOp,
		//ArcadeModeJoyOp2,
		//TankDriveJoysticks,
		//TankDriveJoyOp
	};
	
	//drive mode selection 
	public DriveType driveType;
	
	public RobotDrive robotDrive;
	
	public Drive2903 () {

		// instantiate the talons
		leftFrontMotor = new CANTalon(RobotMap.LeftFrontMotor);
		leftRearMotor = new CANTalon(RobotMap.LeftRearMotor);
		rightFrontMotor = new CANTalon(RobotMap.RightFrontMotor);
		rightRearMotor = new CANTalon(RobotMap.RightRearMotor);
		
		// enable the motors
		leftFrontMotor.enable();
		leftRearMotor.enable();
		rightFrontMotor.enable();
		rightRearMotor.enable();

		// instantiate the drive system
		robotDrive = new RobotDrive(leftFrontMotor, leftRearMotor, rightFrontMotor, rightRearMotor);	
		robotDrive.setInvertedMotor(MotorType.kRearLeft, true);
    	robotDrive.setInvertedMotor(MotorType.kFrontLeft, true);
    	
    	// set the drive type
    	driveType = DriveType.ArcadeMode1Joystick;
    	
    	// enable the encoder
    	driveSpeedEncoder = new Encoder(0, 1, false, Encoder.EncodingType.k4X);
    	
    	//boolean retval = robotDrive.isAlive();
    	count = driveSpeedEncoder.get();
    	rawcount = driveSpeedEncoder.get();

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