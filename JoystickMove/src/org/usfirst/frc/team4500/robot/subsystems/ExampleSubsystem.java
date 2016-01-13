
package org.usfirst.frc.team4500.robot.subsystems;

import org.usfirst.frc.team4500.robot.OI;
import org.usfirst.frc.team4500.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ExampleSubsystem extends Subsystem {
    

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
       // setDefaultCommand(new ExampleCommand());
    	
    }
    
    public static void MoveForward()
	{
    	//if(RobotMap.MoveForwardCounter < 50)
    	//{
    	RobotMap.FLeftTalon.set(0.2);
    	RobotMap.FRightTalon.set(0.2);
    	RobotMap.BLeftTalon.set(0.2);
    	RobotMap.BRightTalon.set(0.2);
    	//RobotMap.MoveForwardCounter ++;
    	//}
    //	else
    	//{
    	//	OI.finishedMove = true;
    	//}
	}
    
    public static void Stop()
	{
    	System.out.println("Test");
    	RobotMap.FLeftTalon.stopMotor();
    	RobotMap.FRightTalon.stopMotor();
    	RobotMap.BLeftTalon.stopMotor();
    	RobotMap.BRightTalon.stopMotor();
	}

}

