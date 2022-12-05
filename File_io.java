import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
public class File_io
 {

	public static void main(String[] args) throws IOException 
	{
		//File ff = new File("/home/gowthaman/Documents/JAVA/oops/class");
        //boolean created = ff.createNewFile();
        //ff.mkdir();
        //ff.mkdirs();	
        //System.out.println(created);
        //ff.delete();
       
         File ff =new File("/home/gowthaman/Documents/java.text");
         /*ff.createNewFile();
         System.out.println(ff.exists());*/
         //String[] files =ff.list();
         
        /* for(String filename:files)
         {
          System.out.println(filename);
         } */
         
       /* File[] files =ff.listFiles();
         for(File filename:files)
        {
         //if(filename.isDirectory())
          if(filename.isFile())
        System.out.println(filename);
        } */       

/*         File[] files =ff.listFiles();
         for(File filename:files)
        {
         
          if(filename.isFile())
        {
        String name=filename.getName();
        int len =name.length();
        
        String extension =name.substring(len-4);
        if(extension.equals("java"))
        System.out.println(name);
         }        
}*/        

/*         File[] files =ff.listFiles();
         FileWriter fw = new FileWriter(ff,true); 
         fw.write("\n");
         fw.write("akash");
         fw.write("\n");
         fw.write("ruban");
         fw.flush();
         fw.close();*/

//BufferedWriter
    
       /* File[] files =ff.listFiles();
        FileWriter fw = new FileWriter(ff,true);
         BufferedWriter bw = new BufferedWriter(fw); 
         
         bw.write("\n");
         bw.write("akash");
         bw.write("\n");
         bw.write("ruban");
         bw.flush();
         bw.close();
        
*/
//FileReader

 
  FileReader fr = new FileReader(ff);
  int r = fr.read(); 
  int sentenceCount = 1; 
  while(r!=-1)
  {
   char ch = (char)r; 
   if(ch=='.')
    sentenceCount++; 
   r = fr.read(); 
  }
  System.out.println("No. of words "+ sentenceCount);
  

// BufferedReader

/*FileReader fr = new FileReader(ff);
  BufferedReader br = new BufferedReader(fr);
  String r = br.readLine();
  int sentenceCount = 1; 
  while(r!=null)
  {
   System.out.println(r); 
   r = br.readLine();
  }*/
}

}
