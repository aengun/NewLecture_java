import java.io.FileOutputStream;
import java.io.IOException;

public class Chapter3Ex3CharProgram {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("res/data.txt");

		/*
		 * fos.write(3); fos.write(65); // -> 65 -> A fos.write('A' + 1); fos.write('A'
		 * + 2); fos.write('A' + 3); char c = 65;
		 * 
		 * fos.write(1); // ���� �״��(Binary)�� ���� fos.write('1'); // ASCII�� ���� 1-> 47 //
		 * 127 -> '1', '2', '7'
		 * 
		 * fos.flush();
		 */

		int alphaSize = 'Z' - 'A' + 1;
		int i = 0;

		// 26���� �ݺ� (A���� Z����)

		while (i < alphaSize) {
			// 1. Ư�� �� �ݺ����� �ε����� �ִ�. �� ���� �̿��϶�.
			// fos.write('A' + i);
			
			// 2. 1�� �����Ǵ� �ε����� �������� ����� �� �־�� �Ѵ�.
			// fos.write('Z'-i);
			// fos.write('A'+alphaSize-i); //���� ���� ���
			
			//3. �ݺ��� ȸ�������� ����϶� A~MA~M(��, if�� ��� ����)
			fos.write('A'+i%(alphaSize/2));
			
			i++;
		}

		fos.flush();

		fos.close();

		System.out.println("���� �Ϸ�");
	}

}