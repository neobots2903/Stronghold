/**
 * 
 */
package org.usfirst.frc.team2903.robot.commands.commoners;

import org.usfirst.frc.team2903.robot.subsystems.Drive2903;
import org.usfirst.frc.team2903.robot.subsystems.Gyro2903;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team2903.robot.*;

/**
 * @author robotics
 *
 */
public class TurnWithGyro extends Command{

	static double TargetAngle = 0;

	enum TurnDirection {
		Left, Right
	}

	static TurnDirection turnDirection;

	public TurnWithGyro(double horizontalAngle) {
		double gyroAngle = Robot.gyroSubsystem.gyro.getAngle() % 360;
		
		if (gyroAngle != TargetAngle) {
			if (TargetAngle < 0 && gyroAngle > TargetAngle)
				Robot.driveSubsystem.tankDrive(-0.5, -0.5);
			else if (TargetAngle >= 0 && gyroAngle < TargetAngle)
				Robot.driveSubsystem.tankDrive(0.5, 0.5);
		}	

	}

	public static double getTargetAngle() {
		return TargetAngle;
	}

	public static void setTargetAngle(double targetAngle) {
		TargetAngle = targetAngle;
		// adjust angle down to one circle
		TargetAngle = TargetAngle % 360;
		if (TargetAngle < 180) {
			turnDirection = TurnDirection.Right;
		}

		else {
			TargetAngle -= 360;
			turnDirection = TurnDirection.Left;
		}
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
