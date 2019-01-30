// Page no.:55 Q10
import java.lang.*;

class stringMethods{

     public static void main( String args[] ) {
          
          // charAt(index)
          String str = "Java Programming";
          char index = str.charAt(3);
          System.out.println(index + " // charAt(index)");

          // boolean equals(object object2)
          String str2 = "Java Programming";
          boolean value = str.equals(str2);
          System.out.println(value + " // str.equals(str2)");

          // Booolean equals ignore case
          String str3  = "java rogramming";
          boolean val = str.equalsIgnoreCase(str3);
          System.out.println(val + " // str.equalsIgnoreCase(str2)");

          // Lenght of the string
          int len  = str.length();
          System.out.println(len + "// Lenght of the srting");
          
     }
     
}