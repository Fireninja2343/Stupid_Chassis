// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package Chassis;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;





public class Chassis extends SubsystemBase {
  /** Creates a new Chassis. */
  final int RIGHT_MASTER_PORT = 1;
  final int LEFT_MASTER_PORT = 2;
  final int RIGHT_SLAVE_PORT = 3;
  final int LEFT_SLAVE_PORT = 4;
  double ForwardSpeed = 0.8;
  public Chassis() {
    Talon RightMaster = new Talon(RIGHT_MASTER_PORT);
    Talon LeftMaster = new Talon(LEFT_MASTER_PORT);
    Talon RightSlave = new Talon(RIGHT_SLAVE_PORT);
    Talon LeftSlave = new Talon(LEFT_SLAVE_PORT);

    Rightslave.follow(RightMaster);
    LeftSlave.follow(LeftMaster);


  }
  public void Forward() {
    RightMaster.Set(ForwardSpeed);
    LeftMaster.Set(ForwardSpeed);
  }
 
  public void MoveRight(){
    RightMaster.Set(-ForwardSpeed);
    LeftMaster.Set(ForwardSpeed);
  }
  public void MoveLeft(){
    RightMaster.Set(ForwardSpeed);
    LeftMaster.Set(-ForwardSpeed);
  }
  public void BackWard(){
    RightMaster.Set(-ForwardSpeed);
    LeftMaster.Set(-ForwardSpeed);
  }
 public void StopMoving(){
    RightMaster.Set(0);
    LeftMaster.Set(0);
  
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    




  }
}
