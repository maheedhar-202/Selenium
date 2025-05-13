package infosys;


public class Child extends parent{
	
	public void Arthamatic() {
		super.Arthamatic();
		System.out.println("Addition");
		
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.Arthamatic();
	}

}
