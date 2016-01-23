package org.usfirst.frc.team2903.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogGyro;


//import org.usfirst.frc.team2903.robot.OI;
import org.usfirst.frc.team2903.robot.RobotMap;
//
public class Gyro2903 {
	
	AnalogGyro gyro;
	
	public Gyro2903() {

		gyro = new AnalogGyro(RobotMap.Gyro);
		gyro.reset();
			
		
		}
} 