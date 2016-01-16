package org.usfirst.frc.team4500.robot.subsystems;

import org.usfirst.frc.team4500.robot.RobotMap;
import org.usfirst.frc.team4500.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */

public class TalonSubsystem extends Subsystem {
	private static Talon fLeftTalon;
	private static Talon fRightTalon;
	private static Talon bLeftTalon;
	private static Talon bRightTalon;
	private static RobotDrive drive;
	
	public TalonSubsystem()
	{
		 fLeftTalon = new Talon(RobotMap.fLeftTalon);
		 fRightTalon = new Talon(RobotMap.fRightTalon);
		 bLeftTalon = new Talon(RobotMap.bLeftTalon);
		 bRightTalon = new Talon(RobotMap.bRightTalon);
		 drive = new RobotDrive(fLeftTalon, fRightTalon, bLeftTalon, bRightTalon);
	}
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveCommand());
    }
    
    public void drive(double x, double y, double twist)
    {
    	drive.mecanumDrive_Cartesian(x*RobotMap.MotorSpeed, y*RobotMap.MotorSpeed, twist*RobotMap.MotorSpeed, 0);
    }
}

