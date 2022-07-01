package alpha;



public class FunctionOverloading {

	
	public void Display(int number)
	{
		
		System.out.println("a");
	}
	
	public void Display(String a)
	{
		System.out.println(a);
	
	}
	
	public FunctionOverloading()
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//CreateObjectExample3 obj1 = new CreateObjectExample3();  
		FunctionOverloading a= new  FunctionOverloading();
		a.Display(1);
		a.Display("One");
		
		
	}

}
