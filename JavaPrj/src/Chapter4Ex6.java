import java.io.IOException;

public class Chapter4Ex6 {

	public static void main(String[] args) throws IOException {

		String s = Integer.toString(12);
		String a = String.valueOf(12);
		int x = Integer.parseInt("12");

		String name1 = "������";
		String name2 = "������";
		// String name2 = new String("������");

		System.out.println(name1 == name2);
		System.out.println(name1.equals(name2));

		String name3 = "hong";
		String name4 = name3.toUpperCase();
		System.out.println(name3 + ", " + name4);
		System.out.println("=================================");

		String fileName = "photo.jpg";
		System.out.println(fileName.length());
		System.out.println(fileName.indexOf(".")); // 5(�ε����� 0���� ����)
		// 3��° ���ڱ����� ���
		System.out.println(fileName.substring(0, 3)); // (�ε��� ����, �� �ε���-1)
		System.out.println("=================================");

		// ���ϸ� ����ϱ�
		String name = fileName.substring(0, fileName.indexOf("."));
		System.out.println(name);
		System.out.println("=================================");

		// Ȯ���ڸ� ����ϱ�
		String ext = fileName.substring(fileName.indexOf(".") + 1);
		System.out.println(ext);
		System.out.println("=================================");

		// ���ڿ� �ɰ���
		String fileNames = "photo.jpg,aa.png,bb.gif,cc.png";// CSV
		String[] names = fileNames.split(",");
		System.out.println(names.length);
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println("=================================");

		
	}

}
