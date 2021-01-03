
package constructorbasic;
import java.util.*;

public class WordsPr {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	/*System.out.println("Enter payment otions:");
	System.out.println("1.Visa");
	System.out.println("2.Pytm");
	System.out.println("3.Phonepe");
	
	int i=1;
	while(true) {
	int n=sc.nextInt();
	if(n<=0 || n>3) {
		System.out.println("Try Again");
	}
	else {
		break;
	}
	}*/
	/*System.out.println("Enter String");
	String s=sc.next();
	StringBuilder sb=new StringBuilder();
	if(s.matches("[a-zA-Z]+")) {
		for(int i=0;i<s.length();i++) {
			char cc=s.charAt(i);
			if(i==0 || i%2==0) {
				char c=Character.toUpperCase(cc);
				System.out.println(cc);
				sb.append(cc);
			}
			/*else {
				sb.append(cc);
			}
		}
		//System.out.println(sb);
	}
	else {
		System.out.println("Invalis Input");
		return;
	}*/
	System.out.println("Enter string");
	String s=sc.nextLine();
int c=0;
	String arr[]=s.split(" ");
	int l=arr.length;
	String brr[]=new String[l];
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<l;i++) {
		String dd=arr[i];
		sb.append(dd);
		 String gsb=sb.toString();
		if(gsb==dd) {
			c++;
			System.out.println(arr[i]);
		}
		}
	
}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

