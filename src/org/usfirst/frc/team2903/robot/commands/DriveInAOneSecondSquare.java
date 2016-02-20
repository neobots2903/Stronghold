package org.usfirst.frc.team2903.robot.commands;

import org.usfirst.frc.team2903.robot.commands.commoners.DriveForTime;
import org.usfirst.frc.team2903.robot.commands.commoners.TurnWithGyro;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class DriveInAOneSecondSquare extends CommandGroup {

	public DriveInAOneSecondSquare(){
		
		addSequential(new DriveForTime(1));
		addSequential(new TurnWithGyro(90));
	}
}