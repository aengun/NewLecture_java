package chapter7ex2;

import java.util.Random;

public class Lotto {

	int[] nums;

	// 초기화 함수 -> 생성자 -> constructor
	Lotto() { // 여기서 Lotto는 함수 이름이 아니라 한정사 : 이 함수는 자료형이 Lotto일 때만 호출 할 수 있다는 뜻
		this.nums = new int[6];
	}

	void gen() {
		Random rand = new Random();
		for (int i = 0; i < 6; i++)
			this.nums[i] = rand.nextInt(45) + 1;
	}

	void sort() {
		for (int j = 0; j < 5; j++)
			for (int i = 0; i < 5 - j; i++)
				if (this.nums[i] > this.nums[i + 1]) {
					int temp = this.nums[i];
					this.nums[i] = this.nums[i + 1];
					this.nums[i + 1] = temp;
				}
	}

}
