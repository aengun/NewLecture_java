package chapter7ex2;

import java.util.Random;

public class Lotto {

	int[] nums;

	// �ʱ�ȭ �Լ� -> ������ -> constructor
	Lotto() { // ���⼭ Lotto�� �Լ� �̸��� �ƴ϶� ������ : �� �Լ��� �ڷ����� Lotto�� ���� ȣ�� �� �� �ִٴ� ��
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
