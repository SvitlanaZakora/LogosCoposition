public class Car {
    private String color;
    private int year;
    private String model;
    private Engine engine;
    private Person passenger;

    public Car(String color, int year, String model, Engine engine ){
        this.engine=engine;
        this.color=color;
        this.model=model;
        this.year=year;
    }
}
