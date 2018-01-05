package chapter10;

import chapter01.MyUtils;

import java.util.Random;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/4 16:02
 */
public class HasQuarterState implements MachineState {
    Random random = new Random(System.currentTimeMillis());

    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println(MyUtils.getCurrentTime() + "You cannot insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println(MyUtils.getCurrentTime() + "Quater returned!");
        gumballMachine.setMachineState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println(MyUtils.getCurrentTime() + "You turned!");
        int i = random.nextInt(10);
        if (i == 0 && gumballMachine.getCount() > 1) {
            gumballMachine.setMachineState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setMachineState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println(MyUtils.getCurrentTime() + "No gumball dispensed!");
    }
}
