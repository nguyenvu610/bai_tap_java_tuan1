/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phan_2;
import java.util.Scanner;
/**
 *
 * @author Tai Smart PC
 */
public class BT_6 {
          public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Nhap thang: ");
          int month = sc.nextInt();
          System.out.print("Nhap nam: ");
          int year = sc.nextInt();
          int days;
          switch (month) {
              case 2:
                  days = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;
                  break;
              case 4: case 6: case 9: case 11:
                  days = 30;
                  break;
              default:
                  days = 31;
          }
          System.out.println("Thang " + month + " co " + days + " ngay.");
      }
}
