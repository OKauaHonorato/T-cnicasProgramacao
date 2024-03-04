/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Lista02;
import java.util.Scanner; 
/**
 *
 * @author KauãHonorato  <kaua.oliveira.honorato@gmail.com>
 * @date 04/03/2024
 * @brief Class Num03
 **/
public class Num03 {
public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

       
        double A = ler.nextDouble();
        double B = ler.nextDouble();
        double C = ler.nextDouble();

       
        double discriminant = B * B - 4 * A * C;

       
        if (A == 0 || discriminant < 0) {
            System.out.println("Impossivel calcular");
        } else {
   
            double root1 = (-B + Math.sqrt(discriminant)) / (2 * A);
            double root2 = (-B - Math.sqrt(discriminant)) / (2 * A);


            System.out.printf("R1 = %.5f%n", root1);
            System.out.printf("R2 = %.5f%n", root2);
        }
}
}

