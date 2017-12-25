package chapter03;

import chapter01.MyUtils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/25 10:42
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            System.out.println(MyUtils.getCurrentTime() + "InputTest.main  " + "args = [" + args + "]");
            LowerCaseInputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("README.md")));
            while ((c = in.read()) >= 0) {
                System.out.print(((char)c));
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//        2017-12-25 11:00:34:734  InputTest.main  args = [[Ljava.lang.String;@610455d6]
//        2017-12-25 11:00:34:735  LowerCaseInputStream.LowerCaseInputStream  in = [java.io.BufferedInputStream@511d50c0]
//        # headfirstdesignpatterns
//        ãhead firstè®¾è®¡æ¨¡å¼ãè¯»ä¹¦ä»£ç åº
//        ç¬¬ä¸ç«  ç­ç¥æ¨¡å¼
//        ç¬¬äºç«  è§å¯èæ¨¡å¼
//        ç¬¬ä¸ç«  è£é¥°æ¨¡å¼
//
//        Process finished with exit code 0
