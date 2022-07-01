package alpha;

public class Star {

	
	public static void star()
	{
		int i,j;
		
	for(i=0;i<4;i++)
	{
		 
	for(j=0;j<=i;j++)
		{
			System.out.print("*");
		}
			
	System.out.println(" ");
	}
	
	}

	public static void main(String[] args) {
		
		Star a= new  Star();
		//int n=5;
		Star.star();
	}

}
