package chap02;

import java.util.Scanner;

public class Solution01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력: 두 정수를 입력받음
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // 비교 및 출력
        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }

        scanner.close();
    }
}

