import Examples.Car;


public class Runner {

    public static void main(String[] args) {

        Car.transport();

        Car c1 = new Car();

        Car c2 = new Car("diesel engine",2,4);
        System.out.println(c2.engine);
        System.out.println(c2.noofmirror);
        System.out.println(c2.nooftyers);








    }
}
