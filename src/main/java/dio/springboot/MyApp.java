package dio.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {

    private final Calculadora calculadora;

    public MyApp(final Calculadora calculadora){
        this.calculadora = calculadora;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("o resultado é " + calculadora.somar(5,5));
    }
}
