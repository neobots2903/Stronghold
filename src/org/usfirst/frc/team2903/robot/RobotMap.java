package org.usfirst.frc.team2903.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	
	//drive
    public static int RightFrontMotor = 2;
    public static int LeftFrontMotor = 3;
    public static int LeftRearMotor = 4;
    public static int RightRearMotor = 5;

    public static int RightShooter = 20;
    public static int LeftShooter = 21;
 
    // PWM
        
    //Pneumatics

    //Gyro
    public static int Gyro = 2;

    //Shooters
    public static int ShooterMotor1 = 0;
    public static int ShooterMotor2 = 1;
	
    //Lift
    public static int LiftMotor = 2;
	
    //Winch
    public static int WinchMotor = 3;
	
	public static int KickingMotor = 4;
}
