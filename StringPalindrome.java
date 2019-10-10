package stringpalindrome;
import java.util.Scanner;
public class StringPalindrome {

    public static void main(String[] args) {
       String str, rev = "";
      Scanner sc = new Scanner(System.in);
      int j,test_case;
      test_case = sc.nextInt();
      for(j=1;j<=test_case;j++)
      {
 
      //System.out.println("Enter a string:");
      str = sc.next();
      
     // System.out.println("main string:"+str);
 
      int length = str.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         rev = rev + str.charAt(i);
      
      //System.out.println("reverse string:"+rev);
 
      if (str.equals(rev))
         System.out.println("Yes");
      else
         System.out.println("No");
      rev="";
      }
      }
    }
    

