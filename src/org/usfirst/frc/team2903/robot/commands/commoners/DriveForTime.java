package org.usfirst.frc.team2903.robot.commands.commoners;

import org.usfirst.frc.team2903.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public  class DriveForTime extends Command{
	double TimeForDistance;
	
	public DriveForTime(double time){
		super("DriveDistance");
		TimeForDistance = time;
	}
	
	protected void initialize(){
		//TODO Auto-generated method stub
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