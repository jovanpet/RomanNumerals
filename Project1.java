

/*Roman.java
 * This is a problem that takes in ints from 1-3999 and returns the number in Roman numerals
 */


public class Project1 {

	public static void main(String[] args) {
		int number=TextIO.getInt();
		
		String[] letters= {"M", "D", "C", "L", "X", "V", "I"}; //array of letters that could be used in making of a  Roman number
		int i=1000; int ind=0; //i is used as a way to devide the original number and in return get one of the digits
							   //ind is an indicator for which Roman number is supposed to be printed
		
		if(number>3999 || number<1) //case the number is not in the domain
		{
			System.out.print(number + " is out of the expected range");
		}
		else //case if the number is in the domain
		{
			while(i > 0)
			{
				if(number/i<4) //checking if the digit is smaller than 4. This is how we know if need to print for example 'I' 'II' or 'III'
				{
					for(int k=number/i; k>0; k--)
					{
						System.out.print(letters[ind]);
					}
				}
				else if(number/i==4) //if the digit is 4 prints for example 'IV'
				{
					System.out.print(letters[ind] + letters[ind-1]);
				}
				else if(number/i==5) // if the digit is 5 prints for example 'V'
				{
					System.out.print(letters[ind-1]);
				}
				else if(number/i<9) //if the digit is bigger than 5 but smaller than 9 it prints for example 'VI' 'VII' 'VIII'
				{
					System.out.print(letters[ind-1]);
				
					for(int k=(number/i)-5; k>0; k--)
					{
						System.out.print(letters[ind]);
					}
				}
				else if(number/i==9) //if the digit 9 it prints IX
				{
					System.out.print(letters[ind] + letters[ind-2]);
				}
			
				number%=i;      
				ind+=2;
				i/=10; 
			} //while
		}
		
	}//main

}//Project1
