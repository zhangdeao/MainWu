package second;

import java.util.Scanner;

public class Second {
  public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("������count");
	  int count=sc.nextInt();
	  
	  int value[]=new int[count];
	  int i=0;
	  int a=0;
	  double b=0;
	  
	  System.out.println("������count����");
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
	  System.out.println("�����ĺ�Ϊ"+a);
	  System.out.println("ƽ����Ϊ"+b);
	  System.out.println("����ƽ��������Ϊ");
	  
	  i=0;
	  
	  while(i<count){
		  if(value[i]>b){
			  System.out.println(value[i]);
		  }
	    i++;
	  }
  }
}
