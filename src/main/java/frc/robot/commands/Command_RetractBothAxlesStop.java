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

public class Command_RetractBothAxlesStop extends Command {
  private static final Logger log = new Logger(Command_RetractBothAxlesStop.class);

  public Command_RetractBothAxlesStop() {
    requires(Robot.m_subsystemPneumatics);
    log.debug("***constructor");
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    log.debug("***initialize");
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    log.debug("***execute");
    Robot.m_subsystemPneumatics.retractBothAxlesStop();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return true;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    log.debug("***end");
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    log.debug("***interrupted");
  }
}
