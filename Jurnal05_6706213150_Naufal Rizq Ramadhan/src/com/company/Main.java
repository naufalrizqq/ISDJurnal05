package com.company;
import java.util.Scanner;

/**
 * Sumber :
 * https://www.w3big.com/id/java/data-intopost.html
 */

public class Main {

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    String masukkan = s.next();
    String keluaran;

    InfixToPostfix hasil = new InfixToPostfix(masukkan);
    keluaran = hasil.doTrans();
    System.out.println(keluaran);
    }
}
