package org.usfirst.frc.team2903.robot.subsystems;

import org.usfirst.frc.team2903.robot.OI;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Shooter2903 extends Subsystem {

    static double highForward = 1.0;
    static double lowForward = 0.35;
    static double reverse = -0.25;
	static int count = OI.enc.get();
	static int RawCount = OI.enc.getRaw();
	
    public Shooter2903 (){
    	
    }
    
    
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

	public void enableHighGoalMode(){
		//add kicker
		OI.LeftShooter.set(highForward * -1.0);
    	OI.RightShooter.set(highForward);
    	SmartDashboard.putNumber("count", count);
    	SmartDashboard.putNumber("Rawcount", RawCount);
	}
	
	public void enableLowGoalMode(){
		//add kicker
		OI.LeftShooter.set(lowForward * -1.0);
    	OI.RightShooter.set(lowForward);
    	SmartDashboard.putNumber("count", count);
    	SmartDashboard.putNumber("Rawcount", RawCount);
	}
	
	public void enablePickupMode(){
		OI.LeftShooter.set(reverse * -1.0);
    	OI.RightShooter.set(reverse);
    	SmartDashboard.putNumber("count", count);
    	SmartDashboard.putNumber("Rawcount", RawCount);
		
	}
	
	public void disableShooter(){
		OI.LeftShooter.set(0);
    	OI.RightShooter.set(0);
		
	}
	
	public void raiseShooter(){
		//manual lifting or positions?
	}
	
	public void lowerShooter(){
		//manual lifting or positions?
	}
}
