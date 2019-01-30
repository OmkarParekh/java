import java.util.*;
class vectormethod{

     public static void main( String args[] ) {

          Vector v = new Vector();
          for (int i = 0; i < args.length; i++) {
               
               v.addElement(args[i]);
               
          }
          System.out.println(  "Elements : " + v);
          System.out.println(  "Capacity : " + v.capacity());
          System.out.println(  "Boolean test : " + v.contains("Adarsh"));
          System.out.println(  "Object elementAt : " + v.elementAt(3));
          
     }
     
}