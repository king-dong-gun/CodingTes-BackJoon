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
// 윤년 자바 계산 법

/*윤년은 해당 연도를 4로 나눈 값이 0인 것을 의미한다.
 그중 100으로 나눈 값이 0인 것은 윤년에서 제외하나,
  400으로 나눈 값이 0인 것은 윤년으로 포함된다. 그 외의 나머지 연도는 평년이다.
*/
