public class Car {
    private String make;
    private String model;
    private int year;

    // Constructor
    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    // Make
    public String setCarMake(String make){
        this.make = make;
        return make;
    }
    public String getCarMake(){
        return make;
    }

    // Model
    public String setCarModel(String model){
        this.model = model;
        return model;
    }
    public String getCarModel(){
        return model;
    }

    // Year
    public int setCarYear(int year){
        this.year = year;
        return year;
    }
    public int getCarYear(){
        return year;
    }

    // toString
    public String toString(){
        return "Car make: " + make + ", model: " + model + ", year: " + year;
    }

    public static void main(String[] args){
        Car car_1 = new Car("Ford", "F150", 2015);
        Car car_2 = new Car("Chevy", "Covette", 2017);
        Car car_3 = new Car("Jeep", "Rubicon", 2020);

        Options option_1 = new Options("A", "C");
        Options option_2 = new Options("B", "D");

        System.out.println("Car Java App\n");
        System.out.println(car_1.toString());
        System.out.println(car_2.toString());
        System.out.println(car_3.toString()+'\n');
        
        System.out.println(option_1.toString());
        System.out.println(option_2.toString()+'\n');
    }

}
