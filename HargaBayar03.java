import java.util.Scanner;

public class HargaBayar03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga, jumlah;
        double dis=0.1, total, bayar, jm1Dis;
        System.out.println("Masukkan harga barang yang di beli");
        harga=input.nextInt();
        System.out.println("Masukkan jumlah barang yang di beli");
        jumlah=input.nextInt();

        total=harga*jumlah;
        jm1Dis=total*dis;
        bayar=total-jm1Dis;
        System.out.println("diskon yang anda dapatkan adalah" + jm1Dis);
        System.out.println("jumlah yang harus dibayar" + bayar);
    }
}