package OOPS;

class Car {
    String brand;   // attributes
    String model;
    int maxSpeed;

    Car() { //default constructor
        System.out.println("Default Constructor");
        this.brand = "maruti";
        this.model = "swift";
        this.maxSpeed = 150;
    }
    
    Car(String brand, String model, int maxSpeed) {
        System.out.println("Parameterized Constructor");
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    Car(Car car) {
        this.brand = car.brand;
        this.maxSpeed = car.maxSpeed;
        this.model = car.model;
    }
}

public class ClassInJava {
    public static void main(String[] args) {
        Car obj1 = new Car();
        Car obj2 = new Car("rolls-royce", "rolls-royce phantom", 250);
        
        Car obj3 = obj2; // shallow copy  - references 
        Car Obj4 = new Car(obj2);  // deep copy  - values  copy constructor

    }
}
