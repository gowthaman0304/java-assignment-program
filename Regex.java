
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) 
	{
    
		Regex rx = new Regex();
		//rx.regex1();
		//rx.regex2();
		//rx.regex3();
		//rx.regex4();
		rx.regex5();
	}

	private void regex5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter anything here");
		String input =sc.nextLine();
		Pattern patternObj = Pattern.compile("(0|91)?[6-9][0-9]{9}");
		Matcher matcherObj = patternObj.matcher( input);
		//System.out.println(matcherObj.find());
		
		while(matcherObj.find())
		{
		System.out.print(matcherObj.group());
		}
		
	}

	private void regex4() {
		String name="GowthaMg099@gmail.com";
		Pattern patternObj = Pattern.compile("[^A-Za-z0-9]");
		Matcher matcherObj = patternObj.matcher(name);
		//System.out.println(matcherObj.find());
		
		while(matcherObj.find())
		{
		System.out.print(matcherObj.group());
		}
		
	}

	private void regex3() {
		String name="gowtham arun akash mahasivam gowthaman arunkumar sivam";
		Pattern patternObj = Pattern.compile("[^arun]");
		Matcher matcherObj = patternObj.matcher(name);
		//System.out.println(matcherObj.find());
		
		while(matcherObj.find())
		{
		System.out.print(matcherObj.group());
		}
		}
		
	

	private void regex2() {
		String name="gowtham arun akash mahasivam gowthaman arunkumar sivam";
		Pattern patternObj = Pattern.compile("[arun]");
		Matcher matcherObj = patternObj.matcher(name);
		//System.out.println(matcherObj.find());
		
		while(matcherObj.find())
		{
		System.out.print(matcherObj.group());
		}
		}
		
	

	private void regex1() {
		String name="gowtham arun akash mahasivam gowthaman arunkumar sivam";
		Pattern patternObj = Pattern.compile("arun");
		Matcher matcherObj = patternObj.matcher(name);
		//System.out.println(matcherObj.find());
		
		while(matcherObj.find())
		{
		System.out.println(matcherObj.group());
		}
		}

} 

