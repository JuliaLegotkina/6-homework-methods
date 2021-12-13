package ru.skypro;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        printIsYearLeap(1989);

        printRecommendApplicationVersion(1, 2010);

        System.out.println("Скорость доставки в днях: " + calculateDeliveryDays(95));

        findAndPrintDuplicatesIfAny("aabccddefgghiijjkk");

        int[] arr = new int[]{3, 2, 1, 6, 5};
        reverseArray(arr);
        System.out.println("Числа в обратном порядке: " + Arrays.toString(arr));
    }

    public static void printIsYearLeap(int year) {
        boolean yearIsLeap = isYearLeap(year);
        printIsYearLeapResult(year, yearIsLeap);
    }

    public static boolean isYearLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printIsYearLeapResult(int year, boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.println(year + " год — високосный");
        } else {
            System.out.println(year + " год — невисокосный");
        }
    }

    public static void printRecommendApplicationVersion(int clientOS, int productionYear) {
        int currentYear = LocalDate.now().getYear();
        if (productionYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для " + (clientOS == 0 ? "iOS" : "Android") + " по ссылке.");
        } else {
            System.out.println("Установите приложение для " + (clientOS == 0 ? "iOS" : "Android") + " по ссылке.");
        }
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        int result = 1;
        if (deliveryDistance > 20) {
            result++;
        }
        if (deliveryDistance > 60) {
            result++;
        }
        return result;
    }

    public static void findAndPrintDuplicatesIfAny(String text) {
        char[] letters = text.toCharArray();
        char prevChar = Character.MAX_VALUE;
        for (char letter : letters) {
            if (letter == prevChar) {
                System.out.println("Найден дубль символа " + letter);
                return;
            }
            prevChar = letter;
        }
        System.out.println("Дублей не найдено");
    }

    public static void reverseArray(int[] arr) {
        int head = 0;
        int tail = arr.length - 1;
        while (head < tail) {
            int temp = arr[head];
            arr[head++] = arr [tail];
            arr[tail--] = temp;
        }
    }
}

