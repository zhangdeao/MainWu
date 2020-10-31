package average;
import java.util.Scanner;
public class Calculate1 {
    public static void main(String[] args) {
        System.out.println("请输入要计算的整数个数:");
        Scanner sc = new Scanner(System.in);
        int count =sc.nextInt();
        int []arr=new int[count];
        int sum=0;
        for (int i = 1; i < arr.length+1; i++) {
            System.out.println("请输入第"+i+"个整数:");
            int num=sc.nextInt();
            sum+=num;
        }
        System.out.println("和:"+sum);
        System.out.println("平均:"+sum*1.0/count);
    }
} 
