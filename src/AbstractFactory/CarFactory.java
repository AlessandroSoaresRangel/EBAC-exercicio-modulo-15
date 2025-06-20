package AbstractFactory;

public class CarFactory extends Factory {

    @Override
    Car retriveCar(String requestGrade) {
        switch (requestGrade) {
            case "A":
                return new Toyota(1000, "Full", "Blue");

            case "B":
                return new Ferrari(1300, "Full", "Black");

            default:
                System.out.println("The requested car is not available");
                return null;
        }
    }

}
