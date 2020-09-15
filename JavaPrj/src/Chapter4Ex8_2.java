import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Chapter4Ex8_2 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/data3.txt");
		Scanner scan = new Scanner(fis);

		int[] lengths = { 8, 5, 9 };
		int[][] gs = new int[3][];

		for (int i = 0; i < lengths.length; i++) {
			// 지역 변수 쓰는 것을 습관화 하자
			int cnt = lengths[i];
			gs[i] = new int[cnt];
		}

//		{
//			int i = 0;
//			while (scan.hasNextLine()) {
//				String line = scan.nextLine();
//				String kors[] = line.split(",");
//				for (int j = 0; j < kors.length; j++) {
//					gs[i][j] = Integer.parseInt(kors[j]);
//				}
//				i++;
//			}
//		}

		for (int i = 0; i < gs.length; i++) {
			String line = scan.nextLine();
			String[] kors = line.split(",");
			for (int j = 0; j < kors.length; j++) {
				gs[i][j] = Integer.parseInt(kors[j]);
			}
		}

		scan.close();
		fis.close();

		// 정렬 --------------------------------

		for (int k = 0; k < gs.length; k++) {
			for (int j = 0; j < gs[k].length - 1; j++) {
				for (int i = 0; i < gs[k].length - 1 - j; i++) {
					if (gs[k][i] < gs[k][i + 1]) {
						int temp = gs[k][i];
						gs[k][i] = gs[k][i + 1];
						gs[k][i + 1] = temp;
					}
				}
			}
		}

//		for (int i = 0; i < gs.length; i++) {
//			for (int j = 0; j < gs[i].length - 1; j++) {
//				for (int k = 0; k < gs[i].length - 1 - j; j++) {
//					if (gs[i][k] > gs[i][k + 1]) {
//						int temp = gs[i][k];
//						gs[i][k] = gs[i][k + 1];
//						gs[i][k + 1] = temp;
//					}
//				}
//			}
//		}
		
		

		// 출력 --------------------------------

//		System.out.println(Arrays.toString(gs[0]));
//		System.out.println(Arrays.toString(gs[1]));
//		System.out.println(Arrays.toString(gs[2]));

		for (int j = 0; j < gs.length; j++) {
			int size = lengths[j];

			for (int i = 0; i < size; i++) {
				System.out.printf("%d", gs[j][i]);
				System.out.printf(",");
			}
			System.out.println();
		}

	}

}
