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
public class Tugas02 {
    public static void main(String[] args){
                    System.out.print("1. Deret Faktorial\n2. Deret Fibonacci\nChoice Options : ");
        Scanner scanner = new Scanner(System.in);
        int options = scanner.nextInt();

        switch (options){
            case 1:
                System.out.print("Masukkan Jumlah Faktorial : ");
                int faktorial = scanner.nextInt();
                int hasilFaktorial = 1;

                 for (int i = faktorial; i > 0; i--) {
                     hasilFaktorial*=i;
                    System.out.print(i);

                     if (i != 1) {
                    System.out.print(" * ");
                     }
                 }
                System.out.println(" = "+hasilFaktorial);
            break;
            case 2:
                int limit, nilaiAwal, nilaiSkrg, nilaiAkhir;

                System.out.print("Masukan banyak bilangan yang mau ditampilkan : ");
                limit = scanner.nextInt();
                nilaiAwal = 1;
                nilaiSkrg = 1;
                nilaiAkhir = 1;
                for (int i = 1; i <= limit; i++) {
                    System.out.print(nilaiSkrg + "\n");
                    nilaiAkhir = nilaiAwal + nilaiSkrg;
                    nilaiAwal = nilaiSkrg;
                    nilaiSkrg = nilaiAkhir;

                    if(nilaiAkhir>500){
                        System.out.println("=====================================");
                        System.out.println("Nilai Lebih dari 500\n");
                    }
                }
                break;
            default:
                System.out.println("Inputan Salah");
                break;
        }
    }    
    
}
    