package Conforge;



public class Child extends Parent{

public static String value="Maheedhar";
	
	public static void test1() {
		System.out.println("Test Child:"+value);
		//super.test1();
		//super.value;
	
	}
	public static void main(String[] args) {
	     Parent c= new Child();
	     c.test1();
	     
	     
	}
}
