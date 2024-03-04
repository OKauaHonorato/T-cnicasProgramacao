

package Lista01;
import java.util.Scanner;
/**
 *
 * @author KauãHonorato  <kaua.oliveira.honorato@gmail.com>
 * @date 04/03/2024
 * @brief Class Num09
 **/
public class num09 {
public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

      
        String Nome = ler.nextLine();
        double salariofixo = ler.nextDouble();
        double totalvendas = ler.nextDouble();

       
        double totalSalario = salariofixo + (totalvendas * 0.15);

        
        System.out.printf("TOTAL = R$ %.2f\n", totalSalario);

    
    }
}
