import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.Arguments;
//import org.junit.jupiter.params.provider.CsvSource;
//import org.junit.jupiter.params.provider.MethodSource;
//import org.junit.jupiter.params.provider.ValueSource;
//import java.util.stream.Stream;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {


    @Test
    public void add_1plus2_returns_3() {
        // given
        int a= 1;
      int b = 2;
        Calculator calculator = new Calculator();

        // when
       int result = calculator.add(a, b);

        //then
        assertThat(result).isEqualTo(3);
    }

@Test
    public void asserting()
{
    assertThat("\t".length() > 0).isTrue();
}

}

