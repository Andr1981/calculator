import java.util.Scanner;

public class Calculator {
        Scanner scanner = new Scanner(System.in);
        int a = getInt();
        int b = getInt();
        char operation = getOperation();
        int result = calc (a,b,operation);



    public int calc(int a, int b, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result =a / b;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(a, b, getOperation());
        }
        return result;
    }

    public char getOperation() {
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public  int getInt() {
        System.out.println("Введите число: ");
        int num;
        if (scanner.hasNext()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку");
            scanner.next();
            num = getInt();
        }

        return num;
    }
}
