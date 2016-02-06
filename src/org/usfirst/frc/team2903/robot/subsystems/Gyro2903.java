package org.usfirst.frc.team2903.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogGyro;
import org.usfirst.frc.team2903.robot.Robot;
//import org.usfirst.frc.team2903.robot.OI;

public class Gyro2903 
{	
	AnalogGyro gyro;
	double targetAngle = 0;
	double gyroAngle = gyro.getAngle();
	
	public void gyroPID()
	{
		double targetAngle = 0;
		double gyroAngle = gyro.getAngle();

    	requires(Robot.driveSubsystem);

		if(gyroAngle != targetAngle){
			if(gyroAngle > 180 - targetAngle){
				
				Robot.driveSubsystem.drive2(.75, .5);
			
			}
			if(gyroAngle < 180 - targetAngle){
				
				Robot.driveSubsystem.drive2(.5, .75);
				
			}
		}

	}

	private void requires(Drive drivesubsystem) 
	{
		// TODO Auto-generated method stub
		
	}
} 