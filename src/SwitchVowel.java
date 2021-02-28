import java.util.Scanner;

public class SwitchVowel {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a character");
		String c = s.next();
	
		switch (c)
		{
		case "a" : 
		case "e" : 
		case "i" : 
		case "o" : 
		case "u" : System.out.println(c+" is Vowel");break;
		
			
			default: System.out.println(c+" is consonent");
					 System.exit(1);//comes out of program
		}

	}

}
