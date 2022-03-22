package io.renren;

import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        for (int i = 0; i < n; i++) {
            String str = new Scanner(System.in).nextLine();
            if (strCount(str) > 1 || Integer.valueOf(str) % 11 == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    public static int strCount(String str) {
        int num = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == '1') {
                num++;
            }
        }
        return num;
    }

    @org.junit.Test
    public void test1() {
        String str = "1 1 -1 -1";
        String[] strs = str.split(" ");
        int num = 0;
        for (int i = 0; i < strs.length; i++) {
            int sum = Integer.parseInt(strs[i]);
            if (sum > 0) {
                num++;
            }
            for (int j = i + 1; j < strs.length; j++) {
                if ((sum *= Integer.parseInt(strs[j])) > 0) {
                    num++;
                }
            }
        }
        System.out.println(num);
    }

    @org.junit.Test
    public void test2() {
        Scanner s = new Scanner(System.in);
//        String s1 = s.nextLine();
        String s1 = "3 4";
        String[] nAndM = s1.split(" ");
        int[][] array = new int[Integer.parseInt(nAndM[0])][2];
//        for (int i = 0; i < Integer.parseInt(nAndM[0]); i++) {
//            String[] aToB = s.nextLine().split(" ");
//            array[i][0] = Integer.parseInt(aToB[0]);
//            array[i][1] = Integer.parseInt(aToB[1]);
//        }
        array[0][0] = 1;
        array[0][1] = 2;
        array[1][0] = 2;
        array[1][1] = 3;
        array[2][0] = 3;
        array[2][1] = 4;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
//            int[] cp = new int[Integer.parseInt(nAndM[1])];
//            if (array[i][0] > Integer.parseInt(nAndM[0]) || array[i][1] > Integer.parseInt(nAndM[0])) {
//                continue;
//            }
//            cp[array[i][0] - 1] = 1;
//            cp[array[i][1] - 1] = 1;
//            int sum2 = 1;
//            for (int j = i; j < array.length; j++) {
//                if ((array[j][0] <= Integer.parseInt(nAndM[0]) || array[j][1] <= Integer.parseInt(nAndM[0])) && cp[array[j][0] - 1] != 1 && cp[array[j][1] - 1] != 1) {
//                    cp[array[j][0] - 1] = 1;
//                    cp[array[j][1] - 1] = 1;
//                    sum2++;
//                }
//                if (sum2 > sum) {
//                    sum = sum2;
//                }
//            }
            int[] cp = new int[Integer.parseInt(nAndM[1])];
            if (array[i][0] > Integer.parseInt(nAndM[0]) || array[i][1] > Integer.parseInt(nAndM[0])) {
                continue;
            }
            cp[array[i][0] - 1] = 1;
            cp[array[i][1] - 1] = 1;
            int sum2 = 1;
            for (int j = i; j < array.length; j++) {
                if ((array[j][0] <= Integer.parseInt(nAndM[0]) || array[j][1] <= Integer.parseInt(nAndM[0])) && cp[array[j][0] - 1] != 1 && cp[array[j][1] - 1] != 1) {
                    cp[array[j][0] - 1] = 1;
                    cp[array[j][1] - 1] = 1;
                    sum2++;
                }
                if (sum2 > sum) {
                    sum = sum2;
                }
            }
        }
        System.out.println(sum);
//        for (int )
    }

    /**
     * 第一行两个正整数 n 和 m，表示房间有 n 个，游戏持续 m 秒。
     * <p>
     * 第二行 m 个正整数，每个正整数在1~n 的范围内，第 i 个正整数表示第 i 秒时炸弹在哪个房间生成。
     * <p>
     * 数字间有空格隔开
     * <p>
     * 数据保证 n ＜= 10 , 1 <= m <= 10000
     */
    @org.junit.Test
    public void test4() {
        String s1 = "3 10";
        String[] s = "2 3 1 3 2 1 1 2 3 1".split(" ");
        int fjs = Integer.parseInt(s1.split(" ")[0]);
        int zz = 0;
        int sum = 0;
//        for (int i = 0; )
    }

    /**
     * 第一行一个正整数n，表示这棵树共有n个节点，编号1到n。
     *
     * 第二行n个空格隔开的正整数，代表每个节点的颜色。0是白色，1是黑色。
     *
     * 接下来n个空格隔开的正整数，第 i 个正整数v表示节点 i 的父节点是v。其中，数字0表示这个节点是根。
     *
     * 1 <= n <= 10000
     *
     * 6
     * 1 0 1 1 0 0
     * 0 1 2 1 4 4
     *
     * 3 2
     *
     * 一行两个正整数，以空格分开，第一个正整数表示白色的好节点有几个，第二个正整数表示黑色的好节点有几个。
     */

    @org.junit.Test
    public void test6() {
        String s1 = "6";
        String s2 = "1 0 1 1 0 0";
        String s3 = "0 1 2 1 4 4";
        String[] s = s2.split(" ");
        String[] s4 = s3.split(" ");

    }
}
