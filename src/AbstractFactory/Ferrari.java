package AbstractFactory;

public class Ferrari extends Car {

    public Ferrari(int horsePower, String fuelSource, String color) {
        super(horsePower, fuelSource, color);
    }

    @Override
    public void startEngine() {
        System.out.println("The Ferrari " + this.getFuelSource() + " engine has been started, and is ready to utilize "
                + this.getHorsePower() + " this is the power");
    }

    @Override
    public void clean() {
        System.out.println("Ferrari has been cleaned, and the " + this.getColor().toLowerCase() + " color shines");
    }

    @Override
    public void mechanicCheck() {
        System.out.println("Ferrari has been checked by the mechanic. Everything is right");
    }

    @Override
    public void fuelCar() {
        System.out.println("Ferrari has been filled with " + this.getFuelSource().toLowerCase());
    }

}
