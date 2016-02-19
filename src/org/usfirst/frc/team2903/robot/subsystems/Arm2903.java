package org.usfirst.frc.team2903.robot.subsystems;

import org.usfirst.frc.team2903.robot.RobotMap;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.CANTalon;
//import edu.wpi.first.wpilibj.
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;

public class Arm2903 extends Subsystem {

	public static CANTalon armMotor;
	boolean isReset;
	// Potention

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

	Potentiometer pot;

	public Arm2903() {

		armMotor = new CANTalon(RobotMap.armMotor);

		pot = new AnalogPotentiometer(1, 100, 0);

	}

	public void resetArm() {

		if (pot.get() > 0) {

			armMotor.set(-0.1);
			isReset = false;

		}

		else {

			armMotor.set(0);
			isReset = true;

		}

	}

	public void raiseArm() {

		if (pot.get() < 100)
			armMotor.set(0.1);
		else
			armMotor.set(0);
	}

	public void lowerArm() {
		if (pot.get() > 0)
			armMotor.set(-0.1);
		else
			armMotor.set(0);
	}

	// public void setTargetPos(value){
	//
	// TargetPos = value;
	//
	// }

}
