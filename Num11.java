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
 * @brief Class Num11
 **/
public class Num11 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int R1 = scanner.nextInt();
            int X1 = scanner.nextInt();
            int Y1 = scanner.nextInt();
            int R2 = scanner.nextInt();
            int X2 = scanner.nextInt();
            int Y2 = scanner.nextInt();

  
            double distance = Math.sqrt((X2 - X1) * (X2 - X1) + (Y2 - Y1) * (Y2 - Y1));


            if (distance + R2 <= R1) {
                System.out.println("RICO");
            } else {
                System.out.println("MORTO");
            }
        }
    }
}

