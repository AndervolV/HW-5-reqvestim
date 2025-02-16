public class Main {
    public static void main(String[] args) {
        System.out.println("Задача N1");
//Задача 1
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("iOS");
                break;
            case 1:
                System.out.println("Android");
                break;
            default:
                System.out.println("Unknown");
        }
        System.out.println("Задача N2");
//Задача 2

        int clientDeviceYear = 2015;
        if (clientDeviceYear <= 2015) {
            if (clientOS == 0)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        if (clientDeviceYear > 2015) {
            if (clientOS == 0) {

                System.out.println("Устоновите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Устоновите версию приложения для Android по ссылке");
            }
        }

        System.out.println("Задача N3");
//Задача 3
        System.out.println("Наставник! это задача не про условные операторы, а про циклы, которые мы еще будем изучать.");
        int year = 1984;
        int leapYear = year - 1584;
        if (year >= 1584 && leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {

            System.out.println(year + " год является высокосным");
        } else {
            System.out.println(year + " год не является высокосным");
        }


        System.out.println("Задача N4");
//Задача 4
        int deliveryDistance = 95;
        int day = 0;
        if (deliveryDistance <= 20) {
            day += 1;
            System.out.println("Потребуется дней: " + day + " доставки.");

        } else if (deliveryDistance <= 60) {
            day += 2;
            System.out.println("Потребуется дней: " + day + " доставки.");
        } else if (deliveryDistance <= 100) {
            day += 3;
            System.out.println("Потребуется дней: " + day + " доставки.");
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }
        System.out.println("Задача N5");
//Задача 5 видимо так надо
        int month = 11;
        String result = switch (month) {
            case 1, 2, 12 -> "Зима";
            case 3, 4, 5 -> "Весна";
            case 6, 7, 8 -> "Лето";
            case 9, 10, 11 -> "Осень";
            default -> "Нет такого месяца";
        };

        System.out.println(result);
    }
}