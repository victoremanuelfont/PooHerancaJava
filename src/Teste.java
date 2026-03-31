import entities.Account;
import entities.BusinessAccount;

public class Teste {
    public static void main(String[] args) {

        Account conta = new Account(01, "Victor", 200.0);
        System.out.println(conta.getBalance());
        conta.withdraw(25);
        System.out.println(conta.getBalance());

        Account conta2 = new BusinessAccount(02, "Emanuel", 200., 250.);
        conta2.withdraw(25);
        System.out.println(conta2.getBalance());


    }
}
