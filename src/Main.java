import java.time.LocalDate;

public class Main {
    public static void calculateYear(int year) {
        if (year > 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(+year + " год вискосный");
            } else {
                System.out.println(+year + " год не вискосный");
            }
        } else {
            System.out.println("Такого понятия как високосный год не существовало");
        }
    }

    public static void choiceSystem(int oS, int year) {
        if (oS == 0 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (oS == 1 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (oS == 0 && year >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (oS == 1 && year >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Убедительная просьба! Избавьтесь от несертефицированного китайского девайса");
        }
    }

    public static void calculateDeliveryTime(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1.");
        } else if (20 < deliveryDistance && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2.");
        } else if (60 < deliveryDistance && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3.");
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void main(String[] args) {
        //task1     System.out.println("Task 1");
        calculateYear(2021);
        //task2     System.out.println("Task 2");
        int currentYear = LocalDate.now().getYear();
        choiceSystem(0, currentYear);
        //task3
        System.out.println("Task 3");
        calculateDeliveryTime(95);
    }

}
