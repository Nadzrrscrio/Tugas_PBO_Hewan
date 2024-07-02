import java.util.Scanner;
public class CheckAccount {
    private double balance;
    private double nominal;
    private String name;
    Scanner inputUser = new Scanner(System.in);
    public CheckAccount(){
    }
    public CheckAccount(String name, double balance){
        this.name = name;
        this.balance = balance;
    }
    public void setName(String name){
        this.name   = name;
    }
    public void setBalance(double balance){
        this.balance   = balance;
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
    public void withdraw(){
        System.out.print("Masukkan jumlah uang : ");
        nominal = inputUser.nextDouble();
        if(nominal <= balance ){
            balance = balance - nominal;
            System.out.println("Penarikan uang sebesar: Rp"+ nominal +" berhasil.");
            System.out.println("Sisa saldo: "+balance);
        }else{
            System.out.println("Saldo anda tidak cukup. ");
        }
    }
}