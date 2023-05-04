package practice.java;

public class tester {
	
	public static void methD()
	{
		//System.out.println(Functionalities.HelloInt(5));
		
		Functionalities f=new Functionalities();
		f.Integer();
	}
		
		static void play()
		{
			
			System.out.println("hh");
		}
		
		static void ececute()
		{
			
			System.out.println("Pka");
			m2();
		}
		
		static void runner()
		{
			
			System.out.println("Hek");
			play();
		}
		
		static void m2()
		{
			
			System.out.println("hi king");
		}
	
		
		//That means you cannot call a non static mehod inside a static mnethod but u can call a static method inside a non static method//
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Functionalities func=new Functionalities();
	//	func.multtiInput(5, "Yasin looks like", 25);
		
		
		//Static method can be called as class name//
		tester t=new tester();
		//t.play();
		runner();
		
		ececute();
		methD();
		//t.m2();
		
		
		//Call the function in main method//
		//We can call non static method inside other non_static method by just calling method_name//
		
		
		

	}
	
	
	
	
	
	

}

