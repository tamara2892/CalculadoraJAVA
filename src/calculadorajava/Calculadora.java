package calculadorajava;

import java.util.Scanner;

public class Calculadora {

    public double numero1;
    public double numero2;
 
    public Calculadora altaCalculadora() {

        Calculadora calculadora = new Calculadora();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        numero1 = leer.nextDouble();
        System.out.println("Ingrese el segundo numero");
        numero2 = leer.nextDouble();
        return calculadora;

    }
    
    public double sumar() {

        return numero1 + numero2;

    }

    public double restar() {

        return numero1 - numero2;

    }

    public double multiplicar() {

        return numero1 * numero2;

    }

    public double dividir() {

        return numero1 / numero2;

    }

}

