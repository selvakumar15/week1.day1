package week1.day1;

public class Fruits {
	
	
	String address="Kodambakkam";
	

	public void fruits() {
	
		System.out.println("Apple");

}
	
	public void vegetables() {
		System.out.println("Carrot");

	}
	
	
	public void sweet() {
		 System.out.println("cake");

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fruits eat =new Fruits();
		
	eat.fruits();
	eat.vegetables();
	eat.sweet();
	
	System.out.println("My place in :" + eat.address);

	}
	}
 
