package org.usfirst.frc.team2903.robot;


import org.usfirst.frc.team2903.robot.subsystems.Drive2903;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static Joystick controller = new Joystick(2);
	public static Joystick Joy1 = new Joystick(0);
	public static Joystick Joy2 = new Joystick(1);
	
	public static CANTalon leftFrontMotor = new CANTalon(RobotMap.LeftFrontMotor);
	public static CANTalon leftRearMotor = new CANTalon(RobotMap.LeftRearMotor);
	public static CANTalon rightFrontMotor = new CANTalon(RobotMap.RightFrontMotor);
	public static CANTalon rightRearMotor = new CANTalon(RobotMap.RightRearMotor);
	
    //public static Drive hDrive = new Drive();
	
	public OI()
	{
		leftFrontMotor.enable();
		leftRearMotor.enable();
		rightFrontMotor.enable();
		rightRearMotor.enable();
	}
}

