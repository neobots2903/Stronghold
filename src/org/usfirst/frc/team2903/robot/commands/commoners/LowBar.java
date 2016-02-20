package org.usfirst.frc.team2903.robot.commands.commoners;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class LowBar extends CommandGroup {

	public LowBar(boolean shoot) {
		super("LowBar");
		addSequential(new DriveForward(1));

		if (shoot) {
			addSequential(new AimShooter());
			addParallel(new SpinUpShooter());
			addSequential(new Shoot());
		}
	}

}
