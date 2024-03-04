public class Gecko {
    public static String name = "Kocil";
    public static String kelamin = "Jantan";
    public static String jenis = "Sunglow";
    public static String warna = "kuning";
    public static String favFood = "Jangkrik";
    public static int usia = 1;
    public static float berat  = 0.8f;

    public  static void main(String[] args){
        displayGecko();
        berat();
    }

    public static void displayGecko(){
        System.out.println("Nama :" + name);
        System.out.print("Usia :" + usia);
        System.out.println("tahun");
        System.out.println("Kelamin :" + kelamin);
        System.out.println("Jenis :" + jenis);
        System.out.println("Warna :" + warna);
        System.out.println("Makanan Favorit :" + favFood);
        System.out.println();
    }

    public static void berat(){
        System.out.println("Berat :" + berat + "kg");
    }
}