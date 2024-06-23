package dio.springboot.app;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }
}
