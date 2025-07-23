/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phan_4;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Tai Smart PC
 */
public class BT_12 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Mang sau khi sap xep tang dan:");
        for (int i : arr)
            System.out.print(i + " ");
    }
}
