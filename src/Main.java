import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int s1, s2, sonuc, tercih;
        Scanner yazici = new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz: ");
        s1=yazici.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz: ");
        s2=yazici.nextInt();
        System.out.println("Islemler\n" +
                "1 - Toplama\n" +
                "2 - Cikarma\n" +
                "3 - Carpma\n" +
                "4 - Bolme\n");
        System.out.println("Lutfen tercih ediniz: ");
        tercih = yazici.nextInt();

        switch (tercih) {
            case 1:
                System.out.println("Islem sonucu = " + (s1 + s2));
                break;
            case 2:
                System.out.println("Islem Sonucu = "+(s1-s2));
                break;
            case 3:
                System.out.println("Islem Sonucu = "+(s1*s2));
                break;
            case 4:
                System.out.println("Islem Sonucu = "+(s1/s2));
                break;
        }
    }
}
