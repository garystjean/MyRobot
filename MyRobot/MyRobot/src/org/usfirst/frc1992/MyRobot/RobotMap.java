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
    
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainLeftMotor;
    public static SpeedController driveTrainRightMotor;
    public static RobotDrive driveTrainRobotDrive2;
    public static Servo gripperServo1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainLeftMotor = new Talon(0);
        LiveWindow.addActuator("Drive Train", "Left Motor", (Talon) driveTrainLeftMotor);
        
        driveTrainRightMotor = new Talon(1);
        LiveWindow.addActuator("Drive Train", "Right Motor", (Talon) driveTrainRightMotor);
        
        driveTrainRobotDrive2 = new RobotDrive(driveTrainLeftMotor, driveTrainRightMotor);
        
        driveTrainRobotDrive2.setSafetyEnabled(true);
        driveTrainRobotDrive2.setExpiration(0.1);
        driveTrainRobotDrive2.setSensitivity(0.5);
        driveTrainRobotDrive2.setMaxOutput(1.0);
        

        gripperServo1 = new Servo(2);
        LiveWindow.addActuator("Gripper", "Servo 1", gripperServo1);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
