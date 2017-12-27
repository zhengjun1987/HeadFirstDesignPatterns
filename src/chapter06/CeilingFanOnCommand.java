package chapter06;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/27 14:40
 */
public class CeilingFanOnCommand implements Command {
    private CeilingFan ceilingFan;
    private int previusSpeed;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        previusSpeed = ceilingFan.getSpeed();
        ceilingFan.on(CeilingFan.LOW);
    }

    @Override
    public void undo() {
        switch (previusSpeed) {
            case 0:
                ceilingFan.off();
                break;
            default:
                ceilingFan.on(previusSpeed);
        }
    }
}
