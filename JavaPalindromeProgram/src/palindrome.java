

import java.util.Scanner;
import java.util.stream.IntStream;

public class palindrome {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number ");
		int number=scanner.nextInt();
		scanner.close();
		if(isPalindrome(number)) {
			System.out.println("num is palindrome: "+number);
		}else {
			System.out.println("num is not palindrome: "+number);
			
		}
	}
         public static boolean isPalindrome(int number) {
        	 String original =String.valueOf(number);
        	 String reversed=IntStream.rangeClosed(1,original.length()).mapToObj(i->original.charAt(original.length()-i)).collect(StringBuilder::new,StringBuilder::append ,StringBuilder::append).toString();                                                              
             return original.equals(reversed);
         
	}

}
