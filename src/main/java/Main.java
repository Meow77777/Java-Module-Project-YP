import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи количество человек между которыми нужно разделить счёт - ");
        int numberOfPerson;

        while (true) {
            if (scanner.hasNextInt()) {
                numberOfPerson = scanner.nextInt();
                if (numberOfPerson == 1 | numberOfPerson < 1) {
                    System.out.println("Введите число больше 1");
                } else {
                    break;
                }
            } else {
                System.out.println("Вы ввели не число");
                scanner.next();
            }
        }


        String nameOfProduct = "";
        String productSum = "";
        double sumPrice = 0;


        while (true) {
            scanner.nextLine();
            System.out.println("Введите название товара");
            if (scanner.hasNextLine()) {
                nameOfProduct = scanner.nextLine();
                productSum += nameOfProduct + "\n";
                System.out.println("Введите стоимость товара");
                while (true){
                    if (scanner.hasNextDouble()) {
                        double price = scanner.nextDouble();
                        if (price > 0) {
                            sumPrice += price;
                            System.out.println("Товар добавлен");
                            break;
                        } else {
                            System.out.println("Введите стоимость товара > 0");
                        }
                    } else {
                        System.out.println("Введите стоимость товара цифрами");
                        scanner.next();
                    }
                }
            } else {
                System.out.println("Введите название товара буквами");
                scanner.next();
            }

            System.out.println("Хотите добавить ещё один товар? ('Завершить' - чтобы закончить ввод)");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("Завершить")) {
                break;
            }
        }
        double moneyPerPerson = sumPrice/numberOfPerson;
        System.out.println("Добавленные товары:\n"+productSum);

        Rubles rubles = new Rubles(moneyPerPerson);
        rubles.formatter(moneyPerPerson);

        scanner.close();
    }
}