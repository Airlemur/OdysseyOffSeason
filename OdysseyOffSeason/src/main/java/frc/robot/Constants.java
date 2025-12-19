// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
package frc.robot;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.trajectory.TrapezoidProfile;
import edu.wpi.first.math.util.Units;


/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class DriveConstants {

    //bu noktadan sonrası og NEHİR kodu

    public static final double Max_Speed_PS = 1.1;
    //en fazla ulaşılan hız limiti
    public static final double Max_Angular_Speed = 2 * Math.PI;
    //en fazla dönülebilecek hız radyan cinsinden

    //KASA ÖLÇÜLERİ
    public static final double Track_Width = Units.inchesToMeters(1.38);
    //kasa genişliği metre cinsinden
    public static final double Track_Length = Units.inchesToMeters(1.38);
    //örneğimde wheel base olarak yazılmış ama aynı şey gibi geliyo

    //robota büyüklüğünü anlatmamız gerekiyo doğru anladıysam bu kinematik o
    //swerve kinematiklerini bir şekilde zaten var olan bir şey olarak gösteriyo SORUCAM
    public static final SwerveDriveKinematics ben_Drive_Kinematics = new SwerveDriveKinematics(
      new Translation2d(Track_Length / 2, Track_Width / 2),
      new Translation2d(Track_Length / 2, -Track_Width / 2),
      new Translation2d(-Track_Length / 2, Track_Width / 2),
      new Translation2d(-Track_Length / 2, -Track_Width / 2));


      //angular offset bizim robotun 0 derecesi ile bizim düzümüzü mekanik olarak eşitleme işi
      //değerleri örneğimden baktım değerler neye göre verilecek bilmiyorum SORACAĞIM
      public static final double FL_Chasis_Angular_Offset = -Math.PI / 2;
      public static final double FR_Chasis_Angular_Offset = 0;
      public static final double BL_Chasis_Angular_Offset = Math.PI;
      public static final double BR_Chasis_Angular_Offset = Math.PI / 2;

      //her spark max için ayrı ayrı CANID
      //turningler için farklı spark maxlar mı var niye çok fazla SORACAĞIM
      public static final int FL_Driving_CanId = 20;
      public static final int FR_Driving_CanId = 22;
      public static final int BL_Driving_CanId = 24;
      public static final int BR_Driving_CanId = 26;
      
      public static final int FL_Turning_CanId = 21;
      public static final int FR_Turning_CanId = 23;
      public static final int BL_Turning_CanId = 25;
      public static final int BR_Turning_CanId = 27;

      public static final int FL_CanCoderID = 30;
      public static final int FR_CanCoderID = 31;
      public static final int BL_CanCoderID = 32;
      public static final int BR_CanCoderID = 33;


      public static final boolean GyroReverse = false;
      //gyro ters olursa çevirmek için
      //ama değiştirmek istiyorsak niye final görünüyo örneğimde anlamadım SORACAĞIM
  }

  public static final class Module_Constants{
    //swerve modelin mekanik kısmındaki sabit değerler içiin
    public static final int Driving_Motor_PinionTeeth = 14;
    //motor çark uç sayıları

    public static final double Driving_Motor_FreeSpeedRPS = NeoMotor_Constants.Free_Speed_RPM / 60;
    //motorun serbestken döndüğü sayı

    public static final double Wheel_Diameter_Metres = 0.1016;
    // teker genişliği 

    public static final double Wheel_Circumference_Metres = Wheel_Diameter_Metres * Math.PI;
    //teker çapı yine hangi cins acaba 

  public static final double Driving_Motor_Reduction = 8.14;
  public static final double Driving_Wheel_SpeedFreeRPS = (Driving_Motor_FreeSpeedRPS * Wheel_Circumference_Metres) / Driving_Motor_Reduction;
  }

  public static final class OI_Constants{
    public static final int Driver_Controller_Port = 0;
    public static final double Drive_Deadband = 0.05;
    //deadband controller kaymasın diye verilir
  }

  public static final class Auto_Constants{
    //otonom constantları
    public static final double Max_Speed_Meters_Per_Second = 67.67;
    //otonomda uçmasın diye
    public static final double Max_Acceleration_Meters_Per_Second_Squared = 67.67;
    //max ivme yine uçmasın diye
    public static final double Max_Angular_Speed_Radians_Per_Second = Math.PI;
    //dönerek uçmasın diye
    public static final double Max_Angular_Speed_Radians_Per_Second_Squared = Math.PI;

    public static final double PX_Controller = 1;
    public static final double PY_Controller = 1;
    public static final double P_ThetaController = 1;
    //controller için x y değerleri

    public static final TrapezoidProfile.Constraints kThetaControllerConstraints = new TrapezoidProfile.Constraints(Max_Angular_Speed_Radians_Per_Second, Max_Angular_Speed_Radians_Per_Second_Squared);

  }

  public static final class NeoMotor_Constants{
    public static final double Free_Speed_RPM = 67.67;
  }
}
