package second;

import java.util.Scanner;

public class Second {
  public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("请输入count");
	  int count=sc.nextInt();
	  
	  int value[]=new int[count];
	  int i=0;
	  int a=0;
	  double b=0;
	  
	  System.out.println("请输入count个数");
	  while(i<count){
		  value[i]=sc.nextInt();
		  i++;
	  }
	  
	  i=0;
	  
	  while(i<count){
		  a=a+value[i];
		  i++;
	  }
	  b=a/count;
	  System.out.println("各数的和为"+a);
	  System.out.println("平均数为"+b);
	  System.out.println("大于平均数的数为");
	  
	  i=0;
	  
	  while(i<count){
		  if(value[i]>b){
			  System.out.println(value[i]);
		  }
	    i++;
	  }
  }
}
