/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phan_1;
import java.util.Scanner;

/**
 *
 * @author Tai Smart PC
 */
public class BT_3 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        if (a == 0) {
            if (b == 0)
                System.out.println("Phuong trinh vo so nghiem");
            else
                System.out.println("Phuong trinh vo nghiem");
        } else {
            double x = -b / a;
            System.out.println("Nghiem x = " + x);
        }
    }
}
