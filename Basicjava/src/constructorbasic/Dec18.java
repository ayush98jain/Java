package constructorbasic;
import java.util.*;

public class Dec18 {
	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cake details");
		String str=sc.nextLine();
		if(str.matches("[A-Za-z0-9]+")) {
			String we=str.substring(0,4);
			System.out.println("we in string "+we);
			String or=str.substring(str.length()-3);
			System.out.println("order in string "+or);
			String fl=str.substring(4,str.length()-3);
			System.out.println("Flavor in string  "+fl);
			int weight=Integer.parseInt(we);
			if(weight>999) {
				float ff=weight/1000;
				System.out.println(ff);
			}
		}
		else {
			System.out.println("Invalid Input");
		}
	}*/
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<String> s=new ArrayList<String>(5);
	s.add("one");
	s.add("two");
	s.add(4,"three");
	s.add("four");
	s.add("five");
	System.out.println(s);
}
}
   /* static int b=200;
	public static void main(String[] args) {
		Dec18 d=new Dec18();
		int a=10;
		int b=20;
		b=900000;
		 System.out.println(Dec18.b);
		 System.out.println(d.b);
		 System.out.println(b);
		 
	}
	}*/
	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("En");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int brr[]=new int[n];
		int t;
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			brr[i]=arr[i];
		}
		for(int i=0;i<n-1;i++){
			for(int k=0;k<n-1;k++) {
				if(arr[k+1]<arr[k]) {
					t=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=t;
				}
			}
		}
		for(int j=0;j<n;j++) {
			System.out.println(arr[j]);
		}
		
	}
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
