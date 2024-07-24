package JasminTestFiles;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static String f2(int a, String b, boolean c) {
        return "2";
    }

    public static String f3() {
        return "3";
    }

    public static String f1() {
        if (true) {
            return "1";
        }
        f3();
        return "11";
    }

    public static int f4(int v) {
        return v;
    }

    public static int f5() {
        return 2;
    }

    public static List<Integer> f6() {
        return Arrays.asList(1, 2, 3, 4);
    }

    public static void main(String[] args) {
        f1();
        f4(1);
        f5();
        f6();
    }
}
