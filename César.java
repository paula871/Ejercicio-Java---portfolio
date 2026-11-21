/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Paula
 */
public class César {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Frase: ");
        String cadena = sc.nextLine();

        int num = 0;
        do {
            System.out.print("Desplazamiento: ");
            num = sc.nextInt();
            if (num <= 0) {
                System.out.println("Debes introducir un numero positivo");
            }
        }while (num <= 0);

        String resultado = "";
        for (int i = 0; i <= cadena.length() - 1; i++) {
            char letra = cadena.charAt(i);
            if (letra >= 'A' && letra <= 'Z') {
                // Es una mayúscula
                letra = (char) ('A' + (letra - 'A' + num) % 26);
            } else if (letra >= 'a' && letra <= 'z') {
                // Es una minúscula
                letra = (char) ('a' + (letra - 'a' + num) % 26);
            } else {
                // No es una letra
            }
            resultado = resultado + letra;
        }

        System.out.println("Frase cifrada: " + resultado);
    }
}
