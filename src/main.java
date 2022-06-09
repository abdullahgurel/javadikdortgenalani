import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        /*
        Dik Üçgende Hipotenüs Bulan Program
       Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
       Ödev
      Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
      Formül
      Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

      𝑢 = (a+b+c) / 2

     Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        */
        Scanner dikdortgen = new Scanner(System.in);
        int a,b,u;
        double c,alan;
        System.out.print("ilk degeri: ");
        a = dikdortgen.nextInt();
        System.out.print("ikinci degeri: ");
        b = dikdortgen.nextInt();
        c = (a*a)*(b*b);
        System.out.println("Hipatunus Kenarı: "+ c);
        u = (int) ((a+b+c) / 2);
        alan =u*(u-a)*(u-b)*(u-c);
        System.out.println("Sonuç: "+ alan);






    }
}
