package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Door extends SubsystemBase{
    VictorSP DoorMotor;

    public Door(){
        DoorMotor = new VictorSP(2);
    }

    public void drop(double DoorSpd){
        DoorMotor.set(DoorSpd);
    }


    public void stop(){
        DoorMotor.stopMotor();
    }
}
