package org.usfirst.frc.team2903.robot.commands.commoners;

import org.usfirst.frc.team2903.robot.Robot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public  class DriveForTime extends Command{
	double TimeForDistance;
	double timeInSeconds;
	Timer timer = new Timer();
	public DriveForTime(double timeInSeconds){
		super("DriveForTime");
		requires(Robot.driveSubsystem);
		TimeForDistance =timer.get();
	}
	
	protected void initialize(){
		//TODO Auto-generated method stub
		timer.reset();
		timer.start();
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.driveSubsystem.arcadeDrive(.5, 0);
	}
	
	@Override
	
	protected boolean isFinished() {
		// TODO Auto-generated method stub

		if(TimeForDistance == timeInSeconds){
			
		}
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		timer.stop();
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}
}