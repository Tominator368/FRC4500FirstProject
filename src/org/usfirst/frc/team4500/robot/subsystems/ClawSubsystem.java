package org.usfirst.frc.team4500.robot.subsystems;

import org.usfirst.frc.team4500.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ClawSubsystem extends Subsystem {
	
	private static DoubleSolenoid claw;
	
	public ClawSubsystem()
	{
		DoubleSolenoid claw = new DoubleSolenoid(RobotMap.clawSolenoidL, RobotMap.clawSolenoidR);
	}
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public static void Open()
   	{
       	RobotMap.Claw.set(Value.kForward);
   	}
       
       public static void Close()
   	{
       	RobotMap.Claw.set(Value.kReverse);
   	}
}

