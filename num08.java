

package Lista01;
import java.util.Scanner;
/**
 *
 * @author KauãHonorato  <kaua.oliveira.honorato@gmail.com>
 * @date 04/03/2024
 * @brief Class num08
 **/
public class num08 {
public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

     
        int NumEmp = ler.nextInt();
        int horatrab = ler.nextInt();
        double hora = ler.nextDouble();

       
        double salario = horatrab * hora;

       
        System.out.printf("Numero = %d\n", NumEmp);
        System.out.printf("Salario = U$ %.2f\n", salario);


       
    }
}
