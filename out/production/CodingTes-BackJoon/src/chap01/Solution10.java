package chap01;

import java.util.Scanner;

/*(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.

(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.*/
public class Solution10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // 각 자릿수 구하기
        int num2_third = num2 / 100;
        int num2_second = (num2 / 10) % 10;
        int num2_first = num2 % 10;

        // 중간 곱셈 결과 계산
        int step1 = num1 * num2_first;
        int step2 = num1 * num2_second;
        int step3 = num1 * num2_third;

        // 최종 결과 계산
        int result = num1 * num2;

        // 결과 출력
        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(result);
    }
}


