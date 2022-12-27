import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi, us, sonuc = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Üssü Alınacak Sayı: ");
        sayi = input.nextInt();

        System.out.print("Üssü kaç almak istersiniz ?: ");
        us = input.nextInt();

        System.out.println("------------------------------");

        for (int i = 1; i <= us; i++ ){
            sonuc *= sayi;
        }

        System.out.println("Cevap: " +sonuc);
    }
}