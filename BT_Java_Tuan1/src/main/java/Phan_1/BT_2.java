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
public class BT_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        double dai = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        double rong = sc.nextDouble();
        double dientich = dai * rong;
        System.out.println("Dien tich la: " + dientich);
    }
}
