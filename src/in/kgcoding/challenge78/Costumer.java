package in.kgcoding.challenge78;

public class Costumer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456","Swayam");
        account.depositMoney(100);
        System.out.println(account.withdrawMoney(200));
        account.depositMoney(-40);
        account.withdrawMoney(0);
    }

}
