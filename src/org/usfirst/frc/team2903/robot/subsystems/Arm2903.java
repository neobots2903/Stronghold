package org.usfirst.frc.team2903.robot.subsystems;

import org.usfirst.frc.team2903.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
//import edu.wpi.first.wpilibj.
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm2903 extends Subsystem {

	public static CANTalon armMotor;
	boolean isReset;
	//Potention
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

public Arm2903 () {

	armMotor = new CANTalon(RobotMap.armMotor);
	
	
}
	
//	public void resetArm(){
//		
//		if potentiometer > 0 {
//
//			armMotor.set(-0.1);
//			isReset = false; 
//		
//		}
//		
//		if potentiometer < 0 {
//		
//			armMotor.set(0.1);
//			isReset = false;
//		
//		}
//		
//		else {
//		
//			armMotor.set(0);
//			isReset = true;
//		
//		}
//		
//	}
	
	public void raiseArm(){
		
		armMotor.set(0.1);
		
	}
	
//	public void setTargetPos(value){
//		
//		TargetPos = value;
//		
//	}
	

}


