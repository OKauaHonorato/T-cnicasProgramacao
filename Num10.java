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
 * @brief Class Num10
 **/
public class Num10 {



    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        while (ler.hasNext()) {
            int L = ler.nextInt();

            int maxSpeed = 0; 

            for (int i = 0; i < L; i++) {
                int Vi = ler.nextInt(); 

               
                if (Vi > maxSpeed) {
                    maxSpeed = Vi;
                }
            }

            
            int level;
            if (maxSpeed < 10) {
                level = 1;
            } else if (maxSpeed >= 10 && maxSpeed < 20) {
                level = 2;
            } else {
                level = 3;
            }

            System.out.println(level);
        }
    }
}

