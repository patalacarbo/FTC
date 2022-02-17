package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

public class Wheels {
    public DcMotor TL = new DcMotor();
    public DcMotor TR = new DcMotor();
    public DcMotor BL = new DcMotor();
    public DcMotor BR = new DcMotor();

    public void Wheels();
    TL = null;
    TR = null;
    BL = null;
    BR = null;

    public void vroom();
    double side = robot.gamepad1.left_stick_y;
    double front = robot.gamepad1.left_stick_x;
}
