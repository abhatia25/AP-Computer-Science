/*Aditya Bhatia
9/25/2019
StringExample*/
public class StringExample
{	public static void main(String[] args)
	{	String s1 = "Computer Science"; //instantiates a new string object named s1 and assigns the value "Computer Science" to it
		int x = 307; //instantiates an integer variable named x and assigns it the value of 307
		String s2 = s1 + " " + x; //instantiates a new string object named s2 and assigns it the value of s1 concatenated with " " and the integer x
		String s3 = s2.substring(10,17); //instantiates a new string object named s3 and assigns it the value of a substring of s2 from the index value 10 to 17 (start index is inclusive, end index is non-inclusive)
		String s4 = "is fun"; //instantiates a new string object named s4 and assigns it the value "is fun"
		String s5 = s2 + s4; //instantiates a new string object named s5 and assigns it the value of s2 concatenated with s4
		
		System.out.println("s1: " + s1); //prints the string value "s1: " concatenated with the value of the string object s1
		System.out.println("s2: " + s2); //prints the string value "s2: " concatenated with the value of the string object s2
		System.out.println("s3: " + s3); //prints the string value "s3: " concatenated with the value of the string object s3
		System.out.println("s4: " + s4); //prints the string value "s4: " concatenated with the value of the string object s4
		System.out.println("s5: " + s5); //prints the string value "s5: " concatenated with the value of the string object s5
		
		//showing effect of precedence
		
		x = 3; //assigns the value 3 to the integer variable x
		int y = 5; //instantiates an integer variable named y and assigns it the value of 5
		String s6 = x + y + "total"; //instantiates a new string object named s6 and assigns it the value of the value of the integer x concatenated with the value of the integer y and the string "total"
		String s7 = "total " + x + y; //instantiates a new string object named s7 and assigns it the value of the string "total "  concatenated with the value of the integer x and the value of the integer y
		String s8 = " " + x + y + "total"; //instantiates a new string object named s8 and assigns it the value of the string " " concatenated with the value of the integer x and the value of the integer y and the string "total"
		System.out.println("s6: " + s6); //prints the string value "s6: " concatenated with the value of the string object s6
		System.out.println("s7: " + s7); //prints the string value "s7: " concatenated with the value of the string object s7
		System.out.println("s8: " + s8); //prints the string value "s8: " concatenated with the value of the string object s8
	}
}