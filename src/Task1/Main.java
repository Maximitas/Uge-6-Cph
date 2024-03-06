package Task1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //Task 1.e
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Lasse", "Hansen", "Maximitas"));
        customers.add(new Customer("Asim", "Kilic", "Aerrow"));
        customers.add(new Customer("Johan", "Paulsen", "Ash"));
        printCustomers(customers);
    }

    //Task 1.f
    public static void printCustomers(ArrayList<Customer> customers){
        for (Customer u: customers){
            System.out.println(u);
        }

    }
}