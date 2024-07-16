package chap02;

import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력: 연도를 입력받음
        int year = scanner.nextInt();

        // 윤년 여부를 판단하고 출력
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        scanner.close();
    }
}
