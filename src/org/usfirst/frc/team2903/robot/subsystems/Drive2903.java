package org.usfirst.frc.team2903.robot.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;

import org.usfirst.frc.team2903.robot.Robot;
import org.usfirst.frc.team2903.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drive2903 extends Subsystem {

	static int RightCount;

	public static int rightGetCount() {
		if (driveSpeedEncoder != null)
			return RightCount = driveSpeedEncoder.get();
		else
			return 0;
	}

	static int RightRawCount;

	public static int rightGetRawcount() {
		if (driveSpeedEncoder != null)
			return RightRawCount = driveSpeedEncoder.getRaw();
		else
			return 0;
	}
	static int LeftCount;

	public static int leftGetCount() {
		if (driveSpeedEncoder != null)
			return LeftCount = driveSpeedEncoder.get();
		else
			return 0;
	}

	static int LeftRawCount;

	public static int leftGetRawcount() {
		if (driveSpeedEncoder != null)
			return LeftRawCount = driveSpeedEncoder.getRaw();
		else
			return 0;
	}
	

	CANTalon leftFrontMotor;
	CANTalon leftRearMotor;
	CANTalon rightFrontMotor;
	CANTalon rightRearMotor;

	// here is the encoder
	public static Encoder leftDriveSpeedEncoder;
	public static Encoder driveSpeedEncoder;
	public enum DriveType {
		ArcadeMode1Joystick,
		// ArcadeMode2Joystick,
		ArcadeModeJoyOp,
		// ArcadeModeJoyOp2,
		// TankDriveJoysticks,
		// TankDriveJoyOp
	}

	// drive mode selection
	public DriveType driveType;

	public RobotDrive robotDrive;

	public Drive2903() {

		// instantiate the talons
		leftFrontMotor = new CANTalon(RobotMap.LeftTopMotor);
		leftRearMotor = new CANTalon(RobotMap.LeftBottomMotor);
		rightFrontMotor = new CANTalon(RobotMap.RightTopMotor);
		rightRearMotor = new CANTalon(RobotMap.RightBottomMotor);
		
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

		RightCount = driveSpeedEncoder.get();
		RightRawCount = driveSpeedEncoder.get();

	}

	public void getDistanceTraveled() {
		robotDrive.arcadeDrive(0, 0);
		if (robotDrive.isAlive() == true) {
			driveSpeedEncoder.get();

		}
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