import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Chapter4Ex8_3 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/data3.txt");
		Scanner scan = new Scanner(fis);

		int[] counts = { 8, 5, 9 };
		int[][] gs = new int[3][];

		for (int i = 0; i < counts.length; i++) {
			// 지역 변수 쓰는 것을 습관화 하자
			int cnt = counts[i];
			gs[i] = new int[cnt];
		}

		for (int i = 0; i < gs.length; i++) {
			String line = scan.nextLine();
			String[] kors = line.split(",");
			for (int j = 0; j < kors.length; j++) {
				gs[i][j] = Integer.parseInt(kors[j]);
			}
		}

		scan.close();
		fis.close();

		// 출력 --------------------------------
		System.out.println("2차원 배열 출력");
		for (int i = 0; i < gs.length; i++) {
			System.out.println(Arrays.toString(gs[i]));
		}
		System.out.println();

		// 정렬 --------------------------------
		// 원래코드
//		for (int k = 0; k < gs.length; k++) {
//			for (int j = 0; j < gs[k].length - 1; j++) {
//				for (int i = 0; i < gs[k].length - 1 - j; i++) {
//					if (gs[k][i] < gs[k][i + 1]) {
//						int temp = gs[k][i];
//						gs[k][i] = gs[k][i + 1];
//						gs[k][i + 1] = temp;
//					}
//				}
//			}
//		}

		// 뉴렉쌤 코드

//		for (int k = 0; k < gs.length; k++)
//			for (int j = 0; j < gs[k].length - 1; j++)
//				for (int i = 0; i < gs[k].length - 1 - j; i++) {
//					int[] g = gs[k];
//
//					if (g[i] > g[i + 1]) {
//						int temp = g[i];
//						g[i] = g[i + 1];
//						g[i + 1] = temp;
//					}
//				}

//		// 1반 정렬
//		{
//			int cnt = counts[0];
//			for (int j = 0; j < cnt - 1; j++)
//				for (int i = 0; i < cnt - 1 - j; i++) {
//					int[] g = gs[0];
//
//					if (g[i] > g[i + 1]) {
//						int temp = g[i];
//						g[i] = g[i + 1];
//						g[i + 1] = temp;
//					}
//				}
//		}
//
//		// 2반 정렬
//		{
//			int cnt = counts[1];
//			for (int j = 0; j < cnt - 1; j++)
//				for (int i = 0; i < cnt - 1 - j; i++) {
//					int[] g = gs[1];
//
//					if (g[i] > g[i + 1]) {
//						int temp = g[i];
//						g[i] = g[i + 1];
//						g[i + 1] = temp;
//					}
//				}
//		}
//
//		// 3반 정렬
//		{
//			int cnt = counts[2];
//			for (int j = 0; j < cnt - 1; j++)
//				for (int i = 0; i < cnt - 1 - j; i++) {
//					int[] g = gs[2];
//
//					if (g[i] > g[i + 1]) {
//						int temp = g[i];
//						g[i] = g[i + 1];
//						g[i + 1] = temp;
//					}
//				}
//		}

		// 전체 정렬 내림차순
		for (int k = 0; k < counts.length; k++) {
			int cnt = counts[k];
			for (int j = 0; j < cnt - 1; j++)
				for (int i = 0; i < cnt - 1 - j; i++) {
					int[] g = gs[k];

					if (g[i] < g[i + 1]) {
						int temp = g[i];
						g[i] = g[i + 1];

						g[i + 1] = temp;
					}
				}
		}

		// 반을 정렬(각 반의 1등을 기준으로)

		for (int i = 0; i < gs.length - 1; i++) {
			for (int j = 0; j < gs.length - 1 - i; j++) {
				if (gs[j][0] < gs[j + 1][0]) {
					int[] gtemp = gs[j];
					gs[j] = gs[j + 1];
					gs[j + 1] = gtemp;
				}
			}
		}

		// 출력 --------------------------------
		System.out.println("반 정렬 이후");
		for (int i = 0; i < gs.length; i++) {
			System.out.println(Arrays.toString(gs[i]));
		}

//		for (int j = 0; j < gs.length; j++) {
//			int size = gs[j].length;
//
//			for (int i = 0; i < size; i++) {
//				if (i == size - 1)
//					System.out.printf("%d", gs[j][i]);
//				else
//					System.out.printf("%d, ", gs[j][i]);
//			}
//			System.out.println();
//		}

	}

}
