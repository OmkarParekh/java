class addConst{

     int a,b,c;
     addConst(int x, int y){

          this.a = x;
          this.b = y;
          this.c = a + b;
          
     }
     public static void main( String args[] ) {

          addConst add1 = new addConst(1,1);
          addConst add2 = new addConst(2,3);
          System.out.println( "Addition of " + add1.a + " and " + add1.b + " is " + add1.c );
          System.out.println( "Addition of " + add2.a + " and " + add2.b + " is " + add2.c );
           
     }
}