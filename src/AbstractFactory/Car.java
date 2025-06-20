package AbstractFactory;

public abstract class Car {
    private int horsePower;
    private String fuelSource;
    private String color;

    public Car(int horsePower, String fuelSource, String color) {
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }

    public void startEngine() {
        System.out.println("The " + this.fuelSource + " engine has been started, and is ready to utilize "
                + this.horsePower + " this is the power");
    }

    public void clean() {
        System.out.println("Car has been clenned, and the " + this.color.toLowerCase() + "color shines");
    }

    public void mechanicCheck() {
        System.out.println("Car has been checked by the mechanic. Everything is right");
    }

    public void fuelCar() {
        System.out.println("Car has been filled with " + this.fuelSource.toLowerCase());
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getFuelSource() {
        return fuelSource;
    }

    public void setFuelSource(String fuelSource) {
        this.fuelSource = fuelSource;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
