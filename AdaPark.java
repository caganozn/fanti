import java.util.Scanner;

public class adapark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kac adet Ada Sarp varyasyonu istersiniz?");
        int length = sc.nextInt();
        String[] adamsarp = new String[length];

        for (int i = 0; i < length; i++) {
            System.out.println((i + 1) + ". varyasyonu giriniz");
            String newpak = sc.next();
            String pak = newpak.substring(0, 1).toLowerCase() + newpak.substring(1);
            String sarp = newpak.substring(0, 1).toUpperCase() + newpak.substring(1);
            String var1 = ("Ada " + sarp + " Öz" + pak);
            adamsarp[i] = var1;
        }
        for (int i = 0; i < length; i++) {
            System.out.println(adamsarp[i]);
        }
        System.out.println("Bu isimlerin hangisini kullanmak istersiniz? [1,2,3 olarak seçiniz]");

        int temp = sc.nextInt();
        String karakter = adamsarp[temp - 1];
        System.out.println("Sectiginiz karakter " + karakter + ". Onayliyor musunuz? [evet / hayir]");
        String ans = sc.next();
        if (ans.equals("evet")) {
            System.out.println("Yeni karakteriniz " + karakter + ".");
        }
        if (ans.equals("hayir")) {
            System.out.println("Program tekrardan baslatiliyor");
        } else
            System.out.println("Tekrardan yapmaniz icin sistem tekrardan calistirilacaktir.");
        System.exit(0);
    }
}
