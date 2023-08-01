package miPrincipal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Triangulo t = new Triangulo();
        int lado1,lado2,lado3;

        Scanner consola = new Scanner(System.in);

        System.out.println("Identificador de tipo de triangulo");
        System.out.println("======================");

        System.out.print("Introduce el primer lado:");
        lado1 = consola.nextInt();
        
        System.out.print("Introduce el segundo lado:");
        lado2 = consola.nextInt();
        
        System.out.print("Introduce el tercer lado:");
        lado3 = consola.nextInt();

        System.out.println("El resultado es "+t.verifica(lado1, lado2, lado3));
        consola.close();
    }
}
