package assignment6;

public abstract class animal {

	String color,breed,name;
	
	 abstract void  eat();
	  
	 void speak(){
		  System.out.println("animal speaks");
		  
	  }
	
}
class dog extends animal{
	
	String name="mandy";
	
	public void eat(){
		System.out.println(name+" eats bone");
	}
	
	
}