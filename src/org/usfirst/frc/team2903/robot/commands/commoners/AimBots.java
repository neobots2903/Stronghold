package org.usfirst.frc.team2903.robot.commands.commoners;

import org.usfirst.frc.team2903.robot.Robot;

public class AimBots {

	//We need to convert pixels to motor movements
	//To add a note i can change the size of the image. Currently its 400 to 280
	
	public void Aim() {
		int index = 0;

		index = Robot.cameraSubsystem.GetBiggestAreaIndex();
		
		double offsetX = Robot.cameraSubsystem.GetOffsetX(index); 
		if (offsetX < -5) {
			// then move robot to the left
		}
		if (offsetX > 5) {
			// then move robot to the right
		}
		
		double offsetBound = Robot.cameraSubsystem.GetOffsetBounding(index);
		if (offsetBound < -5) {
			// move shooter up
		}
		if (offsetBound > 5) {
			// move shooter down
		}
		  
		if (offsetX > -5 && offsetX < 5 && offsetBound > -5 && offsetBound < 5) {
			// FIRE THE CANNONS!!!
		}
	}
}
