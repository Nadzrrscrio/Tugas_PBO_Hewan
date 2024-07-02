import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        SaveBond objSavingBond = new SaveBond();
        CheckAccount objCheckingAccount = new CheckAccount("Nadzar", 1000000);

        System.out.println("Nama    : " + objCheckingAccount.getName());
        System.out.println("Saldo   : Rp." + objCheckingAccount.getBalance());
        System.out.println("==== MENU ====");
        System.out.println("1. Penarikan");
        System.out.println("2. Deposito");
        System.out.print("Pilihanmu : ");
        int pilihan = inputUser.nextInt();
        switch (pilihan) {
            case 1:
                objCheckingAccount.withdraw();
                break;
            case 2:
                objSavingBond.viewDetailInfo(objCheckingAccount.getName(), objCheckingAccount.getBalance());
                break;
            default:
                System.out.println("Input tidak valid, Coba lagi!");
                main(null);
        }
    }
}