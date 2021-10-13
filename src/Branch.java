import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name){
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName(){
        return name;
    }
    public ArrayList<Customer> getCustomers(){
        return customers;
    }
    public boolean addNewCustomer(String customerName,Double initialAmount){
        if(findCustomer(customerName) == null){
            customers.add(new Customer(customerName,initialAmount));
            return true;
        }
        return false;
    }
    public boolean addTransaction(String customerName,Double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer!=null){
            existingCustomer.addTransaction(amount);
            return  true;
        }
        return false;
    }

    public Customer findCustomer(String customerName){
        if(customers.size()!=0) {
            for(int i=0;i<customers.size();i++){
                if(customers.get(i).getName().equals(customerName)){
                    return customers.get(i);
                }
            }
        }

        return null;
    }
}
