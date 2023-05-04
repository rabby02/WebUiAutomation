package Inheritance;


class car
{
	
	void run()
	{
		
		
		System.out.println("Car is running");
	}
	
	
	


}

class kia extends car
{
	void milage()
	
	{
		
		
		System.out.println("Kia soriento: ");
		
	}




}



public class InheriSingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		
		
		
		
		kia c=new kia();
		
		c.run();
		c.milage();
		
		
		
	}
	

}
