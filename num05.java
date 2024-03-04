

package Lista01;
import java.util.Scanner;
/**
 *
 * @author KauãHonorato  <kaua.oliveira.honorato@gmail.com>
 * @date 04/03/2024
 * @brief Class num05
 **/
public class num05 {
 public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

       
        double A = ler.nextDouble();
        double B = ler.nextDouble();

        
        double weightA = 3.5;
        double weightB = 7.5;

        
        double MEDIA = (A * weightA + B * weightB) / (weightA + weightB);

      
        System.out.printf("MEDIA = %.5f\n", MEDIA);
}
}