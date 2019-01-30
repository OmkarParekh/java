// Page no.: Q10
import java.util.*;
class vector{

     public static void main( String args[] ) {

          Vector v = new Vector();
          int l = args.length;
          for (int i = 0; i < l; i++) {
               v.addElement(args[i]);
          }
          System.out.println(v);
          
     }
     
}