package chapter6ex3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program4_new2 {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		NumList list = new NumList();

		list.size = 0;
		list.nums = null;

		// 데이터를 int[] nums 배열에 로드하는 코드를 작성하고
		load(list);

		while (true) {
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
				add(list, num);
				System.out.println();

			case 2:
				// nums 배열의 합계를 구하고
				int sum = sum(list);
				System.out.println("배열의 합계 : " + sum);
				System.out.println();

			case 3:
				// nums 값 중에서 짝수의 개수를 구하고
				int count = getEvenNumberCount(list);
				System.out.println("짝수의 개수 : " + count);
				System.out.println();

			case 4:
				System.out.println("프로그램을 종료합니다.");
				break;

			default:

				System.out.println("잘못된 숫자를 입력하였습니다. \n1~4 중 하나를 입력하세요.");

			}
		}
	}

	private static void add(NumList list, int num) {

		// 공간이 모자라면 공간을 늘려주는 작업
		// 1. list.nums.length 보다 5개 큰 배열 temp 를 준비한다.
		// list.nums.length;
		// list.size
		if (list.size == list.nums.length) {
			int[] temp = new int[list.size + 5];

			// 2. 현재 list.nums배열에 있는 값들을 temp공간에 옮긴다.
			for (int i = 0; i < list.size; i++)
				temp[i] = list.nums[i];

			// 3. temp가 참조하는 배열을 list.nums에 참조시킨다.
			list.nums = temp;
		}

		list.nums[list.size] = num;
		list.size++;

	}

	private static int getEvenNumberCount(NumList list) {

		int count = 0;
		for (int i = 0; i < list.size; i++)
			if (list.nums[i] % 2 == 0)
				count++;

		return count;
	}

	static int sum(NumList list) {

		int sum = 0;
		for (int i = 0; i < list.size; i++)
			sum += list.nums[i];

		return sum;
	}

	static void load(NumList list) throws IOException {

		FileInputStream fis = new FileInputStream("res/data.txt");
		Scanner scan = new Scanner(fis);

		list.size = scan.nextInt();
		list.nums = new int[list.size];

		for (int i = 0; i < list.size; i++) {
			list.nums[i] = scan.nextInt();
		}

		fis.close();
	}

}