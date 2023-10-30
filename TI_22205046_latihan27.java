/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package saldo.ti_22205046_latihan27;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class TI_22205046_latihan27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan kalimat :");
        String input = sc.nextLine();
        System.out.println("===============Hasil Formatting=================");
        System.out.println("Huruf besar :"+input.toUpperCase());
        System.out.println("Huruf kecil :"+input.toLowerCase());
    }
}
