package ch.team1.persistence;

public class Presentation {

    CustomerDAOIf customer = new CustomerDAO();

    CustomerDAO konkret = new CustomerDAO();

    public void displayCustomer() {
        System.out.println("Customer: firstname=" + customer.getFirstName() + " lastname=" + customer.getLastName());
        konkret.lokaleMethode();
    }

    public void addCustomer(String firstName, String lastName) {
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
    }
}
