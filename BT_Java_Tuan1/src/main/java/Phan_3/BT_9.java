/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phan_3;
import java.util.Scanner;
/**
 *
 * @author Tai Smart PC
 */
public class BT_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n < 2)
            isPrime = false;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(n + (isPrime ? " la so nguyen to" : " khong phai so nguyen to"));
    }
}
