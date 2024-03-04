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
 * @brief Class Num06
 **/
public class Num06 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

    
        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

    
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println();

   
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

