package org.usfirst.frc.team2903.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	// drive
	public static int RightTopMotor = 30;
	public static int LeftTopMotor = 31;
	public static int LeftBottomMotor = 33;
	public static int RightBottomMotor = 32;

	public static int RightShooter = 36;
	public static int LeftShooter = 37;

	public static int armMotor = 34;
	
	//Limit Switches
	public static int botLimitSwitch = 4;//port subjected to change
    public static int topLimitSwitch = 5;//port subjected to change

	// PWM

	// Pneumatics

	// Gyro
	public static int Gyro = 0;

	// Shooters
	public static int ShooterMotor1 = 0;
	public static int ShooterMotor2 = 1;

	// Lift
	public static int LiftMotor = 2;

	// Winch
	public static int WinchMotor = 3;

	public static int KickingMotor = 4;
}
