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
 * @brief Class Num02
 **/
public class Num02 {



    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

    
        int A = ler.nextInt();
        int B = ler.nextInt();
        int C = ler.nextInt();
        int D = ler.nextInt();

       
        boolean condition1 = (B > C) && (D > A);
        boolean condition2 = (C + D) > (A + B);
        boolean condition3 = (C > 0) && (D > 0);
        boolean condition4 = (A % 2 == 0);

   
        if (condition1 && condition2 && condition3 && condition4) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
