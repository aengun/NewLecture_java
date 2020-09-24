package chapter6ex2;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Chapter4Ex2Sum {

   public static void main(String[] args) throws IOException {
            
      
      //---- �����͸� �ε� --------------------------------------------------
      FileInputStream fis = new FileInputStream("res/data.txt");      
      Scanner scan = new Scanner(fis);      
      
      // ��?? �̻��ѵ�? ���� ��ȿ�����ε�?
      int size = scan.nextInt();
      int[] nums = new int[size];
      
      
      // �迭�� �����͸� �о�(�ε�)�´�.
      for(int i=0; i<size; i++) {
         nums[i] = scan.nextInt();
      }
      
      fis.close();
      
      //--- ������ ���� ------------------------------------------------
      
      // 1. �������� ������ ���Ͻÿ�.
      // 2. ¦���� ������ ����Ͻÿ�.
      
      // �迭�� �������� ����?�� ���Ͻ� �� �ְڽ��ϲ�?
      // int sum = nums[0] + nums[1] + nums[2] + nums[3] ......; // ������ ������ �ְ� ��ȭ�� ���ٸ� ������, ������..
      
      // [60 70 90 100 75 24 23 80 90]
      
      // ���� ���ϴ� �ڵ�
      int sum = 0;
      for(int i=0; i<size; i++)
         sum += nums[i];
      
      System.out.println(sum);
            
      // ¦���� ���� ���ϴ� �ڵ�      
      int count = 0;      
      for(int i=0; i<size; i++)
         if(nums[i]%2 == 0)
            count++;
      
      System.out.println(count);   
      
      // [60 70 90 100 75 24 23 80 90]
      // [23 24 60 70 75 80 90 90 100]
      
      // ���� =========================      
      
      // ���
      for(int i=0; i<size; i++)
         System.out.printf("%d ", nums[i]);
      
      System.out.println();
            
      // [60 70 90 100 75 24 23 80 90]
      // 1pass : [60 70 90 90 75 24 23 80 100]
      // 2       : [60 70 90 90 75 24 23 90 100]
      
      for(int j=0; j<size-1; j++)
         // 1pass
         for(int i=0; i<size - 1-j; i++) {
            //[i]<->[i+1] �� ���ؼ� ���࿡ [i]�� �� ũ��
            // ��ü
            if(nums[i]>nums[i+1]) {
               int temp;
               temp = nums[i]; // ����� ���ÿ� �ű��.
               nums[i] = nums[i+1];
               nums[i+1] = temp;
            }
         }
      


      
      
      // ���[23 70 90 100 75 24 60 80 90]
      for(int i=0; i<size; i++)
         System.out.printf("%d ", nums[i]);
      
      System.out.println();
      
//      for(int i=0; i<size; i++) {
//         
//      }
         
      
      
      // ----- �����͸� ���� -----------------------------
      
      //FileOutputStream fos = new FileOutputStream("res/result.txt");
      //fos.close();
   }

}