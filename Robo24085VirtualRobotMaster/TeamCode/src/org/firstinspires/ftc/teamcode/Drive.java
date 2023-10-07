package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import pkg24085.Robot24085Mecanum;

@TeleOp(name = "Drive", group = "TeleOp")
public class Drive extends OpMode {

    Robot24085Mecanum<Drive> robot = new Robot24085Mecanum<>();

    @Override
    public void init() { robot.init(this); }

    @Override
    public void loop() { robot.drive(); }
}