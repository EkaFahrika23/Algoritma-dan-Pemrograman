import java.util.Scanner;
/**
 *
 * @author Eka Fahrika Nariswari
 */
public class If_Else_Kelulusan {
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
        if(nilai > 75) {
             System.out.println("Anda Lulus");
        } else {
             System.out.println("Anda Tidak Lulus");
                  
          
            
        }
        
                
    }
    
}