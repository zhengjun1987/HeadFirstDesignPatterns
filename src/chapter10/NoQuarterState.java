package chapter10;

import chapter01.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/4 15:45
 */
public class NoQuarterState implements MachineState {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println(MyUtils.getCurrentTime() + "A quarter inserted!");
        gumballMachine.setMachineState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println(MyUtils.getCurrentTime() + "No quarter inserted!");
    }

    @Override
    public void turnCrank() {
        System.out.println(MyUtils.getCurrentTime() + "A quarter inserted first!");
    }

    @Override
    public void dispense() {
        System.out.println(MyUtils.getCurrentTime() + "A quarter inserted first!");
    }
}
