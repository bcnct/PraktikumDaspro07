import java.util.Scanner;

public class StudiKasus107 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;
        System.out.println("Masukkan jumlah gelas:");
        jumlahCup = sc.nextInt();
        System.out.println("Masukkan jumlah uang yang digunakan untuk membayar:");
        uangBayar = sc.nextInt();
        totalHarga = jumlahCup * hargaPerCup; 
        diskon = 0;
        totalHarga >= 100000 ? diskon = totalHarga * 10/100 : totalBayar = totalHarga - diskon;
    }
}