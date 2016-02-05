package org.usfirst.frc.team2903.robot.subsystems;

import org.usfirst.frc.team2903.robot.OI;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {

    static double highForward = 1.0;
    static double lowForward = 0.35;
    static double reverse = -0.25;
	
    public Shooter (){
    
    	
    }
    
    
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

	public void enableHighGoalMode(){
		OI.LeftShooter.set(highForward * -1.0);
    	OI.RightShooter.set(highForward);
		
	}
	
	public void enableLowGoalMode(){
		OI.LeftShooter.set(lowForward * -1.0);
    	OI.RightShooter.set(lowForward);
	}
	
	public void enablePickupMode(){
		OI.LeftShooter.set(reverse * -1.0);
    	OI.RightShooter.set(reverse);
		
	}
	
	public void disableShooter(){
		OI.LeftShooter.set(0);
    	OI.RightShooter.set(0);
		
	}
	
	public void raiseShooter(){
		
	}
	
	public void lowerShooter(){
		
	}
}
