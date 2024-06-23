package dio.springboot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PrimeirosPassosApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void validaAssert(){
		Assertions.assertEquals(10, 5+5);
	}

}
