import java.util.Scanner;

public class StudiKasus118 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Cup: ");
        int jumlahCup = input.nextInt();
        System.out.print("Masukkan uang bayar: ");
        int uangBayar = input.nextInt();

        int totalHarga = jumlahCup * 18000;
        int diskon = 0;

        if (totalHarga >= 100000)
            diskon = totalHarga * 10 / 100;
        int totalBayar = totalHarga - diskon;

        System.out.println("Total harga\t: Rp " + totalHarga);
        System.out.println("Diskon\t\t: Rp " + totalBayar);
        System.out.println("Total bayar\t: Rp " + totalBayar);

        if (uangBayar >= totalBayar) {
            System.out.println("Kembalian\t: Rp " + (uangBayar - totalBayar));
        } else {
            System.out.println("Uang tidak cukup, kurang Rp " + (totalBayar - uangBayar));

        }
        input.close();
    }
}
