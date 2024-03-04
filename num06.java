

package Lista01;
import java.util.Scanner;
/**
 *
 * @author KauãHonorato  <kaua.oliveira.honorato@gmail.com>
 * @date 04/03/2024
 * @brief Class num06
 **/
public class num06 {
public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

   
        double A = ler.nextDouble();
        double B = ler.nextDouble();
        double C = ler.nextDouble();

     
        double pesoA = 2.0;
        double pesoB = 3.0;
        double pesoC = 5.0;


        double MEDIA = (A * pesoA + B * pesoB + C * pesoC) / (pesoA + pesoB + pesoC);

        System.out.printf("MEDIA = %.1f\n", MEDIA);
}
}