// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
// This is for the climb mechanism for otherbot 1
// Which only requires two motors 

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;


import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ClimbSubsystem extends SubsystemBase {
  WPI_TalonSRX rightbisceps; 
  WPI_TalonSRX leftbisceps;
 
  public ClimbSubsystem() {
    rightbisceps = new WPI_TalonSRX(0);
    leftbisceps = new WPI_TalonSRX(1);
    
    rightbisceps.follow(leftbisceps);
  
  }
 public void hook(){
   leftbisceps.set(1);
 }
 public void preet(){
  leftbisceps.set(0);
 }
 public void thumb(){
  leftbisceps.set(-1);
 }
 @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation

  }
  public void bisceps(double m_speed) {
  }
}
