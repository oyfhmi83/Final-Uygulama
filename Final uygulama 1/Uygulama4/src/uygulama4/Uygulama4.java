
package uygulama4;

import java.util.Scanner; //Kullanıcının girdiği değerleri okuyabilmek için util dahil ediyorum.
public class Uygulama4 {

    public static void main(String[] args) 
    {
     int sayi,sonuc;  //int değişkeninde parametre alıyoruz
        Scanner input=new Scanner(System.in); //Kullanıcının girdiği değerleri okumak için Scanner kullanıyoruz.
System.out.print( "Lütfen Bir Sayı Giriniz:" ); //Kullanıcıdan alınan sonucu ekrana yazdırdım
        sayi=input.nextInt(); 
        sonuc=kup(sayi); // 
System.out.println(sayi+ "Sayının Küpü = " + sonuc); //Kullanıcıdan alınan sonucu ekrana yazdırdım
    }
        public static int kup(int a) //Alınan sonucun değerini alıp küp sayısını buluyoruz.
        {
                    return a*a*a; //Değeri döndürüp işlemi sonlandırır.
        }
}
