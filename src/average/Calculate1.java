package average;
import java.util.Scanner;
public class Calculate1 {
    public static void main(String[] args) {
        System.out.println("������Ҫ�������������:");
        Scanner sc = new Scanner(System.in);
        int count =sc.nextInt();
        int []arr=new int[count];
        int sum=0;
        for (int i = 1; i < arr.length+1; i++) {
            System.out.println("�������"+i+"������:");
            int num=sc.nextInt();
            sum+=num;
        }
        System.out.println("��:"+sum);
        System.out.println("ƽ��:"+sum*1.0/count);
    }
} 
