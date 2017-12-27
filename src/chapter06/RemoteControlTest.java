package chapter06;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/27 11:30
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light("LivingRoom");
        simpleRemoteControl.setSlot(new LightOnCommand(light));
        simpleRemoteControl.buttonPressed();
        simpleRemoteControl.setSlot(new GarageDoorOpenCommand(new GarageDoor()));
        simpleRemoteControl.buttonPressed();
    }
//    2017-12-27 11:41:48:397  Light.on
//    2017-12-27 11:41:48:399  GarageDoor.up
}
