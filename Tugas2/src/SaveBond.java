import java.util.Scanner;

public class SaveBond {
    private int term;
    private double interestRate;
    private long deposit;
    private double bunga;
    Scanner inputUser = new Scanner(System.in);
    public void inputDeposit(){
        System.out.print("Masukkan jumlah deposit : ");
        deposit = inputUser.nextLong();
    }
    public void inputTerm(){
        System.out.print("Masukkan durasi peminjaman (1-60 bulan) : ");
        term = inputUser.nextInt();

        switch ((term - 1) / 12) {
            case 0:
                this.interestRate = 0.005;
                bunga = deposit * interestRate;
                break;

            case 1:
                this.interestRate = 0.010;
                bunga = deposit * interestRate;
                break;

            case 2:
                this.interestRate = 0.015;
                bunga = deposit * interestRate;
                break;

            case 3:
                this.interestRate = 0.020;
                bunga = deposit * interestRate;
                break;

            case 4:
                this.interestRate = 0.025;
                bunga = deposit * interestRate;
                break;
            default:
                System.out.println("=== Maksimal 60 hari! ===");
                inputTerm();
        }
    }
    public void viewDetailInfo(String name, double balance){
        inputDeposit();
        inputTerm();
        System.out.println("Nama         : " + name);
        System.out.println("Saldo awal   : " + balance);
        System.out.println("Deposit      : "+ deposit);
        System.out.println("Durasi       : " + term + " bulan");
        System.out.println("Bunga        : "+ bunga);
        System.out.println("Suku Bunga   : " + interestRate * 100 + "%");
        System.out.println("Saldo Akhir : Rp."+(balance + deposit + bunga));
    }
}