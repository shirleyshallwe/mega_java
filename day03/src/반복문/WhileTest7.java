package 반복문;

import java.util.Random;
import java.util.Scanner;

public class WhileTest7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Random r = new Random();
		int target = r.nextInt(100);
		int count = 0;

		while (true) {
			count++;
			System.out.println("생각한 숫자를 입력하세요");
			int data = sc.nextInt();

			if (data == target) {
				System.out.println("축하합니다. 맞췃습니다.");
				System.out.println("당신이 시도한 횟수는: " + count + "회");
				break;
			} else {
				if (data > target) {
					System.out.println("너무 큽니다");
				} else {
					System.out.println("너무 작습니다.");
				}

				System.out.println("다시하세요");
			}

		}

	}

}
