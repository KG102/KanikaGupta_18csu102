import java.util.*;
class vowel
{
public static void main(String args[])
{
char ch;


System.out.println("Enter a character :");
Scanner scan=new Scanner(System.in);
ch=scan.next().charAt(0);
if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
{
	switch(ch)
	{
	case 'a' :
	case 'A' :
	case 'e' :
	case 'i' :
	case 'o' :
	case 'u' :
	case 'E' :
	case 'I' :
	case 'O' :
	case 'U' :System.out.println(" vowel");
	break;
	default:System.out.println("consonants");
}
}
else 
{
	System.out.println("error");
}

	
}

}
