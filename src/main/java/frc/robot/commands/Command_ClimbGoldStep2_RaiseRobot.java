/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.WaitCommand;

public class Command_ClimbGoldStep2_RaiseRobot extends AbstractCommand_ClimbBox {
  /**
   * Raise up the robot body to box height.
   */
  public Command_ClimbGoldStep2_RaiseRobot() {
    //
    // Make sure the compressor is running to help keep up pressure on pneumatics.
    //
    addSequential(new Command_StartCompressor());

    //
    // Extend Float Axle and Foot
    //
    addSequential(new Command_ExtendFloatAxleAndFootStart());
    addSequential(new Command_ExtendMiddleAxleStart());
    addSequential(new WaitCommand(2.0d));

    //
    // Move the mass to the back of the robot.
    //
    addSequential(new Command_MoveMassBackStart());
    addSequential(new WaitCommand(massMoverWait));
    addSequential(new Command_MoveMassBackStop());
  }
}
