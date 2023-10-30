package org.example;

import java.util.Scanner;

public class Main {
    static boolean continueExecution = true;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        while (continueExecution) {
            //Task roster
            int numberOfTask = taskRoaster();
            switch (numberOfTask) {
                case 1: {
                    //Task1
                    task1();
                    break;
                }
                case 2: {
                    //Task2
                    task2();
                    break;
                }
                case 3: {
                    //Task3
                    task3();
                    break;
                }
                case 4: {
                    //Task4
                    task4();
                    break;
                }
                case 5: {
                    //Task5
                    task5();
                    break;
                }
                case 6: {
                    //Task6
                    task6();
                    break;
                }
                case 7: {
                    //Task7
                    task7();
                }
                case 8: {
                    //Task8
                    task8();
                    break;
                }
                case 9: {
                    //Task9
                    task9();
                    break;
                }
                case 10: {
                    //Task10
                    task10();
                    break;
                }
                case 11: {
                    //Task11
                    task11();
                    break;
                }
                case 12: {
                    //Task12
                    task12();
                    break;
                }
                default:
                    System.out.println("Выберите задание!");
                    break;
            }
            nextTaskQuestion();
        }


    }

    public static int taskRoaster() {
        System.out.print("Выберите задание для проверки: ");
        return scanner.nextInt();
    }

    public static void nextTaskQuestion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Хотите проверить другую задачу?  Да/Нет: ");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("да")) {
            continueExecution = true;
        } else if (choice.equalsIgnoreCase("нет")) {
            scanner.close();
            continueExecution = false;
        }
    }

    public static void task1() {
        //Task 1
        System.out.println("Fall seven times\nand\nstand up eight");

    }

    public static void task2() {
        //Task2
        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();
        int result = firstNumber + secondNumber;
        System.out.println("Сумма чисел: " + result);
        result = firstNumber - secondNumber;
        System.out.println("Разница чисел: " + result);
        result = firstNumber * secondNumber;
        System.out.println("Произведение чисел: " + result);
    }

    public static void task3() {
        //Task3
        System.out.print("Введите четырехзначное число:");
        int numberToReverse = scanner.nextInt();
        StringBuilder builder = new StringBuilder(String.valueOf(numberToReverse));
        builder.reverse();
        System.out.println("Вот твое число наоборот: " + builder);
    }

    public static void task4() {
        //Task4
        System.out.print("Введите время:");
        int time = scanner.nextInt();

        if (time < 6 && time >= 0) {
            System.out.println("Доброй ночи!");
        } else if (time <= 13 && time >= 6) {
            System.out.println("Доброе утро!");
        } else if (time <= 17 && time >= 13) {
            System.out.println("Добрый день!");
        } else if (time <= 23 && time >= 17) {
            System.out.println("Добрый вечер!");
        } else {
            System.out.println("Введите корректныые данные!");
        }
    }

    public static void task5() {
        //Task 5
        //Создание сканера и билдера для обработки числа
        System.out.print("Введите шестизначное число: ");
        int sixSymbolsNumber = scanner.nextInt();
        StringBuilder builder = new StringBuilder(String.valueOf(sixSymbolsNumber));

        //проверка числа на соответствие
        while (builder.length() < 6) {
            System.out.print("Введите ШЕСТИЗНАЧНОЕ число! -> ");
            sixSymbolsNumber = scanner.nextInt();
            builder = new StringBuilder(String.valueOf(sixSymbolsNumber));
        }

        //разделение числа на две половины
        StringBuilder firstHalfOfNumber = new StringBuilder(builder.toString());
        firstHalfOfNumber.delete(3, 6);
        StringBuilder secondHalfOfNumber = new StringBuilder(builder.toString());
        secondHalfOfNumber.delete(0, 3);

        //арифметическое сложение чисел из каждой половны
        int firstHalfSum = 0;
        int secondHalfSum = 0;

        for (int i = 0; i < firstHalfOfNumber.length(); i++) {
            firstHalfSum += firstHalfOfNumber.charAt(i);
            secondHalfSum += secondHalfOfNumber.charAt(i);
        }

        //проверка полученных чисел на равенство
        if (firstHalfSum == secondHalfSum) {
            System.out.println("Введенное число - счастливое!");
        } else System.out.println("В следующий раз повезет!");
    }

    public static void task6() {
        //Task6
        //Ввод с клавиатуры числа от 1 до 100
        System.out.print("Введите число в диапазоне от 0 до 100: ");
        int number = scanner.nextInt();

        //проверка числа на соответствие
        while (number > 100 || number < 0) {
            System.out.print("Введите число в диапазоне от 0 до 100! -> ");
            number = scanner.nextInt();
        }

        //проверки на кратность
        if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else System.out.println("Ваше число не Buzz и не Fizz =( -> " + number);
    }

    public static void task7() {
        //Task7
        //Ввод информации с клавиатуры
        System.out.println("Введите число для рассчета факториала: ");
        int number = scanner.nextInt();
        //Переменная для рассчета
        int factorial = 1;

        //Алгоритм рассчета
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        //Вывод информации в консоль
        System.out.println("Факториал введенного числа " + number + " равен: " + factorial);
    }

    public static void task8() {
        //Task8
        //Ввод с клавиатуры числа от 1 до 100
        System.out.print("Введите число в диапазоне от 0 до 100: ");
        int number = scanner.nextInt();

        //проверка числа на соответствие
        while (number > 100 || number < 0) {
            System.out.print("Введите число в диапазоне от 0 до 100! -> ");
            number = scanner.nextInt();
        }

        //Алгоритм проверки чисел на простоту

        if (isPrimeForTask8(number)) {
            System.out.println("Введенное число - " + number + " принадлежит множеству сложных чисел!");

        } else {
            System.out.println("Введенное число - " + number + " принадлежит множеству простых чисел!");
        }
    }

    public static boolean isPrimeForTask8(int number) {
        if (number <= 1) {
            return true;
        }
        if (number <= 3) {
            return false;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return true;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return true;
            }
        }
        return false;
    }


    public static void task9() {
        //Task9
        //Создание сканера и билдера для обработки числа
        System.out.print("Введите число любой длины: ");
        int number = scanner.nextInt();
        StringBuilder builder = new StringBuilder(String.valueOf(number));

        int sumOfArrNums = 0;
        int averagePiontOfArr;

        //Алгоритм рассчета суммы элементов массива
        for (int i = 0; i < builder.length(); i++) {
            sumOfArrNums += Character.getNumericValue(builder.charAt(i));
        }

        //Алгоритм рассчета среднеарифметического
        averagePiontOfArr = sumOfArrNums / builder.length();

        //Вывод даных в консоль
        System.out.println("Сумма всех элементов массива равна: " + sumOfArrNums);
        System.out.println("Среднее арифметическое значение массива: " + averagePiontOfArr);
        System.out.println("Содержимое массива: " + builder);
    }

    public static void task10() {
        //Task10
        //Создание сканера для обработки числа
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число любой длины: ");
        String number = scanner.nextLine();
        //Создание массива
        int[] numbers = new int[number.length()];

        //Наполнение массива числами из введенной строки
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Character.getNumericValue(number.charAt(i));
        }

        //Дополнительный ввод данных для рассчетного числа
        System.out.print("Введите однозначное число для поиска в массиве: ");
        int numberForEval = scanner.nextInt();

        //Алгоритм поиска значения в массиве
        int count = 0;
        for (int j : numbers) {
            if (numberForEval == j) {
                count++;
            }
        }

        //Вывод информации в консоль
        System.out.println("Введенное число встречается в массиве " + count + " раз!");
    }

    public static void task11() {
        //Task11
        //Ввод данных
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите минимальный порог для рассчёта суммы чисел в диапазоне: ");
        int minVal = scanner.nextInt();
        System.out.print("Введите максимальный порог для рассчёта суммы чисел в диапазоне: ");
        int maxVal = scanner.nextInt();

        //Переменная для хранения результата
        int result;

        //Вызов метода для рассчета
        result = methodFOrTask11(minVal, maxVal);

        //Вывод данных в консоль
        System.out.println("Сумма чисел в указанном диапазоне равна: " + result);
    }

    public static int methodFOrTask11(int min, int max) {
        //Формирование массива чисел с учётом диапазона
        int[] numbers = new int[max];

        //Наполнение массива
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = min++;
        }


        //Алгоритм рассчета суммы чисел
        int sumOfNumbers = 0;
        for (int number : numbers) {
            sumOfNumbers += number;
        }
        return sumOfNumbers;
    }

    public static void task12() {
        //Task12
        //Создание массива
        int[] numbers = new int[10];

        //Наполнение массива начальными значениями 1-10
        for (int i = 1; i <= numbers.length; i++) {
            numbers[i - 1] = i;
            System.out.println("Текущее значение элемента в массиве: " + numbers[i - 1]);
        }

        //Цикл for i, для наполнения массива факториалами
        for (int i = 1; i <= 10; i++) {
            //Переменная для рассчета
            int factorial = 1;

            //Цикл for x, для рассчета факториала
            for (int x = 1; x <= i; x++) {
                factorial = factorial * x;
            }

            //Упаковка нового значения в массив
            numbers[i - 1] = factorial;

            //Вывод данных в консоль
            System.out.println("Новое значение элемента в массиве: " + numbers[i - 1]);
        }
    }
}