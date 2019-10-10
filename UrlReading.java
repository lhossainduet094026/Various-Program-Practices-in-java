package urlreading;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlReading {
    public static String getUrlContent(String urlAdress)
    {
        String line="";
        try
        {
           URL url =new URL(urlAdress);  
           InputStreamReader i = new InputStreamReader(url.openStream());
           BufferedReader br = new BufferedReader(i); 
            FileWriter fw = new FileWriter(new File("G:\\f.txt"));
            BufferedWriter bw = new BufferedWriter(fw);
           while((line=br.readLine())!=null)
           {
               System.out.println(line);
               System.out.println("\n");
               bw.write(line);
               bw.write("\n");     
           }
           bw.close();
           i.close();
           br.close();
        } 
        catch (Exception ex) 
        {
            System.out.println(ex.getMessage());
        }
        return "content";
    }
    public static void main(String[] args) {
       String content = getUrlContent("https://www.google.com");
    }
    
}
