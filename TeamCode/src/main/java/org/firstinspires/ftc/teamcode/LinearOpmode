/*
This is my annotated Linear OpMode for Mecanum wheels. My annotations include meanings of keywords
and reasons why I chose to use them. I hope this helps in learning java as well as how to utilise
the specific FTC applications.
 */

/* just some basic stuff. end lines of code with a semi colon and to include code within a method,
use curly brackets.
 */



//package under java.... so under my java package is org.firstinspires.ftc...
//packages are for writing maintainable code
/*two types of packages: Built-in Packages (packages from the Java API; prewritten classes included
  in the java ide) and User-defined Packages (create your own packages)*/
/*I don't think that the file directory matters except for orginisation but just in case I got for
  java as my root */
//here I am using the keyuword package to create my own package
package org.firstinspires.ftc.teamcode;

//packages are like directories in a file system.

//importing language, utilities and other specific and reused stuff for ftc
//import package.subpackage.Class; (Import a single class)
//import package.subpackage.*;(Import the whole package)

//If you find a class you want to use, for example, the Scanner class: import java.util.Scanner;
//java.util is the package and Scanner is the class
//you can omit the classes ie DcMotor from hardware.DcMotor from the code to import the whole package
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware;  //import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;


/* Provides an easy and non-centralized way of determining the OpMode list shown on an FTC Driver
Station. (TeleOp: which is romotely operated) */
@TeleOp(name="Drive", group="Linear OpMode")
/*public class drive (name of file) inherits functionalities from the superclass LinearOpmode.
this is used so that the class drive inherents functionalities of a linear operated mode which
executes the code linearly
 */
public class Drive extends LinearOpmode {

    /* Here we are utilising the classes that we imported from earlier, you can see the class
    DcMotor (under subpackage hardware) and ElapsedTime (subpackage util) being used to create
    objects TL and so on */
    // TL = top left motor and so on
    /*
    First, you must declare a variable of the class type. This variable does not define an object.
    Instead, it is simply a variable that can refer to an object.
    */
    // class-name variable-name... ie DcMotor TL

    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor TL = new DcMotor();
    private DcMotor TR = new DcMotor();
    private DcMotor BL = new DcMotor();
    private DcMotor BR = new DcMotor();

    @overide
    // code to run once driver hits LesGo
    public void LesGo (){
        telemetry.addData("Status", "Initialised")

        /*
        HardwareMap provides a means of retrieving runtime HardwareDevice instances according to
        the names with which the corresponding physical devices were associated during robot
        configuration.
        A HardwareMap also contains an associated application context in which it was instantiated.
        Through their hardwareMap, this provides access to a Context for OpModes, as such an
        appropriate instance is needed by various system APIs.
        */
        TL = HardwareMap.get(DcMotor.class, "Top Left");
        TR = HardwareMap.get(DcMotor.class, "Top Right");
        BL = HardwareMap.get(DcMotor.class, "Bottom Left");
        BR = HardwareMap.get(DcMotor.class, "Bottom Right");



        // void is used to declare a method
    }


}
