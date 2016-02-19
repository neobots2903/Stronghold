package org.usfirst.frc.team2903.robot.commands.commoners;


import org.usfirst.frc.team2903.robot.*;
import org.usfirst.frc.team2903.robot.Robot;
import org.usfirst.frc.team2903.robot.subsystems.Drive2903;
import org.usfirst.frc.team2903.robot.subsystems.Gyro2903;
import org.usfirst.frc.team2903.robot.subsystems.Arm2903;

import edu.wpi.first.wpilibj.command.Command;

public class LiftPortcullis  extends Command {

	static double ArmTargetAngle;
	private double ArmMoveSpeed;
	
	public LiftPortcullis()
	{
		super("LiftPortcullis");
		
		requires(Robot.armSubsystem);
		
		// TODO: Set this to an appropriate value
		ArmTargetAngle = 45; 
		ArmMoveSpeed = 0.1;
	}
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
		// get the current value of the potentiometer
		// and use that as the reset value
		 Robot.armSubsystem.calibrate();
		 Robot.armSubsystem.setTargetAngle(ArmTargetAngle);
		 Robot.armSubsystem.setMotorSpeed(ArmMoveSpeed);
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.armSubsystem.moveArm();
	}

	@Override
	protected boolean isFinished() {
		
		// TODO Auto-generated method stub
		return Robot.armSubsystem.isTargetReached();
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Robot.armSubsystem.stopArm();
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		end();
		
	}

}
