/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Lista02;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author KauãHonorato  <kaua.oliveira.honorato@gmail.com>
 * @date 04/03/2024
 * @brief Class Num14
 **/
public class Num14 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            int d = scanner.nextInt();

            if (n == 0 && d == 0) {
                break;
            }

            String number = scanner.next();
            Stack<Character> stack = new Stack<>();

            for (char digit : number.toCharArray()) {
                while (d > 0 && !stack.isEmpty() && stack.peek() < digit) {
                    stack.pop();
                    d--;
                }
                stack.push(digit);
            }

       
            while (d > 0) {
                stack.pop();
                d--;
            }

            StringBuilder highestPrize = new StringBuilder();
            while (!stack.isEmpty()) {
                highestPrize.insert(0, stack.pop());
            }

            System.out.println(highestPrize.toString());
        }
    }
}

