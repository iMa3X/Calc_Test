import java.util.Scanner;

public class Reader {
    static Scanner scan = new Scanner(System.in);
    public int getInt(){

        int num;
        System.out.print("Введите целочисленное число: ");
        if (scan.hasNextInt()){
            num = scan.nextInt();
        } else {
            System.out.println("Ошибка при вводе целочисленного числа. Повторите ввод.");
            scan.next();
            num = getInt();
        }
        return num;
    }
    public char getOperation(){
        char operation;
        System.out.print("Введите операцию ('+', '-', '*', '/') : ");
        if (scan.hasNext()){
            operation = scan.next().charAt(0);
        } else {
            System.out.println("Ошибка при вводе операции. Повторите ввод");
            scan.next();
            operation = getOperation();
        }
        return operation;
    }
}
