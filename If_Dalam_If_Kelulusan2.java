import java.util.Scanner;
/**
 *
 * @author Eka Fahrika Nariswari
 */
public class If_Dalam_If_Kelulusan2 {

    public static void main(String[] args) {
        // Buat Scanner
        Scanner inp = new Scanner(System.in);
        
        //Ambil Nama
        System.out.print("Masukkan nama anda =");
        String Nama = inp.nextLine();
        
        // Jenis Kelamin
        System.out.print("Masukkan Jenis Kelamin =");
        String JenisKelamin = inp.nextLine();
           
        // Tinggi Badan
        System.out.println("Masukkan Tinggi Badan =");
        int TinggiBadan = inp.nextInt();
        
        // Print
        {if("Laki-laki".equals(JenisKelamin)) {
            }if(TinggiBadan <= 170) {
                System.out.println("Anda Gagal");
            } else if(TinggiBadan <= 230) {
                System.out.println("Selamat Anda Lulus");
            }
        } if("Perempuan".equals(JenisKelamin)) {
            if(TinggiBadan <= 160) {
                System.out.println("Anda Gagal");
            } else if(TinggiBadan <= 210) {
                System.out.println("Selamat Anda Lulus");     
            }
        }
    }
}

            
            
          
    
    
