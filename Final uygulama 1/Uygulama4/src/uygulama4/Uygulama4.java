
package uygulama4;

import java.util.Scanner; 
public class Uygulama4 {

    public static void main(String[] args) 
    {
     int sayi,sonuc;  
        Scanner input=new Scanner(System.in); 
System.out.print( "Lütfen Bir Sayı Giriniz:" ); 
        sayi=input.nextInt(); 
        sonuc=kup(sayi); // 
System.out.println(sayi+ "Sayının Küpü = " + sonuc); 
    }
        public static int kup(int a) 
        {
                    return a*a*a;
        }
}
