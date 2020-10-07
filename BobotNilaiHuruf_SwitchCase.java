import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;
/**
 *
 * @author Eka Fahrika Nariswari
 */
public class BobotNilaiHuruf_SwitchCase {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String huruf ="";
        System.out.println("Masukkan huruf A-E :");
        huruf = kb.nextLine();
    
    switch(huruf){
            case "A":
            System.out.println("4");
            break;
            
            case "a":
            System.out.println("4");
            break;    
            case "B":
            System.out.println("3");
            break;
            case "b":
            System.out.println("3");
            break;
            
            case "C":
            System.out.println("2");
            break;
            case "c":
            System.out.println("2");
            break;
            case "D":
            System.out.println("1");
            break;
            case "d":
            System.out.println("1");
            break;
            case "E":
            System.out.println("0");
            break;
            case "e":
            System.out.println("0");
            break;
            
        
        default:
            System.out.println("Huruf tidak terdaftar");
            break;
    }
    }
    }
    
    
              
            
            
    
   





