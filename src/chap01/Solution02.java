package chap01;

import java.util.Scanner;

// 정수 a, b를 입력 받아 두 정수의 합을 구해라
public class Solution02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
    }
}
