public class bank {
    static class Account{
        String name;
        long accountNumber;
        double balance;
        Account(String name, long accountNumber, double balance){
            this.name = name;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
    }
    
static class details {
    public static void main(String[] args) {
        Account acc = new Account("Thor", 1234567890, 10000.50);
        System.out.println("Account Holder: " + acc.name);
        System.out.println("Account Number: " + acc.accountNumber);
        System.out.println("Balance: " + acc.balance);  
        
    }
}



}
