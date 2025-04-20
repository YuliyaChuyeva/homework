public class BankAccount {
    private String accountNumber;
    private double balance;

    public String getAccountNumber(){
        return accountNumber;
    }

    public  double getBalance(){
        return balance;
    }
    public void setAccountNumber(String accountNumber){
        if(accountNumber.length()==10){
            this.accountNumber=accountNumber;
        }
        else {
            System.out.println("Invalid");
        }
    }

    public void depozite(double amount){
        if(amount>0){
            balance=balance+amount;
        }
        else {
            System.out.println("НЕ добавляет");
        }
    }

    public String toString(){
        return "AccountNumber " + accountNumber + " Balance " + balance;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber("1234567892");
        bankAccount.depozite(29.8);
        bankAccount.depozite(121.6);
        System.out.println(bankAccount.toString());
    }
}
