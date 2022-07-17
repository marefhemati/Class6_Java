package variables;

public class LocalGlobal {

	static int a = 4;
	 static int b = 9;
	public static void main(String[] args) {
	//variables inside the methods called local variables
   // varaibles inside the class called Global or instance or class varaible
	//Final keyword for variable: final keywor finalize the variable when use it then we can not change that variable
		// we shuould use finale keyword at first time when make the variable.
		final int z = 34;
		
		
		abc(a, b);

	}
public static void abc(int a, int b) {
System.out.println(a+b);
}
 public static void cd( int x, int y) {
	 System.out.println(x+y);
 }
	
}
