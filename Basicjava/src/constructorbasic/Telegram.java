package constructorbasic;
import java.util.*;
public class Telegram {
	
	 public static void main(String[] args) 
	 {
	     Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the size of array--");
	  int s=sc.nextInt();
	  int r=0;
	  int arr1[]=new int[s];
	  int[] arr2=new int[s];
	  System.out.println("Enter the 1st array..");
	  for(int i=0;i<s;i++)
	  {
	      arr1[i]=sc.nextInt();
	  }
	  System.out.println("Enter the 2nd array..");
	  for(int i=0;i<s;i++)
	  {
	      arr2[i]=sc.nextInt();
	  }
	  
	  for(int i=0;i<s;i++)
	  {
	      int mul=1;
	      int temp1=arr1[i];
	      while(temp1>0)
	      {
	          r=temp1%10;
	          mul=mul*r;
	          temp1=temp1/10;
	      }
	      for(int j=0;j<s;j++)
	      {
	          int sum=0;
	          int temp2=arr2[j];
	            while(temp2>0)
	          {
	               r=temp2%10;
	               sum=sum+r;
	               temp2=temp2/10;
	          }
	          
	          if(mul==sum)
	          {
	              System.out.println(arr1[i]+","+arr2[j]);
	          }
	      }
	  }
	 }
	}


