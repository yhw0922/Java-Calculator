import static org.junit.jupiter.api.Assertions.*;

class AdvancedCalculatorTest {
    AdvancedCalculator advancedCalc; //객체 선언

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        advancedCalc = new AdvancedCalculator(); //객체 생성
        advancedCalc.setNumbers(9, 3);
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        assertEquals(27, advancedCalc.multiply());
    }

    @org.junit.jupiter.api.Test
    void divide() {
        assertEquals(3, advancedCalc.divide());
    }
}