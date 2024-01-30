/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmicaculator;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         while (true) {
             View v = new View();
             Manager M = new Manager(); 
             v.menu();
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    M.normalCalculator();
                    break;
                case 2:
                    M.BMICalculator();
                    break;
                case 3:
                    return;
            }   
        }
    }
}