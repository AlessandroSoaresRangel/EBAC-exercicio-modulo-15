package AbstractFactory;

public class Audi extends Car {

    public Audi(int horsePower, java.lang.String fuelSource, java.lang.String color) {
        super(horsePower, fuelSource, color);
    }

    @Override
    public void startEngine() {
        System.out.println("The Audi " + this.getFuelSource() + " engine has been started, and is ready to utilize "
                + this.getHorsePower() + " this is the power");
    }

    @Override
    public void clean() {
        System.out.println("Audi has been cleaned, and the " + this.getColor().toLowerCase() + " color shines");
    }

    @Override
    public void mechanicCheck() {
        System.out.println("Audi has been checked by the mechanic. Everything is right");
    }

    @Override
    public void fuelCar() {
        System.out.println("Audi has been filled with " + this.getFuelSource().toLowerCase());
    }
}
