// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive extends SubsystemBase {
  private DifferentialDrive differentialDrive;
  private WPI_TalonSRX m_frontLeft;
  private WPI_TalonSRX m_rearLeft;
  private WPI_TalonSRX m_frontRight;
  private WPI_TalonSRX m_rearRight;
  /** Creates a new ExampleSubsystem. */
  public Drive() {
    
    m_frontLeft = new WPI_TalonSRX(4);
    m_rearLeft = new WPI_TalonSRX(2);
    m_frontRight = new WPI_TalonSRX(1);
    m_rearRight = new WPI_TalonSRX(3);

    m_frontLeft.follow(m_rearLeft);
    m_frontRight.follow(m_rearRight);

    m_rearLeft.setInverted(true);
    m_frontLeft.setInverted(true);

    differentialDrive = new DifferentialDrive(m_frontLeft, m_frontRight);
  }
  public void arcadeDrive(double speed, double rotation) {
    differentialDrive.arcadeDrive(-speed, -rotation);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
