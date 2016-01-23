package org.usfirst.frc.team2903.robot;


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
	
	
	public OI()
	{
	}
}

