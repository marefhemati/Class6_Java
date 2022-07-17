package constructors;

public class X {
	//Interview Question very important: what is a constructor?
			//Constructor is like a method except: It needs to meet the following requirements.
			//1-The name of this has to be same as a class name.
			//2- THis has no return type.
			//3- This can not be static.
///There are two types of constructors. Default Constructor, Parameterized Constructor
//	Default Cons does not take any argument and Parameterized Cons take argument or parameters.
// when we make object. Object revokes the constructor.

	public X() {
		
	}
	public static void main(String[] args) {
		Y y1 = new Y();
		Y y2 = new Y (100);
		

	}

}
