package dio.primeirospassos;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Calculadora {
    Scanner in = new Scanner(System.in);
    int num1, num2;

    public void setNumbers(){
        System.out.print("Informe o num1: ");
        num1 = in.nextInt();
        System.out.print("Informe o num2: ");
        num2 = in.nextInt();
    }

    public int somar(){
        return num1 + num2;
    }
    public int multiplicar(){
        return num1 * num2;
    }
    public int dividir(){
        return num1 / num2;
    }
    public int subtrair(){
        return num1 - num2;
    }

}
