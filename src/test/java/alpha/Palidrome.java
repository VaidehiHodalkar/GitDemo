package alpha;

public class Palidrome {

	

public void palidrome()
{
	String n="Vaidehi" ;
	String p="";
	
	
	char r;
	 int i;
	
	for (i=0;i<n.length()-1;i++)
	{
		
		 r = n.charAt(i);
		 p= r+p;
		 
	}
	if(n==p)
	
	System.out.println("string is palidrome");
	
	else 
 System.out.println("string is not palidrome");
	
}
	public static void main(String[] args) {
	
	{
		
		Palidrome pr=new Palidrome();
		pr.palidrome();
		
	}
	
	
	}
}
