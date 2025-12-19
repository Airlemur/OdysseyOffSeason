package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.CANcoder;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkClosedLoopController;
import com.revrobotics.spark.SparkMax;

public class ModuleSubsystem {

    private  SparkMax m_driveSpark;
    private  SparkMax m_angleSpark;
    
    private RelativeEncoder m_RelativeEncoder;
    private CANcoder m_ModuleCANcoder;

    
  private SparkClosedLoopController m_drivingClosedLoopController;
  private  SparkClosedLoopController m_turningClosedLoopController;

  private double m_chassisAngularOffset = 0;

  public 

    
}
