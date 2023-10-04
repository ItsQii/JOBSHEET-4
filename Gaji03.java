import java.util.Scanner;

public class Gaji03 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int jm1Masuk, jm1TdkMasuk, TotGaji ;
        int gaji = 40000, potGaji = 25000;
        System.out.println("Masukkan jumlah hari masuk kerja anda");
        jm1Masuk=input.nextInt();
        System.out.println("Masukkan jumlah hari tidak masuk anda");
        jm1TdkMasuk=input.nextInt();
        TotGaji=(jm1Masuk*gaji)-(jm1TdkMasuk*potGaji);
        System.out.println("gaji yang anda terima adalah" + TotGaji);

    }
}