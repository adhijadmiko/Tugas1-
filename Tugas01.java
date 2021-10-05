/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adhi Jadmiko
 */
import java.util.Scanner;
public class Tugas01 {
     public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tinggi piramida : ");
        int value = scanner.nextInt();
        if (value%2 == 0){
            System.out.println("Mendefinisikan Tinggi Piramida Sebagai Bilangan Genap yaitu : "+value);
        }else{
            System.out.println("Mendefinisikan Tinggi Piramida Sebagai Bilangan Ganjil yaitu : "+value);
        }

        System.out.println("Output Piramida");
        for(int i=1; i<=value; i++) {
            for(int j=1; j<=value-i; j++) {
                System.out.print(" ");
            }

            for(int k=1; k<=i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}