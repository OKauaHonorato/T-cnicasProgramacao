

package Lista01;
import java.util.Scanner;
/**
 *
 * @author KauãHonorato  <kaua.oliveira.honorato@gmail.com>
 * @date 04/03/2024
 * @brief Class num07
 **/
public class num07 {
public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        
        int A = ler.nextInt();
        int B = ler.nextInt();
        int C = ler.nextInt();
        int D = ler.nextInt();

       
        int DIFERENCA = (A * B) - (C * D);

        
        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}
