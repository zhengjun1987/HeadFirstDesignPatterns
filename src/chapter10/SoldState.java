package chapter10;

import chapter01.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/4 17:03
 */
public class SoldState implements MachineState {

    private final GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println(MyUtils.getCurrentTime() + "Please wait!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println(MyUtils.getCurrentTime() + "No quarter inserted!");
    }

    @Override
    public void turnCrank() {
        System.out.println(MyUtils.getCurrentTime() + "No more Candy!");
    }

    @Override
    public void dispense() {
        System.out.println(MyUtils.getCurrentTime() + "A gumball coming!");
        gumballMachine.release();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setMachineState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println(MyUtils.getCurrentTime() + "Oops,out of gumballs!");
            gumballMachine.setMachineState(gumballMachine.getSoldOutState());
        }
    }
}
