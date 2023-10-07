package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import pkg24085.Robot24085Mecanum;

@Autonomous(name = "Auto", group = "Autonomous")
public class Auto extends LinearOpMode {

    Robot24085Mecanum<Auto> robot = new Robot24085Mecanum<>();

    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(this);
        waitForStart();
    }
}