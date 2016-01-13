
package org.usfirst.frc.team4500.robot.subsystems;

import org.usfirst.frc.team4500.robot.RobotMap;
import org.usfirst.frc.team4500.robot.commands.WheelAxisCommand;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ExampleSubsystem extends Subsystem {
	
	private static Talon FLeftTalon;
	private static Talon FRightTalon;
	private static Talon BLeftTalon;
	private static Talon BRightTalon;
	private static RobotDrive drive;
	
	 public ExampleSubsystem()
	 {
	    FLeftTalon = new Talon(RobotMap.fLeftTalon);
	    FRightTalon = new Talon(RobotMap.fRightTalon);
	    BLeftTalon = new Talon(RobotMap.bLeftTalon);
	    BRightTalon = new Talon(RobotMap.bRightTalon);
	    drive = new RobotDrive(FLeftTalon, FRightTalon, BLeftTalon, BRightTalon);
	 }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
    	setDefaultCommand(new WheelAxisCommand());
    	
    }
    
    public void MoveForward()
	{
    	//if(RobotMap.MoveForwardCounter < 50)
    	//{
    	FLeftTalon.set(0.2);
    	FRightTalon.set(0.2);
    	BLeftTalon.set(0.2);
    	BRightTalon.set(0.2);
    	//RobotMap.MoveForwardCounter ++;
    	//}
    //	else
    	//{
    	//	OI.finishedMove = true;
    	//}
	}
    
    public void Stop()
	{
    	FLeftTalon.stopMotor();
    	FRightTalon.stopMotor();
    	BLeftTalon.stopMotor();
    	BRightTalon.stopMotor();
	}
    
    public void drive(double x, double y, double twist)
    {
    	drive.mecanumDrive_Cartesian(x, y, twist, 0);
    }
    

}

