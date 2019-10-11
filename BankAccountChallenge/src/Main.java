public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setAccountNumber("12345");
        account.setBalance(100.00);
        account.setCustomerName("Chad Dattilio");
        account.setCustomerEmail("test@test.com");
        account.setCustomerPhone("123-456-7890");

        account.depositFunds(50.00);
        account.withdrawFunds(200.00);
    }
}
