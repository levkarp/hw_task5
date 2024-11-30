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
        String[] products2 = {"Греча", "Рис", "Макароны", "Киноа"};
        // String[] products = {"Греча 80", "Рис 150", "Макароны 70", "Киноа 250"};
        int[] prices = {80, 150, 70, 250};
        int[] quantitySklad = {3,50,7,5};
        String[] purchase = new String[8];
        int sum=0;
        int numberOfProductInput;
        // String[][] productquantity=new String[4][4];
        // String[][] productQuantity={{"Греча","Рис","Макароны","Киноа"},{"80","150","70","250"}};

        //System.out.println("Список возможных товаров для покупки: " + Arrays.toString(products));


        System.out.println("Список возможных товаров для покупки: " + products2[0] + " " + prices[0] + " " +
                products2[1] + " " + prices[1] + " " + products2[2] + " " + prices[2] + " " + products2[3] + " " + prices[3]);
        while (true) {
          //  System.out.println("Введите продукт, который покупаете и его количество через пробел");

             System.out.println("Введите номер для покупки: 1-греча, 2-рис, 3-макароны, 4-киноа");

            String input = scanner.nextLine();

            if ("end".equals(input) || "End".equals(input)) break;


            String[] purchase2 = input.split(" ");
            //  System.out.println(Arrays.toString(purchase2));
            numberOfProductInput = Integer.parseInt(input);// парсим стринг для свича
            switch (numberOfProductInput) {

                case 1:
                    System.out.println("Введите название продукта и количество");
                    System.out.println("test1");
                    String inputProd1=scanner.nextLine(); // второй сканер для получения массива
                      String[] purchaseInput1 = inputProd1.split(" ");//делим через пробел
                      System.out.println(Arrays.toString(purchaseInput1)); // для проверки
                    String nameOfProduct1 = purchaseInput1[0];// TODO   можно сделать проверку на правильный ввод названия продукта
                    int quantityInput1 = Integer.parseInt(purchaseInput1[1]);
                    if (quantityInput1<=quantitySklad[0]){ // TODO  см. ниже, если можно, то сделать аналогично
                    System.out.println(nameOfProduct1 + " "+quantityInput1);
                    sum+=prices[0]; // TODO  уточнить у Мурата про изменение количества на складе. Не массив, а список?
                    System.out.println("купили " + nameOfProduct1+" " +" "+ "итого "+ sum);}
                    else System.out.println("Количество товаров не хватает в магазине, приходите завтра");
                    System.exit(-1);

                    break;
                case 2:
                    System.out.println("Введите название продукта и количество");
                    System.out.println("test2");
                    String inputProd2=scanner.nextLine(); // второй сканер для получения массива
                    String[] purchaseInput2 = inputProd2.split(" ");//делим через пробел
                    System.out.println(Arrays.toString(purchaseInput2)); // для проверки
                    String nameOfProduct2 = purchaseInput2[0];
                    int quantityInput2 = Integer.parseInt(purchaseInput2[1]);
                    System.out.println(nameOfProduct2 + " "+quantityInput2);
                    sum+=prices[1];
                    System.out.println("купили " + nameOfProduct2+" " +" "+ "итого "+ sum);

                    break;
                case 3:
                    System.out.println("Введите название продукта и количество");
                    System.out.println("test3");
                    String inputProd3=scanner.nextLine(); // второй сканер для получения массива
                    String[] purchaseInput3 = inputProd3.split(" ");//делим через пробел
                    System.out.println(Arrays.toString(purchaseInput3)); // для проверки
                    String nameOfProduct3 = purchaseInput3[0];
                    int quantityInput3 = Integer.parseInt(purchaseInput3[1]);
                    System.out.println(nameOfProduct3 + " "+quantityInput3);
                    sum+=prices[2];
                    System.out.println("купили " + nameOfProduct3+" " +" "+ "итого "+ sum);
                    break;
                case 4:
                    System.out.println("Введите название продукта и количество");
                    System.out.println("test4");
                    String inputProd4=scanner.nextLine(); // второй сканер для получения массива
                    String[] purchaseInput4 = inputProd4.split(" ");//делим через пробел
                    System.out.println(Arrays.toString(purchaseInput4)); // для проверки
                    String nameOfProduct4 = purchaseInput4[0];
                    int quantityInput4 = Integer.parseInt(purchaseInput4[1]);
                    System.out.println(nameOfProduct4 + " "+quantityInput4);
                    sum+=prices[3];
                    System.out.println("купили " + nameOfProduct4+" " +" "+ "итого "+ sum);
                    break;


            }
            System.out.println("testFinish");
        }
    }
}






