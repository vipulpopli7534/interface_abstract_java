package assignment6;

public interface animal {

	void speak();
	
	void eat();
}
 class dog implements animal{

	  public void speak(){
		 System.out.println("Dog is barking");
	 }
	  public void eat(){
		  System.out.println("Dog eat bone");
	  }
 }
 class cat implements animal{

	  public void speak(){
		 System.out.println("cat meowss");
	 }
	  public void eat(){
		  System.out.println("cat eat fish");
	  }
}
