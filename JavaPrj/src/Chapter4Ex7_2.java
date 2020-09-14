import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Chapter4Ex7_2 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/data2.txt");
		Scanner scan = new Scanner(fis);

		
		int row = 3;
		int col = 9;

		int[][] kors = new int[row][col]; // ������ �����

		for (int c = 0; c < row; c++) {
			// ������ �о ������ ����ҿ� ���� ä����
			String line = scan.nextLine();
			String[] tokens = line.split(",");

			for (int i = 0; i < col; i++)
				kors[c][i] = Integer.parseInt(tokens[i]); // "60" -> 60

		}

		// ��� -----------------------------------
		int[] totals = new int[3];
		float[] avgs = new float[3];

		// �� ���� ������ ����� ���ϱ�
		for (int c = 0; c < row; c++) {
			for (int i = 0; i < col; i++)
				totals[c] += kors[c][i];

			avgs[c] = totals[c] / (float) col;
		}

		// ��ü ������ ����� ���ϱ�

		int total = 0;
		float avg = 0;

//      for(int i=0; i<col; i++)
//         totals[1] += kors[0][i];      
//      
//      avgs[1] = totals[1] / (float)col;
//      
//      for(int i=0; i<col; i++)
//         totals[2] += kors[0][i];      
//      
//      avgs[2] = totals[2] / (float)col;

		// ��� -----------------------------------

		for (int i = 0; i < row; i++)
			System.out.printf("[%d��] ���� : %d,  ��� : %6.2f\n", i + 1, totals[i], avgs[i]);
//      for(int c=0; c<row; c++) {
//         for(int i=0; i<col; i++) {
//            System.out.printf("%3d", kors[c][i]);
//            
//            if(i < 8)
//               System.out.print(",");
//         }
//         
//         System.out.println();
//      }

		// --------------- ���� �ܼ� ��� -----------
//      App -> ���ڿ� ���� ��� PrintStream ->   File -> OutputStream -> ����Ʈ ���� ���
//               Console -> 
//               Socket -> 
//      
//       write(����);
//       print(���ڿ�); -> print(12) -> print("12")
//       
//       print();
//       println(); // ���ڿ����� Ư���� ���ڰ� ���Ե� �� �ִ�. \n
//       printf();

		int kor = 30;
		int eng = 30;
		int math = 40;
		// System.out.printf("kor:%d eng:%3$d maht:%2$d\n", kor, math, eng );

		// System.out.printf("month : %03d", 3);

	}

}