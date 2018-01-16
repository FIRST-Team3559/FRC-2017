package org.usfirst.frc.team3559.robot.commands;

import org.usfirst.frc.team3559.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoExperimental extends Command {

    public AutoExperimental() {
    	requires(Robot.drivebase);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.drivebase.reset();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivebase.moveAhead(2.5);
    	Robot.drivebase.turnRight(-1);
    	Robot.drivebase.moveAhead(2.5);
    	// Robot.drivebase.turnLeft(0.25);
    	// Robot.drivebase.moveAhead(1.5);
    	Robot.drivebase.log();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivebase.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}