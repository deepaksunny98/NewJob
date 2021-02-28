import java.util.Scanner;

public class VowelConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a statement");
		String g=s.nextLine();
		int vowels=0,consonents=0,words=1;
		for(int i=0;i<g.length();i++)
		{
			
			if(g.charAt(i)=='a'||g.charAt(i)=='e'||g.charAt(i)=='i'||g.charAt(i)=='o'||g.charAt(i)=='u')
				vowels++;
				else
					if(g.charAt(i)==' ')
						words++;
					else if(g.charAt(i)>= 'a' && g.charAt(i)<= 'z')
					
					consonents++;
					
					
		}
		System.out.println("Vowels= "+vowels);
		System.out.println("consonents= "+consonents);
		System.out.println("words= "+words);
		
				
		
	}

}