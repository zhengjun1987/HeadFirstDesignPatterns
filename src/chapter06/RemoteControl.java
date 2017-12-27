package chapter06;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/27 11:49
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        //NoCommand --空对象(null Object) 用来防止空指针异常\替代频繁且意义不大的判空动作
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    void setCommand(int slot,Command on,Command off){
        onCommands[slot] = on;
        offCommands[slot] = off;
    }

    void onButtonPressed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    void offButtonPressed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    void undoButtonPressed(){
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------------------Remote Control------------------\n");
        for (int i = 0; i < offCommands.length; i++) {
            stringBuffer.append("[slot "+i+"] "+onCommands[i].getClass().getSimpleName()+"  "+offCommands[i].getClass().getSimpleName()+"\n");
        }
        stringBuffer.append("[slot undo ] "+undoCommand.getClass().getSimpleName()+"\n");
        return stringBuffer.toString();
    }
}
