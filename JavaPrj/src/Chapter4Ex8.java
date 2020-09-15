import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Chapter4Ex8 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/data3.txt");
		Scanner scan = new Scanner(fis);

//		int[] nums1 = new int[] { 1, 2, 3, 4, 5 };
//		int[] nums2 = new int[] { 6, 7, 8 };
//
//		int[][] nums = new int[2][];
//		nums[0] = nums1;
//		nums[1] = nums2;

		int[][] nums = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9 } };
		for(int i = 0;i<nums.length;i++) {
			for(int j = 0;j<nums[i].length;j++) {
				System.out.println(nums[i][j]);
			}
		}
		System.out.println();
		int nums3[] = { 12, 13 };
		nums[0] = nums3;
		for(int i = 0;i<nums.length;i++) {
			for(int j = 0;j<nums[i].length;j++) {
				System.out.println(nums[i][j]);
			}
		}

		nums[0][1] = 40;

		scan.close();
		fis.close();

	}

}
