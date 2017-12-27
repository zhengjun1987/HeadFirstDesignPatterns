package chapter06;

import chapter01.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/27 14:47
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoom = new Light("Living Room");
        Light kitchen = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan();
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoom);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoom);
        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchen);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchen);
        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0,livingRoomLightOnCommand,livingRoomLightOffCommand);
        remoteControl.setCommand(1,kitchenLightOnCommand,kitchenLightOffCommand);
        remoteControl.setCommand(2,ceilingFanOnCommand,ceilingFanOffCommand);
        remoteControl.setCommand(3,garageDoorOpenCommand,garageDoorCloseCommand);
        remoteControl.setCommand(4,stereoOnCommand,stereoOffCommand);

        System.out.println(MyUtils.getCurrentTime() +remoteControl);

        remoteControl.onButtonPressed(0);
        remoteControl.offButtonPressed(0);
        System.out.println(MyUtils.getCurrentTime() +remoteControl);
        remoteControl.undoButtonPressed();
        remoteControl.offButtonPressed(0);
        remoteControl.onButtonPressed(0);
        System.out.println(MyUtils.getCurrentTime() +remoteControl);
        remoteControl.onButtonPressed(1);
        remoteControl.undoButtonPressed();
        remoteControl.onButtonPressed(2);
        remoteControl.undoButtonPressed();
        remoteControl.onButtonPressed(3);
        remoteControl.offButtonPressed(3);
        remoteControl.onButtonPressed(4);
        remoteControl.offButtonPressed(4);
    }
//2017-12-27 15:42:06:834
//------------------Remote Control------------------
//[slot 0] LightOnCommand  LightOffCommand
//[slot 1] LightOnCommand  LightOffCommand
//[slot 2] CeilingFanOnCommand  CeilingFanOffCommand
//[slot 3] GarageDoorOpenCommand  GarageDoorCloseCommand
//[slot 4] StereoOnCommand  StereoOffCommand
//[slot 5] NoCommand  NoCommand
//[slot 6] NoCommand  NoCommand
//[slot undo ] NoCommand
//
//2017-12-27 15:42:06:835  Living Room  Light.on
//2017-12-27 15:42:06:835  Living Room  Light.off
//2017-12-27 15:42:06:835
//        ------------------Remote Control------------------
//            [slot 0] LightOnCommand  LightOffCommand
//[slot 1] LightOnCommand  LightOffCommand
//[slot 2] CeilingFanOnCommand  CeilingFanOffCommand
//[slot 3] GarageDoorOpenCommand  GarageDoorCloseCommand
//[slot 4] StereoOnCommand  StereoOffCommand
//[slot 5] NoCommand  NoCommand
//[slot 6] NoCommand  NoCommand
//[slot undo ] LightOffCommand
//
//2017-12-27 15:42:06:835  Living Room  Light.on
//2017-12-27 15:42:06:836  Living Room  Light.off
//2017-12-27 15:42:06:836  Living Room  Light.on
//2017-12-27 15:42:06:836
//        ------------------Remote Control------------------
//            [slot 0] LightOnCommand  LightOffCommand
//[slot 1] LightOnCommand  LightOffCommand
//[slot 2] CeilingFanOnCommand  CeilingFanOffCommand
//[slot 3] GarageDoorOpenCommand  GarageDoorCloseCommand
//[slot 4] StereoOnCommand  StereoOffCommand
//[slot 5] NoCommand  NoCommand
//[slot 6] NoCommand  NoCommand
//[slot undo ] LightOnCommand
//
//2017-12-27 15:42:06:836  Kitchen  Light.on
//2017-12-27 15:42:06:836  Kitchen  Light.off
//2017-12-27 15:42:06:836  CeilingFan{speed=1}
//2017-12-27 15:42:06:836  CeilingFan{speed=0}
//2017-12-27 15:42:06:837  GarageDoor.up
//2017-12-27 15:42:06:837  GarageDoor.lightOn
//2017-12-27 15:42:06:837  GarageDoor.down
//2017-12-27 15:42:06:837  GarageDoor.lightOff
//2017-12-27 15:42:06:838  GarageDoor.stop
//2017-12-27 15:42:06:838  Stereo.on
//2017-12-27 15:42:06:838  Stereo.off
}
