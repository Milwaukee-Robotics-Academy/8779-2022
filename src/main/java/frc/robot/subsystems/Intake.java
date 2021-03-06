/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import io.github.oblarg.oblog.Loggable;
import io.github.oblarg.oblog.annotations.Config;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import static frc.robot.Constants.IntakeConstants;

public class Intake extends SubsystemBase implements Loggable {
  /**
   * Creates a new Intake.
   */
  private final Spark intake = new Spark(IntakeConstants.kIntakeMotor);

 
   public Intake() {

  }

  /**
   * This moves the intake mechanism up, towards the robot
   */
  @Config
  public void moveUp () {
  
  }
  
  /**
   * This moves the intake mechanism down, towards the floor
   */
  @Config
  public void moveDown () {

  }

  /**
   * This moves the motors so the ball goes into the robot at full speed
   */
  public void rotateIn() {
    intake.set(-.45);
  }

  /**
   * This moves the motors so the ball goes into the robot at full speed
   */
  @Config
  public void rotate(int speed) {
    intake.set(-speed);
  }

  /**
   * This moves the motors so the ball goes out of the robot at full speed
   */
  public void rotateOut() {
    intake.set(.6);
  }

  /**
   * This stops the motors from moving
   */
  public void rotateStop () {
    intake.stopMotor();
  }
}
