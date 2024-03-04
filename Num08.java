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
 * @brief Class Num08
 **/
public class Num08 {


public class Ex8DivisorsI {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

       
        int N = ler.nextInt();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.println(i);
            }
        }
    }
}
}
