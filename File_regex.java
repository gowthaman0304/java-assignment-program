

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class File_regex {

	public static void main(String[] args) throws IOException 
	{
		File ff = new File("/home/gowthaman/javatask/java.txt");
	    File ff2 = new File("/home/gowthaman/javatask/Mobilenum.txt");
		boolean created = ff.createNewFile();
		boolean create = ff2.createNewFile();	   
		//System.out.println(created);
	    
	    
	    FileWriter fw =new FileWriter(ff);
	    FileWriter fw2 =new FileWriter(ff2);
	    fw.write("Name:Gowthaman.G");
	    fw.write("\n");
	    fw.write("Mobile Number:917358048570");
	    fw.write("\n");
	    fw.write("Mail Id:gowthamg099@gmail.com");
	    fw.flush();
	    fw.close();
	    
	    FileReader fr =new FileReader(ff);
	    BufferedReader br =new BufferedReader(fr);
	    String read = br.readLine();
	    
	    //PrintWriter write = new PrintWriter("/home/gowthaman/javatask/Mobilenum.txt");
	    Pattern pattern = Pattern.compile("(0|91)?[6-9][0-9]{9}");
	    String number = "";
	    while(read!=null)
	    {
	      Matcher matcherobj = pattern.matcher(read);
	      if(matcherobj.find())
	      {
	        fw2.write(matcherobj.group());
	      }
	      read = br.readLine();
	    }
	    fw2.flush();
	    fw2.close();
	    
	    FileReader fr2 = new FileReader(ff2);
	    BufferedReader br2 = new BufferedReader(fr2);
	    String read2 = br2.readLine();
	    while(read2!=null)
	    {
	      System.out.println(read2);
	      read2 = br2.readLine();
	    }
	   
	}

}

