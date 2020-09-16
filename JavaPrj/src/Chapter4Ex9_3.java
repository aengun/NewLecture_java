import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Chapter4Ex9_3 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/img1.cmp");
		FileOutputStream fos = new FileOutputStream("res/img1-reverse.cmp");
		Scanner scan = new Scanner(fis, "UTF-8");
		PrintStream out = new PrintStream(fos, true, "UTF-8");

		// 로드
		String line = scan.nextLine();
		char[] arr = line.toCharArray();
		System.out.println("원래 배열 : " + Arrays.toString(arr));

		fis.close();
		scan.close();

		// 순서 바꾸기
		int length = arr.length;
		for (int i = 0; i < length / 2; i++) {
			if (arr[i] == '(')
				arr[i] = ')';
			else if (arr[i] == ')')
				arr[i] = '(';

			char temp = arr[i];
			arr[i] = arr[length - 1 - i];
			arr[length - 1 - i] = temp;
		}
		System.out.println("바뀐 배열 : " + Arrays.toString(arr));

		// 저장 하기
		for (int i = 0; i < length; i++) {
			out.print(arr[i]);
		}

		out.flush();
		fos.close();
		out.close();

		System.out.println("실행 완료");
	}

}
