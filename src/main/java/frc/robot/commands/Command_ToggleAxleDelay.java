/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Logger;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class Command_ToggleAxleDelay extends Command {
  private static final Logger log = new Logger(Command_ToggleAxleDelay.class);

  public Command_ToggleAxleDelay() {
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    log.debug("***execute");
    if (Robot.m_oi.getAxleDelay()!=0.0d) {
      Robot.m_oi.setAxleDelay(0.0d);
    } else {
      Robot.m_oi.setAxleDelay(RobotMap.axleDelay);
    }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
