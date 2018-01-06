package chapter05;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/25 17:24
 */
public class MyClass {
    private MyClass() {
    }

    public static MyClass getInstance() {
        return new MyClass();
    }

    public static void main(String[] args) {
        System.out.println("");
        float n1 = 3.0f;
        double n2 = 3.0;
        long n3 = 2000000000, n4 = 1234567890;
//        System.out.printf("%.1e %.1e %.1e %.1e\n", n1, n2, n3, n4);
//3.0e+00 3.0e+00 0.0e+00 4.1e+233
        System.out.printf("%ld %ld\n", n3, n4);
//2000000000 1234567890
        System.out.printf("%ld %ld %ld %ld\n", n1, n2, n3, n4);
//2000000000 1234567890 8699159249821827075 140735701839736
    }
}
