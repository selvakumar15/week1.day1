package week1.day1;

public class Mobile {
	
	String mobileModel = "Apple";
	int mobileWeight = 45;
	boolean fullyCharged= true;
	double myMobileCost = 55000.50;
	long whatsApp = 9655110821l;
	
	
  public void makeCall() {

  System.out.println("Call connected successfully");
  
  
}

  public void sendMsg() {

  System.out.println("Message send successfully");
  
  
}

  
  public void whatspp() {
	// TODO Auto-generated method stub

	  System.out.println("Am in whatsapp");
}
  
  
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile mine = new Mobile();
		
		mine.makeCall();
		mine.sendMsg();
		
		  System.out.println("My Mobile model is                    : " +mine.mobileModel);
		  System.out.println("My Mobile weight is                   : " +mine.mobileWeight);
		  System.out.println("My Mobile charged fully True/False is : " +mine.fullyCharged);
		  System.out.println("My Mobile model cost                  : " +mine.myMobileCost);
		  System.out.println("My whats app number is                : " +mine.whatsApp);
          
	
	}

}
