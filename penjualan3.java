import java.util.Scanner;
public class penjualan3 {
    public static void main(String[] args) {
        int masukanjumlahjamkerja = 0;
        int totalupahkerja= 0;
 Scanner input=new Scanner(System.in);
 System.out.println("masukkan jumlah jam kerja : ");
 int jumlahjamkerja =  input.nextInt();
  System.out.print("Total upah kerja ");
    int Totalupahkerja =  input.nextInt();
   int hasilperkalian = (jumlahjamkerja*Totalupahkerja);
   
   if ( jumlahjamkerja> 2500) {
   }
   System.out.println(jumlahjamkerja+" x "+Totalupahkerja+" = "+hasilperkalian);
   System.out.println("Terima kasih...");
 }
    
}