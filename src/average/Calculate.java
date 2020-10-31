package average;

import java.util.Scanner;

public class Calculate {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int count = -1;
         for (;;) {
             try {
                 System.out.println("请输入数据个数:");
                 count = Integer.parseInt(sc.next());
                 break;// 满足条件,跳出循环
            } catch (Exception e) {
                 // 报错
                System.out.println("只能是整数个个数");
                 continue;
             }
         }
         
         //定义数组
        int[] arr = new int[count];
         for (int i = 0; i < count; i++) {
             for(;;) {
                 try {
                     System.out.printf("请输入第%d个数字:", i + 1);
                     arr[i] = sc.nextInt();
                     break;
                 } catch (Exception e) {
                     // 报错
                    System.out.println("输入的只能是整数");
                     continue;
                 }
             }
         }
         
         //求数组和
        int sum = getSum(arr);
         //求平均值
        float avg = getAvg(arr);
         
         System.out.printf("avg:%f\r\n",avg);
         System.out.printf("sum:%d",sum);
         
         sc.close();

     }
     
     //求数组的平均值
    public static float getAvg(int[] arr) {
         int sum = getSum(arr);
         return sum/arr.length;
     }

     // 求数组的和
    public static int getSum(int[] arr) {
         int sum = 0;
         for (int i : arr) {
             sum += i;
         }
         return sum;
     }
 }