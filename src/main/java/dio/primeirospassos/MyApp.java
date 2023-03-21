package dio.primeirospassos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component // Para informar que são beans
public class MyApp implements CommandLineRunner {
    // Injetando a dependencia de um objeto a outro
    @Autowired
    private Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {

        calculadora.setNumbers();

        System.out.println("A soma é: " + calculadora.somar());
        System.out.println("A subtração é: " + calculadora.subtrair());
        System.out.println("A multiplicação é: " + calculadora.multiplicar());
        System.out.println("A divisão é: " + calculadora.dividir());

    }
}
