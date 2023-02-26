public class Calcalator {
    public int calc (int num1, int num2, char operation){
        Reader reader = new Reader();
        int result;
        switch (operation){
            case '+':
                result = num1 + num2; break;
            case '-':
                result = num1 - num2; break;
            case '*':
                result = num1 * num2; break;
            case '/':
                result = num1 / num2; break;
            default:
                System.out.println("Ошибка ввода, повторите ввод.");
                result = calc(num1, num2, reader.getOperation());
        }
        return result;
    }
}
