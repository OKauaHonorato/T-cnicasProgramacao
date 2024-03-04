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
 * @brief Class Num01
 **/
public class Num01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

       
        int durationInSeconds = ler.nextInt();

      
        int hours = durationInSeconds / 3600;
        int minutes = (durationInSeconds % 3600) / 60;
        int seconds = durationInSeconds % 60;

       
        System.out.printf("%d:%d:%d%n", hours, minutes, seconds);
}
}