import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(1, "Berat", "Karacaoğlu"));
        customers.add(new Customer(2, "Ali", "Karacaoğlu"));
        customers.add(new Customer(3, "Yahya", "Karacaoğlu"));

        for (Customer customer : customers){
            System.out.println(customer.firstName);
        }
    }
}