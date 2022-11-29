package frc.robot.commands;
import frc.robot.subsystems.ClimbSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class Biscepcommand extends CommandBase {
    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
    private  ClimbSubsystem m_subsystem;
    private double m_speed;
     
  
/**
 * Creates a new ExampleCommand.
 *
 * @param subsystem The subsystem used by this command.
 */
public Biscepcommand(ClimbSubsystem m_subsystem, double m_speed) {
  addRequirements(m_subsystem);
    }
  
    private void addRequirements(ClimbSubsystem m_subsystem2) {
}

    // Called when the command is initially scheduled.
    @Override
    public void initialize(){
    }
  
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
      m_subsystem.bisceps(m_speed);

    }
  
    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {}
  
    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
      return false;
    }
  }
    

