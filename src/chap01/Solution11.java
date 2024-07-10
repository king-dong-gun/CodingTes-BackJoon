package chap01;

import java.util.Scanner;

/*꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!*/

// int를 쓰면 runtime에러!!!
public class Solution11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();

        // 세 수의 합 계산
        long sum = a + b + c;

        // 결과 출력
        System.out.println(sum);
    }
}
