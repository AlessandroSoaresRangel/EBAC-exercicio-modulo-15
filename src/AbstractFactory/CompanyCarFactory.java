package AbstractFactory;

public class CompanyCarFactory extends Factory {

    @Override
    Car retriveCar(String requestGrade) {
        switch (requestGrade) {
            case "A":
                return new Bmw(1000, "Full", "Blue");

            case "B":
                return new Audi(1300, "Full", "Black");

            default:
                System.out.println("The requested car is not available");
                return null;
        }
    }
}
