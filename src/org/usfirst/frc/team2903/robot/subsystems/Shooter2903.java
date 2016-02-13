package org.usfirst.frc.team2903.robot.subsystems;

import org.usfirst.frc.team2903.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Shooter2903 extends Subsystem {

	static double highForward;
	static double lowForward;
	static double reverse;
	static int count;
	static int rawCount;

	static CANTalon rightShooter = new CANTalon(RobotMap.RightShooter);
	static CANTalon leftShooter = new CANTalon(RobotMap.LeftShooter);

	// encoder for shooter motors
	static Encoder shooterSpeedEncoder = new Encoder(0, 1, false, Encoder.EncodingType.k4X);

	public Shooter2903() {
		// instantiate the talon motor controllers
		rightShooter = new CANTalon(RobotMap.RightShooter);
		leftShooter = new CANTalon(RobotMap.LeftShooter);
		leftShooter.enable();
		rightShooter.enable();

		// instantiate the encoder
		shooterSpeedEncoder = new Encoder(0, 1, false, Encoder.EncodingType.k4X);

		// initialize class data
		// TODO: Make these numbers constants -- see the values in RobotMap.java
		highForward = 1.0;
		lowForward = 0.35;
		reverse = -0.25;

		// get the encoder counts
		count = shooterSpeedEncoder.get();
		rawCount = shooterSpeedEncoder.getRaw();

	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

	public void enableHighGoalMode() {
		// TODO: add kicker
		leftShooter.set(highForward * -1.0);
		rightShooter.set(highForward);

		// get and display the encoder counts
		count = shooterSpeedEncoder.get();
		rawCount = shooterSpeedEncoder.getRaw();
		SmartDashboard.putNumber("count", count);
		SmartDashboard.putNumber("Rawcount", rawCount);
	}

	public void enableLowGoalMode() {
		// TODO: add kicker
		leftShooter.set(lowForward * -1.0);
		rightShooter.set(lowForward);

		// get and display the encoder counts
		count = shooterSpeedEncoder.get();
		rawCount = shooterSpeedEncoder.getRaw();
		SmartDashboard.putNumber("count", count);
		SmartDashboard.putNumber("Rawcount", rawCount);
	}

	public void enablePickupMode() {
		leftShooter.set(reverse * -1.0);
		rightShooter.set(reverse);

		// get and display the encoder counts
		count = shooterSpeedEncoder.get();
		rawCount = shooterSpeedEncoder.getRaw();
		SmartDashboard.putNumber("count", count);
		SmartDashboard.putNumber("Rawcount", rawCount);

	}

	public void disableShooter() {
		leftShooter.set(0);
		rightShooter.set(0);

	}

	// The arms raise and lower the shooter....
	public void raiseShooter() {
		// manual lifting or positions?
	}

	public void lowerShooter() {
		// manual lifting or positions?
	}
}
