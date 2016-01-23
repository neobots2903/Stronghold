package org.usfirst.frc.team2903.robot.subsystems;

import edu.wpi.first.wpilibj.*;
import org.usfirst.frc.team2903.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drive extends Subsystem {

	public RobotDrive hDrive = new RobotDrive(RobotMap.HDriveM1,
			RobotMap.HDriveM2, RobotMap.HDriveM3, RobotMap.HDriveM4);

	public void drive(double xAxis, double yAxis) {
		hDrive.arcadeDrive(yAxis, xAxis);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}