
package org.usfirst.frc.team4500.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team4500.robot.OI;
import org.usfirst.frc.team4500.robot.Robot;
import org.usfirst.frc.team4500.robot.RobotMap;

/**
 *
 */
public class ExampleCommand extends Command {

    public ExampleCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.exampleSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	RobotMap.isMoving = true;
    	Robot.exampleSubsystem.MoveForward();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	//issues?
    	if(RobotMap.isMoving = true)
    	{
    		return false;
    	} 
    	else
    	{
    		return true;
    	}
       
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.exampleSubsystem.Stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
