package Test;

public class Test {
	
	
	int a;
	int result;
	
	public Test(int b)
	{
		this.a=b;
		result= b/2;
		System.out.println("Answer : "+result);
	}

	public static void main(String[] args) {
		
		
		Test t= new Test(33);
				
	}

}
