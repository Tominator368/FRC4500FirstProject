package org.usfirst.frc.team4500.robot.subsystems;

import org.usfirst.frc.team4500.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ClawSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public static void Open()
	{
    	
    	RobotMap.leftClaw.set(true);
    	RobotMap.rightClaw.set(true);
	}
    
    public static void Close()
	{
    	
    	RobotMap.leftClaw.set(false);
    	RobotMap.rightClaw.set(false);
	}
}

