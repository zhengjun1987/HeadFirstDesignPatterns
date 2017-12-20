package chapter01;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2017/12/21
 * Project:HeadFirstDesignPatterns
 */
public class MyUtils {
    public static String getCurrentTime(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS  ").format(new Date());
    }
}
