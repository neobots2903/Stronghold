package org.usfirst.frc.team2903.robot.commands;

import org.usfirst.frc.team2903.robot.Robot;
import org.usfirst.frc.team2903.robot.commands.commoners.DriveForTime;
import org.usfirst.frc.team2903.robot.commands.commoners.TurnWithGyro;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class DriveInAOneSecondSquare extends CommandGroup {

	public DriveInAOneSecondSquare(){
		requires(Robot.driveSubsystem);
		requires(Robot.gyroSubsystem);

		Robot.gyroSubsystem.Calibrate();

		TurnWithGyro turnCmd90 = new TurnWithGyro(90); 
		TurnWithGyro turnCmd180 = new TurnWithGyro(180); 
		TurnWithGyro turnCmd270 = new TurnWithGyro(270); 
		TurnWithGyro turnCmd360 = new TurnWithGyro(360); 
		
		addSequential(new DriveForTime(1));
		addSequential(turnCmd90);
		addSequential(new DriveForTime(1));
		addSequential(turnCmd180);
		addSequential(new DriveForTime(1));
		addSequential(turnCmd270);		
		addSequential(new DriveForTime(1));
		addSequential(turnCmd360);

	}
	
}