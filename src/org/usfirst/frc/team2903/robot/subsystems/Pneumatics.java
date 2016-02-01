package org.usfirst.frc.team2903.robot.subsystems;

import org.usfirst.frc.team2903.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Solenoid;

public class Pneumatics extends Subsystem {

	public boolean isOpen = false; 
	
		
	public void openarms()
	{
		leftarmopen();
		rightarmopen();
	}
	
	public void closearms()
	{
		leftarmclose();
		rightarmclose();
	}
	
	public void leftarmopen()
	{
	}
	
	public void leftarmclose()
	{
	}
	
	public void rightarmopen()
	{
	}
	
	public void rightarmclose()
	{
	}
	
	
	public void armReset()
	{
		openarms();
	}
	
	public void armsOpenClose()
	{
		if (isOpen)
		{
			closearms();
			isOpen = false;
		}
		else
		{
			openarms();
			isOpen = true; 
		}
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	}