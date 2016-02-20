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

	double TargetAngle = 0;

	enum TurnDirection {
		Left, Right
	}

	static TurnDirection turnDirection;

	public TurnWithGyro(int targetangle) {
		TargetAngle = targetangle;
		

	}

	public  double getTargetAngle() {
		return TargetAngle;
	}

	public void setTargetAngle(double targetAngle) {
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
//		Robot.gyroSubsystem.gyro.reset();
	}

	@Override
	protected void execute() {
		double gyroAngle = Robot.gyroSubsystem.gyro.getAngle() % 360;
		boolean turnLeft = false;
		
		// TODO Auto-generated method stub
		if (TargetAngle < 0) {
			if (gyroAngle > TargetAngle)
				turnLeft = true;
			if (gyroAngle < TargetAngle)
				turnLeft = false;
		}
		else{
			if (gyroAngle > TargetAngle)
				turnLeft = false;
			if (gyroAngle < TargetAngle)
				turnLeft = true;
			
		}
			
		if (!turnLeft)
			Robot.driveSubsystem.tankDrive(-0.5, -0.5);
		else 
			Robot.driveSubsystem.tankDrive(0.5, 0.5);
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		double gyroAngle = Robot.gyroSubsystem.gyro.getAngle() % 360;
		
		if (gyroAngle >= (TargetAngle - 0.1) && gyroAngle <= (TargetAngle + 0.1) ) 
			return true;
		else
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
