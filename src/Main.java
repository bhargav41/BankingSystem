public class Main {
    public static void main(String[] args){
        Bank bank = new Bank("State Bank Of India");

        bank.addNewBranch("Durgapur");
        bank.addCustomer("Gautam","Durgapur",1000.00);
        bank.addCustomer("Saurav","Durgapur",2000.00);
        bank.addCustomer("Akshit","Durgapur",3000.00);
        bank.addCustomer("Mousom","Durgapur",4000.00);

        bank.addNewBranch("Kolkata");
        bank.addCustomer("Rajesh","Kolkata",343.34);

        bank.addCustomerTransactions("Durgapur","Gautam",100.50);
        bank.addCustomerTransactions("Durgapur","Gautam",57.50);
        bank.addCustomerTransactions("Durgapur","Gautam",30.50);
        bank.addCustomerTransactions("Durgapur","Gautam",200.00);

        bank.listCustomers("Durgapur",true);

    }
}
