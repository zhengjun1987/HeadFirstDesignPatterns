package chapter08;

import chapter01.MyUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/28 14:41
 */
public class Coffe extends Beverage {

    protected void addCondiments() {
        System.out.println(MyUtils.getCurrentTime() + "Coffe.addSugarAndMilk  " + "");
    }

    void pourInCup() {
        System.out.println(MyUtils.getCurrentTime() + "Coffe.pourInCup  " + "");
    }

    protected void brew() {
        System.out.println(MyUtils.getCurrentTime() + "Coffe.brewCoffeGrinds  " + "");
    }

    void boilWater() {
        System.out.println(MyUtils.getCurrentTime() + "Coffe.boilWater  " + "");
    }

    @Override
    protected boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;
        System.out.println(MyUtils.getCurrentTime() +"Would you like milk and sugar with your coffe?");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (answer == null) {
            answer = "no";
        }
        return answer;
    }
}
