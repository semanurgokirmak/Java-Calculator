
package hesapmakinesi;
import java.util.Scanner;

public class HesapMakinesi {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Sayı :");
        int a = scan.nextInt();
        
        System.out.println("2. Sayı :");
        int b = scan.nextInt();
        
        System.out.println("İşlem Seçiniz :");
        System.out.println("1- Toplama :");
        System.out.println("2- Çıkarma :");
        System.out.println("3- Çarpma :");
        System.out.println("4- Bölme :");
        System.out.println("İşleminiz :");
        int select = scan.nextInt();
        double sonuc= 0.0;
        if (select ==1){
            sonuc = a+b;
           
        } else if (select ==2) {
            sonuc=a-b;
        } else if (select ==3) {
            sonuc= a/b;
        }else if (select== 4){
            if (b==0) {
                System.out.println("Bölen Sayısı Sıfır Olamaz");
            } else {
                sonuc= a/(double)b;
            }
            
        }else {
            System.out.println("Lütfen Geçerli Sayılar Giriniz !");
        }
        System.out.println("Sonuç : "+ sonuc);
    }
    
}
