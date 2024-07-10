package Baekjoon;

import java.util.Scanner;

public class No2839 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;

        while (N > 0) {
            if (N % 5 == 0) {
                result += N / 5;
                break;
            }

            N -= 3;
            result++;

            if (N == 0) {
                break;
            } else if (N < 3) {
                result = -1;
                break;
            }

        }
        System.out.printf("%d", result);
    }
}

