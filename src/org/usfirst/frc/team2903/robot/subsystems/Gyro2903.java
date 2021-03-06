package org.usfirst.frc.team2903.robot.subsystems;

import org.usfirst.frc.team2903.robot.RobotMap;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Gyro2903 extends Subsystem {
	
	Gyro gyro;
	double gyroAngle;

	public Gyro2903() {
			gyro = new AnalogGyro(RobotMap.Gyro);
			gyro.calibrate();
	}
	
	public double GyroPosition() {

		//gyro.reset();
		gyroAngle = gyro.getAngle();
		SmartDashboard.putNumber("gyroAngle", gyroAngle);
		return gyroAngle;
	}
	
	public void Calibrate()
	{
		gyro.calibrate();
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

	public void reset() {
		gyro.reset();
		
	}
}