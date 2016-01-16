package org.usfirst.frc.team4500.robot.subsystems;

import org.usfirst.frc.team4500.robot.commands.LiftLowerCommand;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LiftSubsystem extends Subsystem {
	
	private static Talon motorTalon;
	
	public LiftSubsystem()
	{
		motorTalon = new Talon(4);
	}
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new LiftLowerCommand());
    }
    
    public static void liftUp()
    {
    	motorTalon.set(0.6);
    }
    
    public static void liftLower()
    {
    	motorTalon.set(0.2);
    }
}

