// Page 48 Q.10
class constant{

     constant(){

          System.out.println("Constructor Working!! // Default Constructor");
          
     }
     constant(int x, int y){

          int a = x, b = y;
          a += b;
          System.out.println("Addition is : " + a + " // Parameterized Constructor");
          
     }
     
     public static void main( String args[] ) {

          constant object_1 = new constant(); // Use of default constructor
          constant object_2 = new constant(2,3); // use of the Parameterized constructor
          
     }
     
}