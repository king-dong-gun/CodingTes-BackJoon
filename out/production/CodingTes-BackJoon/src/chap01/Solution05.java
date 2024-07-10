package chap01;

import java.util.Scanner;

// 정수 a, b를 입력 받아 두 정수의 나눗셈을 구해라
public class Solution05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        System.out.println(a / b);
    }
}
