import java.util.Scanner;

public class NotOrt {
    public static void main(String[] args) {
        //Değişkenler
        int Mat, Fiz, Kim, Turk, Tarih, Muzik;
        Scanner grade = new Scanner(System.in);

        System.out.print("Matematik dersi notunuzu giriniz: ");
        Mat = grade.nextInt();

        System.out.print("Fizik dersi notunuzu giriniz: ");
        Fiz = grade.nextInt();

        System.out.print("Kimya dersi notunuzu giriniz: ");
        Kim = grade.nextInt();

        System.out.print("Türkçe dersi notunuzu giriniz: ");
        Turk = grade.nextInt();

        System.out.print("Tarih dersi notunuzu giriniz: ");
        Tarih = grade.nextInt();

        System.out.print("Müzik dersi notunuzu giriniz: ");
        Muzik = grade.nextInt();

        double notOrt = (Mat + Fiz + Kim + Turk + Tarih + Muzik) / 6.0;
        System.out.println("Not ortalamanız: " + notOrt);
        if (notOrt >= 60)
            System.out.println("Sınıfı geçtiniz.");
        else
            System.out.println("Sınıfta kaldınız.");

    }
}
