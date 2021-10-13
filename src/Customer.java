import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, Double initialAmount){
        this.name = name;
        transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public void addTransaction(Double amount){
        this.transactions.add(amount);
    }

    public String getName(){
        return name;
    }

    public ArrayList<Double> getTransactions(){
        return transactions;
    }

}
