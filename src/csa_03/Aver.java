package csa_03;

import java.util.Scanner;

public class Aver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("请输入整数的个数 N：");
                n = scanner.nextInt();
                if (n < 0) {
                    throw new NegativeNumberException("N 必须是正数或者 0");
                }
                validInput = true;
            } catch (NegativeNumberException e) {
                System.out.println("异常：" + e.getMessage());
                scanner.nextLine();
            }
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("请输入第 " + i + " 个整数：");
            int num = scanner.nextInt();
            sum += num;
        }

        double average = (double) sum / n;
        System.out.println("平均值为：" + average);
    }
}
