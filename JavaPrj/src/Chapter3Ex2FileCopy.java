import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Chapter3Ex2FileCopy {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Work\\Workspace\\img1.bmp");
		FileOutputStream fos = new FileOutputStream("C:\\\\Work\\\\Workspace\\\\img1-copy.bmp");

		while (true) {

			int b = fis.read();
			// ���࿡ b = -1�̸�
			// ������(1. while�� ����� �ϴ� ��� / 2. ���μ��� ���� ����)
			if (b == -1)
				break;

			fos.write(b);

		}
		
		//���ҽ��� �ݴ� �Լ�. ��!��!��! �̰��� ���ְ� �ڵ带 �ۼ� �� ��.
		fos.close();

	}

}