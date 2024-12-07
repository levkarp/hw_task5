/*Создание массива продуктов внутри программы (без пользовательского ввода);
Создание массива цен на продукты (без пользовательского ввода); Вывод списка доступных для покупки продуктов на экран;
Возможность ввода пользователем одной строкой номера продукта и количества для добавления в корзину;
Пользователь может добавлять несколько раз один и тот же товар в корзину, в этом случае он должен суммироваться);
Вывод всех покупок, их общую стоимость и количество на экран. Пример
Список возможных товаров для покупки
1. Молоко 50 руб/шт
2. Хлеб 14 руб/шт
3. Гречневая крупа 80 руб/шт
Выберите товар и количество или введите end
1 10 <enter>
Выберите товар и количество или введите end
3 1 <enter>
Выберите товар и количество или введите end
end <enter>
Ваша корзина:
Наименование товара   Количество  Цена/за.ед  Общая стоимость
Молоко                                   10                  50                    500
Гречневая крупа                   1                     80                    80
Итого                                                                                      580
*/

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ProductsCost {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] products = {"Греча", "Рис", "Макароны", "Киноа"};
        int[] prices = {80, 150, 70, 250};
        // int[] quantitySklad = {3, 50, 7, 5};TODO сделать зависимость от кол-ва товаров на складе
        int[] basket = new int[products.length];
        System.out.println("Список возможных товаров для покупки:");
        for (int i = 0; i < products.length; i++) {
            System.out.println(i + 1 + ". " + products[i] + " " + prices[i] + " руб.шт.");

        }
        int sum = 0;

        while (true) {
            System.out.println("Выберите товар и кол-во: 1-греча, 2-рис, 3-макароны, 4-киноа, end -для выхода");

            String input = scanner.nextLine();
            if ("end".equals(input) || "End".equals(input)) break;

            String[] parts = input.split(" ");

           int numberOfProductInput = Integer.parseInt(parts[0]);
            int prodQuantity=Integer.parseInt(parts[1]);
            switch (numberOfProductInput) {

                case 1 -> {

                    sum += prices[0] * prodQuantity;

                    basket[0] += prodQuantity;
                    System.out.println("добавлено " + products[0]);
                }

                case 2 -> {

                    sum += prices[1] * prodQuantity;

                    basket[1] += prodQuantity;
                    System.out.println("добавлено " + products[1]);

            }
                case 3->{

                    sum += prices[2] * prodQuantity;

                    basket [2]+=prodQuantity;
                    System.out.println("добавлено " + products[2]);}
                case 4->{

                    sum += prices[3] * prodQuantity;

                    basket [3]+=prodQuantity;
                    System.out.println("добавлено " + products[3]);}
            }

        }
        System.out.println("""
                Ваша корзина:
                Наименование товара \t\t  Количество\t\t Цена/за ед.\t  Общая стоимость
                """);
        for (int i = 0; i < products.length; i++) {
            System.out.printf("%-30s %10d %14d %18d%n",
                    products[i],
                    basket[i],
                    prices[i],
                    prices[i] * basket[i]
            );
        }
        System.out.println("Общая сумма: " + sum);
        }


}






