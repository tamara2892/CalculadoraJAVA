package calculadorajava;

import java.util.Scanner;

public class CalculadoraJava {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int opcion;

        System.out.println("MENU: \n 1.Sumar \n 2.Restar \n 3.Multiplicar \n 4.Dividir \n 5.Salir \nElija una opcion:");
        opcion = leer.nextInt();

        if (opcion < 5) {

            Calculadora calculadora = new Calculadora();
            Calculadora calculadora1 = calculadora.altaCalculadora();
            calculadora.sumar();
            calculadora.restar();
            calculadora.multiplicar();
            calculadora.dividir();

            switch (opcion) {
                case 1 -> System.out.println("La Suma de los numeros es: " + calculadora.sumar());
                case 2 -> System.out.println("La Resta de los numeros es: " + calculadora.restar());
                case 3 -> System.out.println("La Multiplicacion de los numeros es: " + calculadora.multiplicar());
                case 4 -> System.out.println("La Division de los numeros es: " + calculadora.dividir());

            }
        } else {
            System.out.println("Cerrar calculadora");
        }
    }

}
