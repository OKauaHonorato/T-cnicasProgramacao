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
 * @brief Class Num09
 **/
public class Num09 {



    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int N = ler.nextInt(); 

        for (int i = 0; i < N; i++) {
            int X = ler.nextInt(); 

          
            boolean isPerfect = isPerfectNumber(X);

            
            if (isPerfect) {
                System.out.printf("%d eh perfeito%n", X);
            } else {
                System.out.printf("%d nao eh perfeito%n", X);
            }
        }

     
        ler.close();
    }

  
    public static boolean isPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }

        int sum = 1;


        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

  
        return sum == num;

    }
}

