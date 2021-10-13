import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name){
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addNewBranch(String branchName){
        if(findBranch(branchName)==null){
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String customerName, String branchName, double initialAmount){
        Branch existingBranch = findBranch(branchName);
        if(existingBranch!=null){
            return existingBranch.addNewCustomer(customerName,initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransactions(String branchName,String customerName,double amount){
        Branch existingBranch = findBranch(branchName);
        if(existingBranch!=null){
            return existingBranch.addTransaction(customerName,amount);
        }
        return false;
    }

    public Branch findBranch(String branchName){
        for(int i=0;i<branches.size();i++){
            if(branches.get(i).getName().equals(branchName))
                return branches.get(i);
        }
        return null;
    }

    public boolean listCustomers(String branch,boolean showTransactions){
        Branch existingBranch = findBranch(branch);
        if(existingBranch!=null){
            ArrayList<Customer> branchCustomers = existingBranch.getCustomers();
            for(int i=0;i<branchCustomers.size();i++){
                System.out.println("Customer: "+ branchCustomers.get(i).getName());
                if(showTransactions){
                    ArrayList<Double> transactions = branchCustomers.get(i).getTransactions();
                    System.out.println("Transactions for Customer "+(i+1));
                    for(int j=0;j<transactions.size();j++){
                        System.out.println("["+(j+1)+"]  Amount: "+ transactions.get(j));
                    }
                }
            }
            return true;
        }else return false;
    }
}
