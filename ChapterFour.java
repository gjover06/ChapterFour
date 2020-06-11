/**Author:George Samu
Date:6/3/2020
Purpose: This covers chapter four concepts up to
 page 72- 82


*/
import java.util.Scanner;

public class ChapterFour
{
	public static void main (String[]args)
	{
	
	//System.out.println(" During the first telephone call, " +
	//					"Alexander Graham Bell said \n " + 
	//					"\" Watson, come here!\"");
	//	String fact = "Java is my dog's name"; //21 character
	
	
	//String firstname="George ";
	//String lastname="Samu";
	//String con=firstname.concat(lastname);
	//System.out.println(con);
	
	//the method toUpperCase and toLowerCase
	/**String dogName = "Spot";
	String fact = dogName + " ";
	fact = fact.concat("is my dog's name.");
	System.out.println(fact);
	System.out.println("The variable dogName references the string " +
						dogName + ".");

	String phrase = "Java, Java, Java!";
		
	//makes every word upper case
	System.out.println(phrase.toUpperCase());
	
	//return to normal
	System.out.println(phrase);
	
	
	String firstname= "George";
	String lastName= "Samu";
	String middleName= "Julian";
	String fullName= firstname + " " + middleName + " " + lastName + " ";
	fullName=fullName.concat("is my full name");
	System.out.println(fullName);
	System.out.println(fullName.toLowerCase());
	
	//the method trim
	String line= "  Along came a spider,  ";
	String trimmedLine = line.trim();
	System.out.println(trimmedLine);
	System.out.println(line);
	*/
	//char seventhCharacter= trimmedLine.charAt(6); //character at index 6
	
	String myName="George Samu";
	char firstInitial=myName.charAt(0);
	char lastInitial=myName.charAt(7);
	
	System.out.println("My first and last initials are" +firstInitial+lastInitial);
	System.out.println();
	
	//using the charAt method
	String line= "    Along came a spider,   ";
	String trimmedLine = line.trim();
	System.out.println(trimmedLine.charAt(trimmedLine.length()-1));
	
	//using the method replace
	String phrase= "spamming a homey bum";
	
	phrase=phrase.replace('m', 'n');
	
	System.out.println(phrase);
	
	//learning the method substring
	String word = "Barefoot";
	// index       01234567
	String sub1 = word.substring(0,3);
	
	System.out.println("The sub of " + word + "[0,3) is :: " +sub1);
	
	//trim
	String border="George Samu";
	String borderLine= border.trim();
	
	System.out.println("The name George Samu should be printed as: "+ borderLine);
	
	//looking for foot
	String sub4=word.substring(4,8);
	System.out.println("The sub of"+ word+"[4,8) is :: " +sub4);
	
	//still learning the method substring
	String pluralword= "Decreases";
	// index            012345678
	System.out.println("The word \"Decreases\" will under go substring to become: "+ 
						pluralword.substring(2,8));

	//Question 13
	int spaceindex=phrase.indexOf(" ");
	String first=phrase.substring(0, spaceindex);
	String second=phrase.substring(spaceindex + 1);
	
	System.out.println(first);
	System.out.println();
	System.out.println(second);
	
	//4.21 The method equals 
	String greeting="Hello";
	boolean result=greeting.equals("hi");
	System.out.println("The result is: " + result);
	

	//The method equalsIgnoreCase
	boolean result1=greeting.equalsIgnoreCase("hElLo");
	System.out.println("The result1 is: " +result1);
	
	//The method compareTo
	String ability="able";
	String skill="baker";
	System.out.println("The two words \"able\" and \"baker\" compared are: "+
						ability.compareTo(skill));
						
	String bugsLife="bug";
	String size="big";
	System.out.println("The two words \"bug\" and \"big\" compared are : "+
						bugsLife.compareTo(size));
	
	String hue="Color";
	String pigmentation="color";
	System.out.println("The words \"Color\" and \"color\" compared are : "+
						hue.compareTo(pigmentation));
	
	String singular="bug";
	String plural="bugs";
	System.out.println("The words \"bug\" and \"bugs\" compared are : "+
						singular.compareTo(plural));
	
	String camel="Java";
	String letter="A";
	System.out.println("The words \"Java\" and \"A\" compared are : "+
						camel.compareTo(letter));
	
	String camelCase="Java";
	String lowerLetter="a";
	System.out.println("The words \"Java\" and \"a\" compared are : "+
						camelCase.compareTo(lowerLetter));
	
	//difference between methods nextLine and next
	Scanner keyboard=new Scanner(System.in);
	System.out.println("Enter name ");
	String message=keyboard.nextLine();
	
	System.out.println("The first and lastname is using nextLine is : " +message);
	
	System.out.println("Enter name again");
	String words=keyboard.next();
	
	System.out.println("The first and last name using next method is: "+words);
	
	
	
	}//end main
}// end ChapterFour