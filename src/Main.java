public class Main {
    public static void main(String[] args) {
        System.out.println("Hello i'm new Calculator!");

        Reader read = new Reader();
        Calcalator calc = new Calcalator();

        int firstNumber = read.getInt();
        int secondNumber = read.getInt();
        char operation = read.getOperation();
        int result = calc.calc(firstNumber,secondNumber, operation);

        System.out.println("Результат: " + result);
    }
}