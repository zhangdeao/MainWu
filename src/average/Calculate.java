package average;

import java.util.Scanner;

public class Calculate {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int count = -1;
         for (;;) {
             try {
                 System.out.println("���������ݸ���:");
                 count = Integer.parseInt(sc.next());
                 break;// ��������,����ѭ��
            } catch (Exception e) {
                 // ����
                System.out.println("ֻ��������������");
                 continue;
             }
         }
         
         //��������
        int[] arr = new int[count];
         for (int i = 0; i < count; i++) {
             for(;;) {
                 try {
                     System.out.printf("�������%d������:", i + 1);
                     arr[i] = sc.nextInt();
                     break;
                 } catch (Exception e) {
                     // ����
                    System.out.println("�����ֻ��������");
                     continue;
                 }
             }
         }
         
         //�������
        int sum = getSum(arr);
         //��ƽ��ֵ
        float avg = getAvg(arr);
         
         System.out.printf("avg:%f\r\n",avg);
         System.out.printf("sum:%d",sum);
         
         sc.close();

     }
     
     //�������ƽ��ֵ
    public static float getAvg(int[] arr) {
         int sum = getSum(arr);
         return sum/arr.length;
     }

     // ������ĺ�
    public static int getSum(int[] arr) {
         int sum = 0;
         for (int i : arr) {
             sum += i;
         }
         return sum;
     }
 }