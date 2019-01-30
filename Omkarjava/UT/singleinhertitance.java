import java.lang.*;

class person{

     void details(String name, int age){

          String n = this.name;
          int a = this.age;
          System.out.println("Name = " + n);
          System.out.println("Age of "+ this.name + " is " + a);
          
     }
     
}
class employee extends person{

     void emp(String designation, int sal){

          String d = designation;
          int s = sal;
          System.out.println("Designation of "+ n +" is "+ d);
          System.out.println("Salary of "+ n + " is " + sal);
          
     }
     
}

class singleinhertitance extends employee{

     public static void main( String args[] ) {
          
          singleinheritance obj = new singleinheritance();
          obj.details("Adarsh",18);
          obj.emp("Manager",30000);
          
     }
     
}