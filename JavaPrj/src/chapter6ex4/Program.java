package chapter6ex4;

import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		NumList list = new NumList();

		list.size = 0;
		list.nums = null;

		// 데이터를 int[] nums 배열에 로드하는 코드를 작성하고
		NumList.load(list);

		EXIT: while (true) {
			System.out.println("<<   메뉴   >>");
			System.out.println("1. 값 입력");
			System.out.println("2. 합계 구하기");
			System.out.println("3. 짝수의 개수 출력");
			System.out.println("4. 종료");

			System.out.printf("다음 메뉴 중 한 가지를 선택하세요 >> ");
			int menu = scan.nextInt();

			switch (menu) {

			case 1:
				// 사용자로부터 숫자 하나를 입력 받는다.
				System.out.print("숫자를 입력하세요 > ");
				scan = new Scanner(System.in);
				int num = scan.nextInt();
				NumList.add(list, num);
				System.out.println();
				break;

			case 2:
				// nums 배열의 합계를 구하고
				int sum = NumList.sum(list);
				System.out.println("배열의 합계 : " + sum);
				System.out.println();
				break;

			case 3:
				// nums 값 중에서 짝수의 개수를 구하고
				int count = NumList.getEvenNumberCount(list);
				System.out.println("짝수의 개수 : " + count);
				System.out.println();
				break;

			case 4:
				System.out.println("프로그램을 종료합니다.");
				break EXIT;

			default:

				System.out.println("잘못된 숫자를 입력하였습니다. \n1~4 중 하나를 입력하세요.");

			}
		}
	}

}