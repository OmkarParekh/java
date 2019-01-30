class animal{

     int speed = 100;
     void move(){};
          
}
class dog extends animal{

     void move(){

          System.out.println("Speed of the Animal :" + super.speed);
          
     }
     
}
class move{

     public static void main( String args[] ) {

          dog d = new dog();
          d.move();
          
     }
     
}