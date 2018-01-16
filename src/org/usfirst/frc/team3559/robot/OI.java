package org.usfirst.frc.team3559.robot;

import edu.wpi.first.wpilibj.buttons.*;
import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc.team3559.robot.commands.*;

public class OI {
	
	private Joystick gamepad = new Joystick(0);
	private Joystick gamepad2 = new Joystick(1);
	Button ltrigger1 = new JoystickButton(gamepad, 7);
	Button rtrigger1 = new JoystickButton(gamepad, 8);
	Button greenA = new JoystickButton(gamepad2, 1);
	Button redB = new JoystickButton(gamepad2, 2);
	Button lBumper = new JoystickButton(gamepad2, 5);
	Button rBumper = new JoystickButton(gamepad2, 6);
	Button lTrigger = new JoystickButton(gamepad2, 7);
	Button rTrigger = new JoystickButton(gamepad2, 8);
	Button back = new JoystickButton(gamepad2, 9);
	Button start = new JoystickButton(gamepad2, 10);
	
	public OI() {
		ltrigger1.whileHeld(new SloBot());
		rtrigger1.whileHeld(new HiGear());
		lBumper.whileHeld(new ClimbUp());
		rBumper.whileHeld(new ToggleTAI());
		lTrigger.whileHeld(new CollectFuel());
		rTrigger.whileHeld(new ShootFuel());
		greenA.whileHeld(new dropScoop());
		redB.whileHeld(new raiseScoop());
		back.whileHeld(new UnloadFuel());
		start.whileHeld(new ReverseShooter());
		
	}
	
	public Joystick getJoystick() {
		return gamepad;
	}
	
	
}
