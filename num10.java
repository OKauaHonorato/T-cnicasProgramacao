

package Lista01;
import java.util.Scanner;
/**
 *
 * @author KauãHonorato  <kaua.oliveira.honorato@gmail.com>
 * @date 04/03/2024
 * @brief Class num10
 **/
public class num10 {
   public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

       
        int productCode1 = ler.nextInt();
        int units1 = ler.nextInt();
        double price1 = ler.nextDouble();

       
        int productCode2 = ler.nextInt();
        int units2 = ler.nextInt();
        double price2 = ler.nextDouble();

        
        double totalAmount = (units1 * price1) + (units2 * price2);

       
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalAmount);

       
    }
}
