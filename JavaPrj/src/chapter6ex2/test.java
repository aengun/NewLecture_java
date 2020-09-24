package chapter6ex2;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 30 };
		print(nums); // 30
		count(nums);
		print(nums); // 31

		int x = 3;
		print(x); // 3
		count(x);
		print(x); // 3 -> 4가 아님을 주의
	}

	static void count(int[] nums) {
		nums[0]++;
	}

	static void print(int[] nums) {
		System.out.println(nums[0]);
	}

	static void count(int x) {
		x++;
	}

	static void print(int x) {
		System.out.println(x);
	}
}
