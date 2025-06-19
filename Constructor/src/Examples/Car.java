package Examples;

public class Car {

    public String engine;
    public int noofmirror;
    public int nooftyers;


    // default constructors

     public Car(){
         System.out.println("default constructors");
     }


  // method
    public static void transport(){
        System.out.println("car is transport object");
    }

    // parameter constructor

    public Car (String engine,int noofmirror,int nooftyers){
        this.engine = engine;
        this.noofmirror = noofmirror;
        this.nooftyers = nooftyers;

    }
}
