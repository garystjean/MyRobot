// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1992.MyRobot;

import org.usfirst.frc1992.MyRobot.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton logitechY;
    public JoystickButton logitechX;
    public JoystickButton logitechB;
    public JoystickButton logitechA;
    public Joystick logitechJoystick;
    public Joystick rCJoystic;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        rCJoystic = new Joystick(1);
        
        logitechJoystick = new Joystick(0);
        
        logitechA = new JoystickButton(logitechJoystick, 2);
        logitechA.whileHeld(new DriveBackward());
        logitechB = new JoystickButton(logitechJoystick, 3);
        logitechB.whileHeld(new TurnRight());
        logitechX = new JoystickButton(logitechJoystick, 1);
        logitechX.whileHeld(new TurnLeft());
        logitechY = new JoystickButton(logitechJoystick, 4);
        logitechY.whileHeld(new DriveForward());

	    
        // SmartDashboard Buttons
        SmartDashboard.putData("DriveForward", new DriveForward());

        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());

        SmartDashboard.putData("DriveBackward", new DriveBackward());

        SmartDashboard.putData("TurnRight", new TurnRight());

        SmartDashboard.putData("TurnLeft", new TurnLeft());

        SmartDashboard.putData("CommandGroup1", new CommandGroup1());

        SmartDashboard.putData("DriveWithRCJoystic", new DriveWithRCJoystic());

        SmartDashboard.putData("PositionServo", new PositionServo());
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getLogitechJoystick() {
        return logitechJoystick;
    }

    public Joystick getRCJoystic() {
        return rCJoystic;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

