package org.usfirst.frc.team2903.robot;


import org.usfirst.frc.team2903.robot.subsystems.Drive2903;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static Joystick JoyOp = new Joystick(2);
	public static Joystick Joy1 = new Joystick(0);
	
	
	public static CANTalon leftFrontMotor = new CANTalon(RobotMap.LeftFrontMotor);
	public static CANTalon leftRearMotor = new CANTalon(RobotMap.LeftRearMotor);
	public static CANTalon rightFrontMotor = new CANTalon(RobotMap.RightFrontMotor);
	public static CANTalon rightRearMotor = new CANTalon(RobotMap.RightRearMotor);
	public static CANTalon RightShooter = new CANTalon(RobotMap.RightShooter);
	public static CANTalon LeftShooter = new CANTalon(RobotMap.LeftShooter);
	// add kicker when available 
	
	// here is the encoder
	public static Encoder enc = new Encoder(0, 1, false, Encoder.EncodingType.k4X);
	
	// encoder 2
	public static Encoder enc2 = new Encoder(0, 1, false, Encoder.EncodingType.k4X);

    //public static Drive hDrive = new Drive();
	
	public OI()
	{
		leftFrontMotor.enable();
		leftRearMotor.enable();
		rightFrontMotor.enable();
		rightRearMotor.enable();
		LeftShooter.enable();
		RightShooter.enable();
		// add kicker when available 
	}
}

