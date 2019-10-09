import java.util.Scanner;
public class penjualanprinter1 {
  public static void main(String[] args) {
      
 Scanner input=new Scanner(System.in);
 System.out.println("masukkan harga printer : ");
 int hargaprinter =  input.nextInt();
  System.out.println("masukkan  jumlahBarang : ");
   int jumlahBarang =  input.nextInt();
   int hasilperkalian = (hargaprinter*jumlahBarang);
   System.out.println(hargaprinter+" x "+jumlahBarang+" = "+ hasilperkalian);
 }
}