import java.time.LocalDate;

public class Main {
    public static void calculateYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(+year + " год вискосный");
        } else {
            System.out.println(+year + " год не вискосный");
        }
    }

    public static void choiceSystem(int oS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (oS == 0) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }

        } else {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }

        }
    }

    public static int calculateDeliveryTime(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (20 < deliveryDistance && deliveryDistance <= 60) {
            return 2;
        } else if (60 < deliveryDistance && deliveryDistance < 100) {
            return 3;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        //task1
        System.out.println("Task 1");
        calculateYear(2021);
        //task2
        System.out.println("Task 2");
        int clientDeviceYear = 2022;
        choiceSystem(0, clientDeviceYear);
        //task3
        System.out.println("Task 3");
        int deliveryDistance = 245;
        int deliveryTime = calculateDeliveryTime(deliveryDistance);
        if (deliveryTime == 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryTime);
        }
    }

}
