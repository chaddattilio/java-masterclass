public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public BankAccount() {
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String customerEmail, String customerPhone) {
        System.out.println("BankAccount constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public void depositFunds(double amount) {
        this.balance += amount;
        System.out.println("New balance is $" + this.balance);
    }

    public void withdrawFunds(double amount) {
        double withdrawRequest = amount;

        if (this.balance - withdrawRequest >= 0) {
            this.balance -= amount;
            System.out.println("New balance is $" + this.balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String number) {
        this.accountNumber = number;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double number) {
        this.balance = number;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public void setCustomerEmail(String email) {
        this.customerEmail = email;
    }

    public String getCustomerPhone() {
        return this.customerPhone;
    }

    public void setCustomerPhone(String phone) {
        this.customerPhone = phone;
    }

}

