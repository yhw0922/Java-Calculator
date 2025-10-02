public class AdvancedCalculator extends Calculator {
    //계산기 v2.0 개발
    //이슈 :


    //곱셈 연산자로 두 수 곱하기 완료
    //

    @Override
    public int multiply()
    {
        result = num1 * num2;
        return result;
    }

    @Override
    public int divide()
    {
        result = num1 / num2;
        return result;
    }
}
