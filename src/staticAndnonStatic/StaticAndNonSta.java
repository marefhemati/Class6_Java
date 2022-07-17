package staticAndnonStatic;



public class StaticAndNonSta {

	//Interview Question: what does Static keyword mean? we should answer like this example:
	// To understand the static mean let's take this example: we have two instance variable. one Static and one not-Static and 
	//we have multiple methods, method a, method b, method c. In method a if Static variable is changed does'nt matter who is that
	//in the future everybody gonne get effected by that change. But if I have non-Static variable, in order to deal with not-Static
	//variable we need to create object and if we make changes through the object only that particular object is affected by that change.


int price = 33;
static int mile = 100;


public static void main(String[] args) {

	StaticAndNonSta st = new  StaticAndNonSta();

	StaticAndNonSta st1 = new  StaticAndNonSta();
 System.out.println(st.price);
 st.price = 55;
 System.out.println(st.price);
 System.out.println(st1.price);
 
 //Static effects
 System.out.println("-----------------");
 
System.out.println(st.mile);
st.mile = 500;
System.out.println(st.mile);
System.out.println(st1.mile);



}

}
