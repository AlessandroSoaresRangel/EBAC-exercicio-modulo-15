package AbstractFactory;

public class Toyota extends Car {

    public Toyota(int horsePower, String fuelSource, String color) {
        super(horsePower, fuelSource, color);
    }

    @Override
    public void startEngine() {
        System.out.println("The Toyota " + this.getFuelSource() + " engine has been started, and is ready to utilize "
                + this.getHorsePower() + " this is the power");
    }

    @Override
    public void clean() {
        System.out.println("Toyota has been cleaned, and the " + this.getColor().toLowerCase() + " color shines");
    }

    @Override
    public void mechanicCheck() {
        System.out.println("Toyota has been checked by the mechanic. Everything is right");
    }

    @Override
    public void fuelCar() {
        System.out.println("Toyota has been filled with " + this.getFuelSource().toLowerCase());
    }

}
