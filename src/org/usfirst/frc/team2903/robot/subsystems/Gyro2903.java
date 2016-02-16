package org.usfirst.frc.team2903.robot.subsystems;

import org.usfirst.frc.team2903.robot.RobotMap;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Gyro2903 extends Subsystem {
	
	public Gyro gyro;

	public Gyro2903() {
			gyro = new AnalogGyro(RobotMap.Gyro);
			gyro.calibrate();
	}
	
	public void GyroPostion() {
		
		double gyroAngle;
		
		gyro.reset();
		gyroAngle = gyro.getAngle();
		SmartDashboard.putNumber("gyroAngle", gyroAngle);
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}
}