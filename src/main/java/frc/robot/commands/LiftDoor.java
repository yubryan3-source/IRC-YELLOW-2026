package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Door;

public class LiftDoor extends Command{
    private Door door;
    private double Mov;

    public LiftDoor(Door door, double Mov){
        this.door = door;
        this.Mov = Mov;
        addRequirements(door);
    }

    @Override
    public void initialize(){
        door.drop(Mov);
    }

    @Override
    public void end(boolean i){
        door.stop();
    }
}
