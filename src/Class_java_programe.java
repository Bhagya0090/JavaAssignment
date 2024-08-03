
public class Class_java_programe {

	public static void main(String[] args) {

		//1)feboseries
		int n1=0,n2=1,n3,i,count=10;
		System.out.println(n1+" "+n2);
		for(i=1;i<count;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
					
		}
		
		//2.prime number
		int A=9;
		if(A%2!=0)
		{
			System.out.println("no is prime");
			

		}
		else
		{
			System.out.println("Given no is not prime");
		}
		
		//q10)Create a program to determine the eligibility of a person to vote based on
		//	their age.
		
		int age=2;
		if(age>18)
		{
			System.out.println("Yor are eligible to vote");
			
	}
		else
		{
			System.out.println("you are not eligible to vote");
		}
	

	//even number
		int no=20;
		//for(no=1;no<=20;no++)
		
			if(no%2==0)
			{
				System.out.println("no is even");
				
		}
			else
			{
				System.out.println("no is not odd");
				
			}
			
	
		int x=10,y=8,z=7;
		if(x>=y && x>=z)
		{
			System.out.println("greater no"+x);
			
		}
		else if(y>=x &&  y>=z)
		{
			System.out.println("greater no"+y);
			
		}
		else
		{
			System.out.println("greater no"+z);
			
		}
		// vowel
		
		char v='B';
		if(v=='A'||v=='e'||v=='i'||v=='o'||v=='u')
		{
			System.out.println("No is vowel");
		}
		else
		{
			System.out.println("No is not vowel");
		}
	}
	
			
		


}
