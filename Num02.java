

package Lista01;
import java.util.Scanner;
/**
 *
 * @author KauãHonorato  <kaua.oliveira.honorato@gmail.com>
 * @date 04/03/2024
 * @brief Class Num02
**/
 public class Num02 {
     

    public static void main(String[] args) {
         
        Scanner ler = new Scanner(System.in);

                
        double R = ler.nextDouble();

        
        double pi = 3.14159;
        double A = pi * R * R;

        
        System.out.printf("A=%.4f\n", A);

    }
 }