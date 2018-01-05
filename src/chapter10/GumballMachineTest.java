package chapter10;

import chapter01.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/4 15:13
 */
public class GumballMachineTest {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5,"Washington D.C.");
        System.out.println(MyUtils.getCurrentTime() + gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(MyUtils.getCurrentTime() + gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();
        System.out.println(MyUtils.getCurrentTime() + gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();
        System.out.println(MyUtils.getCurrentTime() + gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(MyUtils.getCurrentTime() + gumballMachine);
    }
}
//        2018-01-04 15:17:35:745  GumballMachine{state=1, count=5}
//        2018-01-04 15:17:35:746  A quarter inserted!
//        2018-01-04 15:17:35:746  You turned!
//        2018-01-04 15:17:35:746  A gumball coming!
//        2018-01-04 15:17:35:746  GumballMachine{state=1, count=4}
//        2018-01-04 15:17:35:746  A quarter inserted!
//        2018-01-04 15:17:35:746  Quater returned!
//        2018-01-04 15:17:35:747  A quarter inserted first!
//        2018-01-04 15:17:35:747  GumballMachine{state=1, count=4}
//        2018-01-04 15:17:35:747  A quarter inserted!
//        2018-01-04 15:17:35:747  You turned!
//        2018-01-04 15:17:35:747  A gumball coming!
//        2018-01-04 15:17:35:747  A quarter inserted!
//        2018-01-04 15:17:35:747  You turned!
//        2018-01-04 15:17:35:747  A gumball coming!
//        2018-01-04 15:17:35:747  No quarter inserted!
//        2018-01-04 15:17:35:748  GumballMachine{state=1, count=2}
//        2018-01-04 15:17:35:748  A quarter inserted!
//        2018-01-04 15:17:35:748  You cannot insert another quarter
//        2018-01-04 15:17:35:748  You turned!
//        2018-01-04 15:17:35:748  A gumball coming!
//        2018-01-04 15:17:35:748  A quarter inserted!
//        2018-01-04 15:17:35:748  You turned!
//        2018-01-04 15:17:35:748  A gumball coming!
//        2018-01-04 15:17:35:748  Oops,out of gumballs!
//        2018-01-04 15:17:35:749  You cannot insert a quarter,sold out!
//        2018-01-04 15:17:35:749  No quarter inserted!
//        2018-01-04 15:17:35:749  GumballMachine{state=0, count=0}


//        2018-01-04 17:41:58:499  GumballMachine{state=NoQuarterState, count=5}
//        2018-01-04 17:41:58:500  A quarter inserted!
//        2018-01-04 17:41:58:501  You turned!
//        2018-01-04 17:41:58:501  A gumball coming!
//        2018-01-04 17:41:58:501  Gumball released!
//        2018-01-04 17:41:58:501  GumballMachine{state=NoQuarterState, count=4}
//        2018-01-04 17:41:58:501  A quarter inserted!
//        2018-01-04 17:41:58:501  Quater returned!
//        2018-01-04 17:41:58:501  A quarter inserted first!
//        2018-01-04 17:41:58:501  A quarter inserted first!
//        2018-01-04 17:41:58:502  GumballMachine{state=NoQuarterState, count=4}
//        2018-01-04 17:41:58:502  A quarter inserted!
//        2018-01-04 17:41:58:502  You turned!
//        2018-01-04 17:41:58:502  A gumball coming!
//        2018-01-04 17:41:58:502  Gumball released!
//        2018-01-04 17:41:58:502  A quarter inserted!
//        2018-01-04 17:41:58:502  You turned!
//        2018-01-04 17:41:58:502  A gumball coming!
//        2018-01-04 17:41:58:502  Gumball released!
//        2018-01-04 17:41:58:503  No quarter inserted!
//        2018-01-04 17:41:58:503  GumballMachine{state=NoQuarterState, count=2}
//        2018-01-04 17:41:58:503  A quarter inserted!
//        2018-01-04 17:41:58:503  You cannot insert another quarter
//        2018-01-04 17:41:58:503  You turned!
//        2018-01-04 17:41:58:503  A gumball coming!
//        2018-01-04 17:41:58:503  Gumball released!
//        2018-01-04 17:41:58:503  A quarter inserted!
//        2018-01-04 17:41:58:503  You turned!
//        2018-01-04 17:41:58:504  A gumball coming!
//        2018-01-04 17:41:58:504  Gumball released!
//        2018-01-04 17:41:58:504  Oops,out of gumballs!
//        2018-01-04 17:41:58:504  You cannot insert a quarter,sold out!
//        2018-01-04 17:41:58:504  No quarter inserted!
//        2018-01-04 17:41:58:504  No gumball dispensed!
//        2018-01-04 17:41:58:505  GumballMachine{state=SoldOutState, count=0}


//        2018-01-04 18:29:51:328  GumballMachine{state=NoQuarterState, count=5}
//        2018-01-04 18:29:51:328  A quarter inserted!
//        2018-01-04 18:29:51:328  You turned!
//        2018-01-04 18:29:51:328  YOU ARE A WINNER!You got two gumballs for your quarter!
//        2018-01-04 18:29:51:328  Gumball released!
//        2018-01-04 18:29:51:328  Gumball released!
//        2018-01-04 18:29:51:328  GumballMachine{state=NoQuarterState, count=3}
//        2018-01-04 18:29:51:328  A quarter inserted!
//        2018-01-04 18:29:51:328  Quater returned!
//        2018-01-04 18:29:51:328  A quarter inserted first!
//        2018-01-04 18:29:51:328  A quarter inserted first!
//        2018-01-04 18:29:51:328  GumballMachine{state=NoQuarterState, count=3}
//        2018-01-04 18:29:51:328  A quarter inserted!
//        2018-01-04 18:29:51:328  You turned!
//        2018-01-04 18:29:51:328  A gumball coming!
//        2018-01-04 18:29:51:328  Gumball released!
//        2018-01-04 18:29:51:328  A quarter inserted!
//        2018-01-04 18:29:51:328  You turned!
//        2018-01-04 18:29:51:328  A gumball coming!
//        2018-01-04 18:29:51:328  Gumball released!
//        2018-01-04 18:29:51:328  No quarter inserted!
//        2018-01-04 18:29:51:328  GumballMachine{state=NoQuarterState, count=1}
//        2018-01-04 18:29:51:328  A quarter inserted!
//        2018-01-04 18:29:51:328  You cannot insert another quarter
//        2018-01-04 18:29:51:328  You turned!
//        2018-01-04 18:29:51:328  A gumball coming!
//        2018-01-04 18:29:51:328  Gumball released!
//        2018-01-04 18:29:51:328  Oops,out of gumballs!
//        2018-01-04 18:29:51:328  You cannot insert a quarter,sold out!
//        2018-01-04 18:29:51:328  No quarter inserted!
//        2018-01-04 18:29:51:328  No gumball dispensed!
//        2018-01-04 18:29:51:328  You cannot insert a quarter,sold out!
//        2018-01-04 18:29:51:328  No quarter inserted!
//        2018-01-04 18:29:51:328  No gumball dispensed!
//        2018-01-04 18:29:51:328  GumballMachine{state=SoldOutState, count=0}
