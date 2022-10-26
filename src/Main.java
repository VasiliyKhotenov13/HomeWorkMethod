public class Main {

    public static void printSeparator() {
        System.out.println("+++++++++++++++");
        System.out.println("---------------");
    }

    public static void printIssues(int issuesCount) {
        System.out.println(issuesCount);
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static void outputIsLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " - високосный год!");
        } else {
            System.out.println(year + " - год не високосный!");
        }
    }

    public static void currentVersionOS(int clientOS, int clientDeviceYear) {
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке!");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке!");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке!");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке!");
            }
        }
    }

    public static void calculationOfDeliveryTime(int deliveryDistance) {
        int deliveryDate = 1;
        if (deliveryDistance > 20) {
            deliveryDate = deliveryDate + 1;
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryDate = deliveryDate + 1;
            System.out.println("Время доставки составит " + deliveryDate + " дня(ей)!");
        }
    }

    public static void calculationOfDeliveryTime1(int deliveryDistance1) {
        int deliveryDate1 = 1;
        if (deliveryDistance1 >= 20 && deliveryDistance1 < 60) {
            deliveryDate1++;
        } else if (deliveryDistance1 >= 60 && deliveryDistance1 <= 100) {
            deliveryDate1 = deliveryDate1 + 2;
        }
        System.out.println("Время доставки составит " + deliveryDate1 + " день/дня!");
    }

    public static void main(String[] args) {
/*      int[] issuesByMonth = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        printSeparator();
        for (int i = 0; i < issuesByMonth.length; i++) {
            printIssues(issuesByMonth[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator();
            }
        }
        printSeparator();
        int total = sum(issuesByMonth);
        printIssues(total);
*/
        System.out.println("Задание 1");
        int year = 2023;
        outputIsLeapYear(year);

        System.out.println("Задание 2");
        int clientOS = 0;
        int clientDeviceYear = 2013;
        currentVersionOS(clientOS, clientDeviceYear);

        System.out.println("Задание 3");
        int deliveryDistance = 95;
        calculationOfDeliveryTime(deliveryDistance);

        System.out.println("Задание 3 (исправленное)");
        int deliveryDistance1 = 59;
        calculationOfDeliveryTime1(deliveryDistance1);


    }
}