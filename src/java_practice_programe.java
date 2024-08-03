
public class java_practice_programe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    
	    
			//1)SWap to number
			int a=100,b=200;
			int temp=a;
			System.out.println("Before swape");
			System.out.println("a"+a);
			System.out.println("b"+b);
		
			a=b;
			b=temp;
			System.out.println("After  swape");
			System.out.println("A" + a);
			System.out.println("B" + b);
			//***********************************************************
			//2)prime number or not
			int m1=6;
			if(m1%2!=0)
			{
			 System.out.println("Number is prime");
			}
			
			else
			{
				System.out.println("Number is not prime");
			}
			//Q4)largest amoung three number
			int a1=700,b1=600,c1=300;
			if(a1>b1)
			{
				System.out.println("largest number is a"+a1);
			}
			else if(b1>c1)
			{
				System.out.println("largest number is b"+b1);
			}
			else
			{
				System.out.println("largest number is c"+c1);
			}
			
	//*************************************************************		
			//Q5)voting eligible or not
			int x=20;
			if(x>18)
			{
				System.out.println("you are eligile to vote");
			}
			else
			{
				System.out.println("you are  not eligile to vote");
			}
			
			
			//***********************************************************
			//Q3)given string is palindrome or not
			
			
				int num = 123, reverse = 0;
			    // palindrome if num and reverse are equal
			    if (getReverse(num, reverse) == num)
			     System.out.println (num + " is Palindrome");
			    else
			      System.out.println (num + " is not Palindrome");
			    
			    
			  
			    //*********************************************
			    
			//******************. Write program to count Odd and Even Number from given array.

	                  //Input: (1,2,3,4,5,6,7,8,9)
			    int[] arr= {1,2,3,4,5,6,7,8,9};
			    int counodd=0;
			    int counteven=0;
			    for(int num2:arr)
			    {
			    	if(num2%2==0)
			    	{
			    		counteven++;
			    	}
			    	else
			    	{
			    		counodd++;
			    	}
			    	
			    	
			    }
			    	System.out.print("number of odd no"+counodd );	
			    	System.out.println("number of even no"+counteven);
			    

	//*****************************
			
			//Q)Write programs To print each letter twice.
			String text="Bhagyashri";
			System.out.println(text);
			for(int i=0;i<=text.length();i++)
			{
				
				char letter=text.charAt(i);
				
				System.out.println(letter);
				System.out.println(letter);
			}
			
		//***************************************************************
			
			//Q)reverce string in java
			//String str="bhagyashri";
			
			
		//***********************************************************
		//	Q) Print Numbers from 1 to 10 using a for Loop
			
			for(int num1=1;num1<=10;num1++)
			{
				System.out.println(num1);
			}
			
			
			//*****************************************************
			
			//Q) Check if a Number is Prime using a for Loop
			
			int prime=10;
			if(prime%2!=0)
			{
				System.out.println("This number is prime number");
			}
			else
			{
				System.out.println("This number is  not  prime number");
			}
			//***********************************
			//Q)Duplicate element in array
			int[]newint= new int []{43,4,6,10,7,7,10,4};
			System.out.println("Duplicate elements in given array: ");  
	        //Searches for duplicate element  
			for(int i=0;i<newint.length;i++)
			{
			for(int j=i+1;j<newint.length;j++)
			{
			if(newint[i]==newint[j])
			System.out.println(newint[j]);
			}
			}
	    //*************************************************
			//Q) Print a Multiplication Table for a Given Number
			int mul=5;
			for(int i=1;i<=10;i++)
			{
			System.out.println(i*5);
			}
		//********************************************************************	
			
			//@Find the Sum of All Elements in an Array   [43,4,6,10,7]
					int[]myarray={43,4,6,10,7};
					int sum=0;
					int s11;
					for( s11=0;s11<myarray.length;s11++)
					{
						sum+=myarray[s11];
					}
					System.out.println(sum);
					
					
		//*************************************************************			
					
					//Q)Reverse array
					 int[] arra=new int[]{1,2,3,4,5};
				        System.out.println("origin array");
				        for(int i=0;i<arra.length;i++)
				        System.out.println(arra[i]+"");
				        System.out.println("reversed array");
				        for(int i=arr.length-1;i>=0;i--)
				        System.out.println(arra[i]+"");
				        
				        
	////Q) Write a program to sort an array[3,4,5,2,1] o/p[1,2,3,4,5]
				        
				        //int[]arra
			
			// *********************************************************
		 	
	//Q)Find the Largest Element and smallest in an Array using a for Loop
			
			int numbers[] = new int[] {5,23,103,55,67,88};

			  //assign first element of an array to largest and smallest
			  int smallest = numbers[0];
			  int largetst = numbers[0];

			  for (int i = 1; i < numbers.length; i++) {
			   if (numbers[i] > largetst)
			    largetst = numbers[i];
			   else if (numbers[i] < smallest)
			    smallest = numbers[i];
			  }

			  System.out.println("Largest Number is : " + largetst);
			  System.out.println("Smallest Number is : " + smallest);
			 }
		
		
			
			
		
				 
	 	
		
				
			
		     
		
		

		
		
			
			
			
			    
			
		    
		  
		//*****************************************************************************
		
		//method create palindrome porograme
		  static int getReverse(int num, int rev)
			{
			    if(num == 0)
			        return rev;
			    
			    int rem = num % 10;
			    rev = rev * 10 + rem;
			    
			    return getReverse(num / 10, rev);
			}	


	

}
