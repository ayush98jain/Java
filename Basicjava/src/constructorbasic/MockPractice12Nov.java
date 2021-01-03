package constructorbasic;
import java.util.*;

public class MockPractice12Nov {

	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int s1=1,s2=0,r1=0,r2=0;
		int f1;
		int f2;
		int count = 0;
		System.out.println("Enter size");
		int si=sc.nextInt();
		int aa[]=new int[si];               //multiplication of 1st array element = sum of elements of second array
		int bb[]=new int[si];
		for(int i=0;i<si;i++) {
			aa[i]=sc.nextInt();
		}
		for(int i=0;i<si;i++) {
			bb[i]=sc.nextInt();
		}
		for(int j=0;j<si;j++) {
			f1=aa[j];
			f2=bb[j];
			int s1=1;
			int s2=0;
			int r1=0;
			int r2=0;
			while(f1>0) {
				r1=f1%10;
				s1=s1*r1;
				f1=f1/10;
				//System.out.println(f1);
			}
			while(f2>0) {
				r2=f2%10;
				s2=s2+r2;
				f2=f2/10;
			}
			if(s1==s2) {
				count++;
				System.out.println(aa[j]+","+bb[j]);
			}
			
		}
		
}*/
	/*public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the array size");
		int si=sc.nextInt();
		if(si>2&&si<11) {
			int arr[]=new int[si];
			for(int i=0;i<si;i++) {                      //inputed array is sorted or not
				arr[i]=sc.nextInt();                        //ye wala nahi chalta kyunki sort function use nahi kar sakte
			}
			int brr[]=Arrays.copyOf(arr,si);
			Arrays.sort(brr);
			for(int i=0;i<si;i++) {
				if(arr[i]==brr[i]) {
					count++;
				}
			}
			
		}
		if(count==si) {
			System.out.println("Array is sorted");
		}
		else {System.out.println("Array is not sorted");}
		
	}*/
	
/*public static void main(String[] args) {               //check sorted hai ya nahi sahi hai
	Scanner sc=new Scanner(System.in);
	int count=0;
	int f=0;
	System.out.println("Enter array size");
	int si=sc.nextInt();
	if(si>2 && si<11) {
		int arr[]=new int[si];
		System.out.println("Start entering elements");
		for(int i=0;i<si;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<si;i++) {
			if(arr[i-1]<arr[i]) {
				count++;
			}
			else {
				f=1;
				break;
			}
		}
		if(f==1) {
			System.out.println("Not sorted array");
		}
		if(f==0 && count==(si-1)) {
			System.out.println("Sorted array");
		}
	}
	else {
		System.out.println("Invalid Array Size");
	}
	
}*/
	
	
	
/*	public static void main(String[] args) {              //Rahul is blessed with child output barabar nahi aata
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int bade=0;
		int chote=0;
		System.out.println("Enter ");
		String ss=sc.nextLine();
		for(int i=0;i<ss.length();i++) {
			if(ss.matches("[a-z]+")) {
				//System.out.println("chote");
				bade=bade+(ss.charAt(i)-95);
			}
			if(ss.matches("[A-Z]+")) {
				//System.out.println("bade");
				chote=chote+(ss.charAt(i)-64);
			}	
		}
		sum=bade+chote;
		//sum=ss.charAt(0);
		System.out.println(sum);
		String dd=ss.toUpperCase();
		System.out.println(dd);
		 
		
	}
}*/
	
	
	/*public static void main(String[] args) {       //rahul is blessed with baby nam karan wala sahi hai 
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int sum1=0;
		System.out.println("Enter the name");
		String name=sc.nextLine();
		String name1=name.toUpperCase();
		System.out.println(name1);
		for(int i=0;i<name1.length();i++) {
			sum=sum+name1.charAt(i);
		}
		sum1=sum-(name1.length()*64);
		System.out.println(sum1);
		
	}*/
	
	
/*public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int c1=0;
	int c2=0;
	System.out.println("Enter array size");
	int s1=sc.nextInt();
	int arr[]=new int[s1];
	for(int i=0;i<s1;i++) {
		arr[i]=sc.nextInt();
	}
	int re[]=new int[s1];
	sc.nextLine();
	for(int i=0;i<s1;i++) {
		for(int j=0;j<s1;j++) {
			if(arr[i]==arr[j]) {
				c1++;
				re[c1-1]=arr[j];
			}
			
		}
	}
	for(int i=0;i<c1;i++) {
		System.out.print(re[i]);
	}
}*/
	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String ss=sc.nextLine();
		System.out.println("Enter Character");
		String se=sc.nextLine();
		if(ss.contains(se)) {
			for(int i=0;i<ss.length();i++) {
				int pa;
				int pb=ss.indexOf(se);
				System.out.println(pb);
			}
		}
	}*/
	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter code");
		String raw=sc.nextLine();
		if(raw.charAt(0)=='A' || raw.charAt(0)=='B' ) {
			if(raw.charAt(1)=='E' || raw.charAt(1)=='N') {        //block number
				String ss[]=raw.split("");
				int n=Integer.parseInt(ss[2]);
				if(n>=1 && n<=4) {
					String si=raw.substring(3);
					int dd=Integer.parseInt(si);
					System.out.println(dd);
				}
				else {System.out.println("number");}
				}
			else {System.out.println("EN");}
			
		}
	
		else {System.out.println("AB");}
		
		
	
		
	}*/
	/*public static void main(String[] args) {    //harshad number
		Scanner sc=new Scanner(System.in);
		System.out.println("size");
		int si=sc.nextInt();
		int count=0;
		int arr[]=new int[si];
		for(int i=0;i<si;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<si;i++) {
			int s=0;
			int r=0;
			int t=arr[i];
			while(t>0) {
				r=t%10;
				s=s+r;
				t=t/10;
			}
			if(arr[i]%s==0) {
				count++;
				System.out.println(arr[i]);
			}
		}
		if(count==0) {
			System.out.println("No harshad ");
		}
		
	}*/
	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				System.out.println("Space1");
			}
		}
	}*/
	/*public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);                                 // 3 se divisible position ke characters print karna 
	        System.out.println("Enter the String");        // 3 matlab dekhne wali... matlab 2th position ka character 
	        String str =in.nextLine();
	        for(int i=0;i<str.length();i++)
	        {
	            if((Character.isLetter(str.charAt(i)) || Character.isWhitespace(str.charAt(i))))
	                continue;
	            else{
	                System.out.println(str+" is not a valid string");
	                return;
	            }
	        }
	        int sum=0;
	        for(int i=0;i<str.length();i++){
	            if((i+1)%3==0){
	                sum+=(int)str.charAt(i);
	            	//System.out.println("Sum is "+str.charAt(i));

	            }
	        }
	        System.out.println("Sum is "+sum);
	 }*/
	
	
	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);           //kuch to bhi pata nahi
		System.out.println("Enter size");
		int si=sc.nextInt();
		int count=0;
		int arr[]=new int[si];
		System.out.println("Enter elements");
		for(int i=0;i<si;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<si;i++) {
			for(int k=0;k<si;k++) {
				if(arr[i]==arr[k]) {
					count++;
				}
			}
		}
	}*/
/*public static void main(String[] args) {   //bubble sort with removing duplicacy
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
	int si=sc.nextInt();
	int tt[]=new int[si];
	int arr[]=new int[si];
	System.out.println("ENter elements");
	for(int i=0;i<si;i++) {
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<si-1;i++) {
		for(int j=0;j<si-1;j++) {
			if(arr[j+1]<arr[j]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	int l=0;
	for(int i=0;i<si-1;i++) {
		if(arr[i]!=arr[i+1]) {
			tt[l]=arr[i];
			l++;
		}
	}
	tt[l]=arr[si-1];
	for(int y=0;y<si;y++) {
		System.out.println(tt[y]);
	}
}*/
	/*public static void main(String[] args) {    // ek particular  character ka occurrence 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		System.out.println("Enter character to be get counted");
		String lala=sc.nextLine();
		String h=str.replace(lala, "");
		int u=str.length()-h.length();
		System.out.println(u);
	}
}*/
	/*public static void main(String[] args) {    // no of times the substring get repeated
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		System.out.println("Enter substring to be get counted");
		String sub=sc.nextLine();
		
		
	
		int lastIndex = 0;
		int count = 0;

		while (lastIndex != -1) {
		    lastIndex = str.indexOf(sub, lastIndex);

		    if (lastIndex != -1) {
		        count++;
		        lastIndex += sub.length();
		    }
		}
		System.out.println(count);
	}
}*/
	
	
	
	
/*public static void main(String[] args) {   //3.20pm
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
	int si=sc.nextInt();
	int arr[]=new int[si];
	int brr[]=new int[si];
	System.out.println("Start entering elements");
	for(int i=0;i<si;i++) {
		arr[i]=sc.nextInt();
	}
	for(int j=0;j<si;j++) {
		brr[j]=arr[j];
	}
	for(int p=0;p<si-1;p++) {
		for(int q=0;q<si-1;q++) {
			if(arr[q+1]<arr[q]) {
				int temp=arr[q];
				arr[q]=arr[q+1];
				arr[q+1]=temp;
			}
		}
	}
}*/
	
	
	
	
	/*public static void main(String[] args) {      // to print max/min element or their indexes and their index to other all elements
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size");
	int si=sc.nextInt();
	int arr[]=new int[si];
	System.out.println("Enter elements");
	for(int i=0;i<si;i++) {
		arr[i]=sc.nextInt();
	}
	int max=arr[0];
	int maxin=0;
	for(int j=0;j<si;j++) {
		if(max<arr[j]) {
			max=arr[j];
			 maxin=j;
		}
		
	}
	System.out.println("maximum element "+max);
	System.out.println("index of maxi. element "+maxin);
	for(int q=0;q<si;q++) {
		arr[q]=arr[q]+maxin;
	}
	for(int p=0;p<si;p++) {
		System.out.println(arr[p]);
	}
	
}*/
	
	
	
	
	
	
	
	/*public static void main(String args[]) 
	  
    { 
        int ar[] = { 10, 5, 3, 4, 3, 5, 6 }; 
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>(); 
        for (int i = 0; i < ar.length; i++) { 
            hm.put(ar[i], i); 
        } 
        // Using hm.keySet() to print output reduces time complexity. - Lokesh 
        System.out.println(hm.keySet()); 
  
    } 
}*/
	
	
	
	
	
	
 /* public static void main(String[] args) {
	  int count=0;
	  int flag=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number");
	  String str=sc.nextLine();
	  double tt=Double.parseDouble(str);
	  
	 // if(str.matches("[1-9]+")) {
	  if(tt>0) {
		   System.out.println("Enter digit");
		  String n1=sc.nextLine();
		  //sc.nextLine();
		 // System.out.println("po");
		  if(n1.matches("[0-9]+") && n1.length()==1) {
			  for(int i=0;i<str.length();i++) {
				  if(n1.charAt(0)==str.charAt(i))
				  {
					  count++;
					  flag=1;
				  }
			  }
			  if(count>0) {
				  System.out.println(n1+" apperas in "+str+"  "+count+" times");
			  }
			  else if(count==0) {
			  System.out.println(n1+" apperas in "+str+" "+count+" times");
		  }
		  }
		  else {
			  System.out.println(n1+" is not a valid digit");
		  }
		 
		  
	  }
	  else {
		  System.out.println(str+" Invalid number");
	  }
	 }*/
	
	/*public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int u=0;
		int l=0;
				
		System.out.println("Enter string");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=97 && str.charAt(i)<=122) {
				l++;
			}
			else if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				u++;
			}
		}
		System.out.println(u);
		System.out.println(l);
		
	}	
} */
	
/*public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter sixe");
	int aa=0;
	int bb=0;
	int sz=sc.nextInt();
	int a[]=new int[sz];
	int b[]=new int[sz];
	System.out.println("Star entering array elemnts for a");
	for(int i=0;i<sz;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("Start entering elements for array b");
	for(int j=0;j<sz;j++) {
		b[j]=sc.nextInt();
	}
	for(int i=0;i<sz;i++) {
		if(a[i]>b[i]) {
			aa++;
		}
		else {
			bb++;
		}
	}
	System.out.println("A ka score"+aa);
	System.out.println("b ka score"+bb);
}*/
	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int si=sc.nextInt();
		int a[]=new int[si];
		System.out.println("Enter elements");
		for(int i=0;i<si;i++) {
		if(a[i]==5)
		continue;
			a[i]=sc.nextInt();
		}
		for(int j=a.length-1;j>=0;j--) {
			System.out.print(a[j]);
		}
	}*/
/*public static void main(String [] args) {
	TreeSet<String> t=new TreeSet<String>();
	TreeSet<String> s=new TreeSet<String>();
	t.add("a");
	t.add("b");
	t.add("c");
	t.add("d");
	t.add("e");
	System.out.println(t);
	s=(TreeSet)t.subSet("One", true,"Six",true);
	//t.add("a");
	t.pollFirst();
	System.out.println(t);
	t.pollFirst();
	System.out.println(t);
	/*t.add("b");
	
	System.out.println(t.size()+""+s.size());
	}*/
/*public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int c=0;
	int max=0;
	int tc=0;
	System.out.println("Enter array size");
	int si=sc.nextInt();
	int arr[]=new int[si];
	System.out.println("Start entering elements");
	for(int i=0;i<si;i++) {
		arr[i]=sc.nextInt();
	}
	for(int j=0;j<si;j++) {
		for(int k=0;k<si;k++) {	
			if(arr[j]==arr[k]) {
				tc++;
			}
		}
		if(tc>=c) {
			if(arr[j]<max && tc==c) {
				c=tc;
			}
			else {
				c=tc;
				max=arr[j];
			}
		}
		tc=0;
	}
	System.out.println(max);
}
}*/
	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int sum1=0;
		System.out.println("Enter name");
		String name=sc.nextLine();
		if(name.matches("[A-Za-z]+")) {
			String namei=name.toUpperCase();
			for(int i=0;i<namei.length();i++) {
				sum=sum+namei.charAt(i);
			}
			
		}
	}*/
	/*public static void main(String[] args) {    //character ka sum
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		int a=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			a=a+s.charAt(i);
		}
		System.out.println(a);
		System.out.println(s);
	}
}*/
	/*public static void main(String[] args) {    //integer to character
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int b=sc.nextInt();
		char c=(char)b;
		System.out.println(c);
		0
	}
}*/
	
	/*public static void main(String[] args) {    //character to ascii
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String ss=sc.nextLine();
		for(int i=0;i<ss.length();i++) {
			char c=ss.charAt(i);
			int y=ss.charAt(i);
			System.out.println(y);
		}
		System.out.println(ss.length());
	}
	}*/
	
	
	/*public static void main(String[]args) {
		int ascii[] = { '1', '2', '3', '4'};

        String s = new String(ascii, 1, 3);

        System.out.println(s);
	}
}*/
	
	
	
	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter PAN no:");
		String pan=sc.nextLine();
		//String p=pan.substring(0,5);
		String a=pan.substring(5,9);
		//String n=pan.substring(9);
		//System.out.println(p);
		System.out.println(a);
		//System.out.println(n);
	}*/
	
	

     /*  int studentId;

        String name;

        char grade;

           

   public MockPractice12Nov(int studentId, String name, float mark) { 

            this.studentId = studentId;

            this.name=name;

            calculateGrade(mark);

   }

       

   public void calculateGrade(float mark){

        if(mark>90)

             grade='A';

        else

             grade='B';

   }*/


/*public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
	int si=sc.nextInt();
	List<Integer> aa=new ArrayList<Integer>();
	List<Integer> bb=new ArrayList<Integer>();
	int arr[]=new int[si];
	System.out.println("enter array elements");
	for(int i=0;i<si;i++) {
		arr[i]=sc.nextInt();
	}
	sc.nextLine();
	//int t=0;
	for(int k=0;k<si;k++) {
		int t=0;
		for(int j=2;j<arr[k];j++) {
			if(arr[k]%j==0) {
				t++;
			}
		}
		if(t==0) {
			aa.add(arr[k]);
			//System.out.println(arr[k]);
		}
		else {
			//System.out.println(arr[k]);
			bb.add(arr[k]);
			t=0;
		}
	}
	System.out.println(aa);
	System.out.println(bb);
	System.out.println("Hello worls");
	
}
}*/
/*public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter toys number");
	int n=sc.nextInt();
	if(n>0 && n<16) {
		Map<String,Integer> mp=new TreeMap<String,Integer>();
		System.out.println("Enter toys name");
		for(int i=0;i<n;i++) {
			String s=sc.nextLine().toUpperCase();
			mp.put(s, mp.getOrDefault(s,0)+1);
		}
		//System.out.println(mp);
		for(Map.Entry<String,Integer> entry:mp.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}else {
		System.out.println("Invalid number of toys");
		return;
	}
}*/
	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Money you have");
		int m=sc.nextInt();
		int s=0;
		int c=0;
		if(m>0 & m<101) {
			int arr[]=new int[]{10,20,30,40,50};
			for(int i=0;i<arr.length;i++) {
				if(s<=m) {
					s=s+arr[i];
					if(s<=m) {
					c++;
					}
				}
				//s=s+arr[i];
			}
			System.out.println("You can buy "+c+" toys");
		}
		
		else {
			System.out.println("Less Money");
			return;
		}
	}
	
}*/



	/* public static void main(String args[])
	 {
	            Scanner s=new Scanner(System.in);
	            System.out.println("Enter the range till you want to print prime numbers");
	            int range=s.nextInt();
	            System.out.println("-------------------------------------");
	            int temp=0;
	            for(int no=1;no<=range;no++)
	            {
	                for(int i=2;i<no;i++)
	                {
	                    if(no%i==0)
	                    {
	                        temp=temp+1;
	                    }
	                }
	                if(temp==0)
	                {
	                    System.out.println(no);
	                }
	                else
	                {
	                    temp=0;
	                }
	            }
	 }
	}*/
	//-------------------------------------------mcq-------------------------------------
/*	public static void main(String[] args) {   //dono code alag hai ye wala mcq mein aaya tha RTE answerhai
		Scanner sc=new Scanner(System.in);
		Map<String,String> m1=new TreeMap<String,String>();
		m1.put("null", null);
		m1.put(null, "Rafu");	
		System.out.println(m1);
	}
}*/
	
	
	
	
	
	
/*public static void main(String[] args) {  //ye alag hai mcq mein nahi aaya running mrin pehle proper phir
	Scanner sc=new Scanner(System.in);
	Map<String,String> m1=new TreeMap<String,String>();
	m1.put("null", null);
	m1.put("kk", "Rafu");	// is program mein null koi bhi key nahi hai without double qoutes jaise ki upar wale mein 
	System.out.println(m1); // bina double quotes hai 
}
}*/
	/*public static void main(String[] args) {
		List<Number>l1=new ArrayList<Number>();
		l1.add(5);
		l1.add(5);
		System.out.println(sum(l1));
	}
	public static double sum(List<Number>l) {
		double sum=0;
		for(Number i:l)
			sum+=i.doubleValue();
		return sum;
	}
	}*/
	
	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the string");
		String str=sc.nextLine();
		String arr[]=str.split(" ");
		int l=arr.length;
		System.out.println(l);
		for(int i=0;i<l;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0;i<l;i++) {
			for(int j=0;j<l;j++){
			if(arr[i]==arr[j]) {
				count++;
			}
			}
			if(count!=0) {
				System.out.println(arr[i]+count);
			}
			count=0;
		}
	}
	}*/
	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);          /bubble sort
		System.out.println("Enter size");
		int n=sc.nextInt();
		System.out.println("Enter elements");
		int arr[]=new int[n];
		int t=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[j+1]<arr[j]) {
					t=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=t;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
	}*/
	
/*public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<String>al=new ArrayList<String>(5);
	al.add("One");
	al.add("two");
	al.add(4,"four");
	al.add("three");
	al.add("five");
	System.out.println(al);
}
}*/
  /* public static void main(String[] args) {
	   int n1=10;
	   //int n2;
	   if(n1==10) {
		   int  n2=40;   
	   }
	   else {
		     int n2=90;
	   }
	   System.out.println(n2);
   }*/
  /* public static void main(String[] args) {
	   Dumps1 d=new Dumps1ki();
	   d.display();
   }
}*/
	
	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[256];
		System.out.println("Enter strig");
		String str=sc.nextLine();
		int l=str.length();
		for(int i=0;i<l;i++) {
			arr[str.charAt(i)]=arr[str.charAt(i)]+1;
		}
		char c=' ';
		int max=-1;
		for(int i=0;i<l;i++) {
			
			if(max<arr[str.charAt(i)]){
				c=str.charAt(i);
				max=arr[str.charAt(i)];
			}
		}
		System.out.println(c+" "+max);
		}
	}*/
	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		System.out.println("Enter Size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		//String o="";
		for(int i=0;i<n;i++) {
		if(arr[i]>0 && arr[i]<10) {
			if(arr[i]%2!=0) {
				sb.append(arr[i]);
				//o=o.concat(String.valueOf(arr[i]));
			}
		}
			}
		if(sb.length()>0)
			System.out.println(sb);
		
		}
	}*/
}