package org.usfirst.frc.team2903.robot.subsystems;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class CameraVision2903 extends Subsystem {

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

		NetworkTable table;
		table = NetworkTable.getTable("GRIP/imageResults");

		double[] defaultValue = new double[0];

		while (true) {
			double[] areas = table.getNumberArray("area", defaultValue);
			double[] centerYs = table.getNumberArray("centerY", defaultValue);
			double[] centerXs = table.getNumberArray("centerX", defaultValue);
			double[] heights = table.getNumberArray("height", defaultValue);
			double[] widths = table.getNumberArray("width", defaultValue);
			double[] boundingTop = heights.clone();
			double[] offsetX = centerXs.clone();

			int  x = boundingTop.length;
			for (int i = 0; i < x; i++) {
				boundingTop[i] /= 2;
				boundingTop[i] += centerYs[i];
			}
			System.out.print("areas: ");
			for (double area : areas) {
				System.out.print(area + " ");
			}	
			
			System.out.print("centerYs: ");
				for (double centerY : centerYs) {
					System.out.print(centerY + " ");
			}
				
			System.out.print("centerXs: ");
				for (double centerX : centerXs) {
					System.out.print(centerX + " ");
			}
				
			System.out.print("heights: ");
				for (double height : heights) {
					System.out.print(height + " ");
			}
				
			System.out.print("widths: ");
				for (double width : widths) {
					System.out.print(width + " ");
			}
			System.out.println();
			Timer.delay(1);
		}

	}

}
