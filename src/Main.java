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
//Задача 2 Чтобы не плодить переменные переменная clientOS взята из первой задачи
        int clientOs = 1;
        int clientDeviceYear = 2015;
        if (clientDeviceYear <= 2015) {
            if (clientOs == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (clientDeviceYear > 2015) {
            if (clientOS == 0) {
                System.out.println("Устоновите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Устоновите версию приложения для Android по ссылке");
            }
        }
        System.out.println("Задача N3");
//Задача 3
        System.out.println("Наставник! это задача не про условные операторы, а про циклы, которые мы еще будем изучать.");
        int leapYear = 2014;
        if (leapYear >= 1584 && leapYear <= 2100) {
            if (leapYear % 4 == 0 || leapYear % 400 == 0 && leapYear % 100 != 0) {
                System.out.println(leapYear + " год является высокосным");
            } else {
                System.out.println(leapYear + " год не является высокосным");
            }
        } else {
            System.out.println("В это время не было перехода на высокосный год");
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
//Задача 5
        int month = 11;
        switch (month) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Нет такого месяца");
        }

    }
}