
package fileinforead;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInfoRead {

    public static void main(String[] args) throws FileNotFoundException, IOException {
       File in=new File("G:\\inputfile.txt");//file from we want to read data
       if(in.exists())
       {
            FileInputStream is = new FileInputStream(in);//makes the content into raw byte
             BufferedReader br = new BufferedReader(new InputStreamReader(is));//An InputStreamReader is a bridge from byte streams to character streams
             String s="";
              File op = new File("G:\\outputfile.txt");
              FileWriter fw = new FileWriter(op);//FileWriter is meant for writing streams of characters.
              BufferedWriter bw = new BufferedWriter(fw);
             while((s=br.readLine())!=null)
             {
                 System.out.println(s);
                 bw.write(s+"\n");
                 
             }
             bw.close();
             br.close();
       }
       else
            System.out.println("source file does not exists");   
    }
    
}
