
package org.usfirst.frc.team4500.robot.subsystems;

import org.usfirst.frc.team4500.robot.RobotMap;
import org.usfirst.frc.team4500.robot.commands.ExampleCommand;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ExampleSubsystem extends Subsystem {
    

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ExampleCommand());
    	
    }
    
    public void MoveForward()
	{
    	//if(RobotMap.MoveForwardCounter < 50)
    	//{
    	RobotMap.FLeftTalon.set(0.2);
    	RobotMap.FRightTalon.set(0.2);
    	RobotMap.BLeftTalon.set(0.2);
    	RobotMap.BRightTalon.set(0.2);
    	RobotMap.MoveForwardCounter ++;
    	//}
    	//else
    	//{
    	//	Stop();
    	//}
	}
    
    public void Stop()
	{
    	RobotMap.FLeftTalon.stopMotor();
    	RobotMap.FRightTalon.stopMotor();
    	RobotMap.BLeftTalon.stopMotor();
    	RobotMap.BRightTalon.stopMotor();
	}

}

