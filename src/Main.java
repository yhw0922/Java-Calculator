//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Calculator calc_add = new Calculator();
        calc_add.setNumbers(5, 3);
        calc_add.add();
        calc_add.displayResult("+");

        Calculator calc_sub = new Calculator();
        calc_sub.setNumbers(5, 3);
        calc_sub.subtract();
        calc_sub.displayResult("-");

        Calculator calc_mul = new Calculator();
        calc_mul.setNumbers(5, 3);
        calc_mul.multiply();
        calc_mul.displayResult("*");

        Calculator calc_div = new Calculator();
        calc_div.setNumbers(10, 2);
        calc_div.divide();
        calc_div.displayResult("/");
    }
}