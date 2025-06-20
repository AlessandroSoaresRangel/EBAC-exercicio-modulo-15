import AbstractFactory.Car;
import AbstractFactory.Customer;
import AbstractFactory.Factory;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("A", true);
        Factory factory = getFactory(customer);
        Car car = factory.create(customer.getGradeRequest());
        car.startEngine();

    }

    private static Factory getFactory(Customer customer) {
        if (customer.HasCompanyContract()) {
            return new AbstractFactory.CompanyCarFactory();
        } else {
            return new AbstractFactory.CarFactory();
        }
    }
}