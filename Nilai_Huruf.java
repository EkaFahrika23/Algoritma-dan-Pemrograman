import java.util.Scanner;
/**
 *
 * @author eka Fahrika Nariswari
 */
public class Nilai_Huruf {
    public static void main(String[] args) {
        // Buat Scanner
        Scanner inp = new Scanner(System.in);
        
        //Ambil Nama
        System.out.print("Masukkan nama anda =");
        String Nama = inp.nextLine();
        
        // Ambil NIM
        System.out.print("Masukkan NIM =");
        String nim = inp.next();
        
        // Ambil Nilai
        System.out.print("Masukkan nilai =");
        int nilai = inp.nextInt();
        
        // Print
         if(nilai < 0 || nilai > 100) {
            System.out.println("Error");
        } else  if(nilai >= 0 && nilai <= 55){
            System.out.println("E");
        } else if(nilai >= 56 && nilai <= 65){
            System.out.println("D");
        } else if(nilai >= 66 && nilai <= 75){
            System.out.println("C");
        } else if(nilai >= 76 && nilai <= 85){
            System.out.println("B");
        } else if(nilai >= 86 && nilai <= 100){
            System.out.println("A");
    }
            
        }
    }

