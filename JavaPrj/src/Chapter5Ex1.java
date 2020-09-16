import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Chapter5Ex1 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/data4.txt");
		Scanner scan = new Scanner(fis, "UTF-8");

		int students = 6;
		int[] ids = new int[students];
		String[] names = new String[students];
		int[] kors = new int[students];

		// 로드 -------------------------------------------------

		int cnt = 0;
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] tokens = line.split(",");

			ids[cnt] = Integer.parseInt(tokens[0]);
			names[cnt] = tokens[1];
			kors[cnt] = Integer.parseInt(tokens[2]);
			cnt++;
		}

		scan.close();
		fis.close();

		// 바꾸기------------------------------------------------

		// 출력-------------------------------------------------
		for (int i = 0; i < cnt; i++) {
			System.out.printf("id : %d, name : %s, kor : %d\n", ids[i], names[i], kors[i]);
		}
		System.out.println();
		System.out.println("작업완료");
	}

}