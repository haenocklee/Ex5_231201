package ch09_array;

import java.util.Scanner;

public class Ex05_ArrayEx {
    public static void main(String[] args) {
        /**
         * 거스름돈 계산하기
         * 필요한 거스름돈을 입력했을 때 각 동전별로 몇개가 필요한지 계산
         * ex)
         * 170이라고 입력하면
         * 100원 1개
         * 50원 1개
         * 10원 2개
         *
         * 780 이라고 입력하면
         * 500원 1개
         * 100원 2개
         * 50원 1개
         * 10원 3개
         * */
        Scanner scanner = new Scanner(System.in);
        int[] coin = {500, 100, 50, 10};
        System.out.print("거스름돈 입력:");
        int change = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < coin.length; i++) {

            count = change / coin[i];
            System.out.println(coin[i] + "원 동전" + count + "개");
            change = change % coin[i];
        }
    }
}
