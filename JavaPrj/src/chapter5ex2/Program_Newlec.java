package chapter5ex2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program_Newlec {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("res/data5.txt");
		Scanner scan = new Scanner(fis, "UTF-8");

//	      ȸ��(Member) �̼�öȸ��;
//	      
//	      ���->�׷�ȭ->����������
//	      ����ȭ(=�׷�ȭ), ��������, ����

		int[] ids = new int[10];
		String[] uids = new String[10];
		String[] names = new String[10];
		int[] ages = new int[10];

		int count;
		{
			int i = 0;
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				String[] tokens = line.split(",");

				ids[i] = Integer.parseInt(tokens[0]);
				uids[i] = tokens[1];
				names[i] = tokens[2];
				ages[i] = Integer.parseInt(tokens[3]);

				i++;
			}
			count = i;
		}

		
		// �ε� -----

		scan.close();
		fis.close();

		// ��� -----

		for (int i = 0; i < count; i++) {
			System.out.printf("id:%d, uid:%s, name:%s, age:%d\n", ids[i], uids[i], names[i], ages[i]);
		}

		System.out.println("�۾��Ϸ�");

	}

}
