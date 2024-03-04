

package Lista01;
import java.util.Scanner;

/**
 *
 * @author KauãHonorato  <kaua.oliveira.honorato@gmail.com>
 */
public class Num01 {

    public static void main(String[] args) {
         
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira Valor de A"); 
        int A = ler.nextInt();
        System.out.println("Insira Valor de B"); 
        int B = ler.nextInt();

        
        int X = A + B;

        
        System.out.println("X = " + X);
    }
}
