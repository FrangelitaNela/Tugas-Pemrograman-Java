import java.util.Scanner;
public class menhitungtotal.{
    public static void main(String[] args) {
        int belanja = 0;
 Scanner input=new Scanner(System.in);
 System.out.println("masukkan jumlah jam kerja : ");
 int jumlahjamkerja =  input.nextInt();
  System.out.print("Total upah kerja ");
    int Totalupahkerja =  input.nextInt();
   int hasilperkalian = (jumlahjamkerja*Totalupahkerja);
   
   if ( belanja > 660.000 ) {
   }
   System.out.println(jumlahjamkerja+" x "+Totalupahkerja+" = "+hasilperkalian);
   System.out.println("Terima kasih...");
 }
    
}