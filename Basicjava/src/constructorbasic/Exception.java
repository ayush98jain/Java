package constructorbasic;

public abstract class Exception {
	public static void main(String[] args) {
		
		
		try {
			int s=10/0;
		} catch (java.lang.Exception e) {
			// TODO Auto-generated catch block
			System.out.println("hi");
			e.getStackTrace();
		}
	}
	

}
