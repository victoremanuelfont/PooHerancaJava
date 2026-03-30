import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        BusinessAccount account = new BusinessAccount();
        BusinessAccount account2 = new BusinessAccount(1,"Victor",1500.00,2500.00);
        Account account3 = new Account();
        Account account4 = new Account(1, "Juliana", 1500.00);

        /*
        UPCASTING =  pegar um objeto do tipo BusinessAccount e atribui-lo numa
        variável do tipo Account
         */

        Account acc = new Account(1001, "Victor", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria",0.0,500.0);

        /*
        BusinessAccount é uma Account: Relação é-um
         */
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "João", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        /*
        DOWNCASTING = Converte um ojeto da Superclase para a subclasse.
         */

        BusinessAccount acc4 = (BusinessAccount) acc2;



        /*
        Não da para converter subclasse em subclasse.
        BusinessAccount bacc1 = (BusinessAccount) acc3;
        acc3 é SavingAccount, outra subclasse
         */

        /*
        InstanceOf para testar se um objeto é instancia de outro
         */

        if(acc3 instanceof BusinessAccount){
           BusinessAccount acc5 = (BusinessAccount) acc3;
           acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }

    }
}
