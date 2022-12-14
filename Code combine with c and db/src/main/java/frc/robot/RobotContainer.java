// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.subsystems.ClimbSubsystem;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.subsystems.Drive;
import frc.robot.commands.DefaultDrive;



/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ClimbSubsystem m_ClimbSubsystem = new ClimbSubsystem();
  private XboxController controller;
  private JoystickButton rtButton;
  private JoystickButton ltButton; 
  private Drive drive;
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    controller = new XboxController(0);
   
  
    rtButton = new JoystickButton(controller, XboxController.Button.kRightBumper.value);
    ltButton = new JoystickButton(controller, XboxController.Button.kLeftBumper.value);
    drive = new Drive();
    drive.setDefaultCommand(new DefaultDrive(
      () -> controller.getLeftY(),
      () -> controller.getRightX(),
      drive
    ));
    
  
    configureButtonBindings();
  }


  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    rtButton.whenPressed(new InstantCommand(()-> {
      m_ClimbSubsystem.hook();
    } ,m_ClimbSubsystem));
    ltButton.whenPressed(new InstantCommand(()-> {
      m_ClimbSubsystem.thumb();
    } ,m_ClimbSubsystem));
    rtButton.whenReleased(new InstantCommand(()-> {
      m_ClimbSubsystem.preet();
    } ,m_ClimbSubsystem));
    ltButton.whenReleased(new InstantCommand(()-> {
      m_ClimbSubsystem.preet();
    } ,m_ClimbSubsystem));






  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */

  
}
