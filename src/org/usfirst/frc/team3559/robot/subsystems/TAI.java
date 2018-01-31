package org.usfirst.frc.team3559.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *  Target Acquisition Indicator (flashlight)
 */
public class TAI extends Subsystem {
	private static DigitalOutput relaySwitch = new DigitalOutput(0);
	
	public TAI() {
		super();
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void toggle(){
    	if (this.isOn()==true) {
    		relaySwitch.set(false);
    	} else {
    		relaySwitch.set(true);
    	}
    }
    
    public void turnOff() {
    	relaySwitch.set(false);
    }
    
    public boolean isOn() {
    	return relaySwitch.get();
    }
}

