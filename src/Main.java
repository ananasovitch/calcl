import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(calc(input));
    }
    public static String calc(String input) throws Exception {
        String[] operands = input.split(" ");
        int a = Integer.parseInt(operands[0]);
        int b = Integer.parseInt(operands[2]);
        String operator = operands[1];

        if (!operator.matches("[+\\-*/]")) throw new Exception("Неподдерживаемая математическая операция");
        if (operands.length != 3) throw new Exception("Должно быть два операнда");
        if (operator == null) throw new Exception("Неподдерживаемая математическая операция");
        if (a<=0 || b<0 || a>10 || b>10 ) {throw new Exception("Числа от 1 до 10");
        }

        switch (operator) {
            case "+" -> {
                return String.valueOf(a + b);
            }
            case "-" -> {
                return String.valueOf(a - b);
            }
            case "*" -> {
                return String.valueOf(a * b);
            }
            case "/" -> {
                return String.valueOf(a / b);
            }
        }
        return operator;
}}
