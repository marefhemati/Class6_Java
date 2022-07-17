package constructors;

public class ConsChain2 {
	
	public ConsChain2() {
		
		System.out.println("Toyota");
	}
	
public ConsChain2(int a) {
	this(1000, "corolla");
		System.out.println("Year" + a);
		
	}

public ConsChain2(String car) {
	this();
	System.out.println("corolla");
	
	
}

public ConsChain2(int a, String b) {
	
	System.out.println("Towota" + " "+ a + " "+ b);
		
	
	}
}
	


