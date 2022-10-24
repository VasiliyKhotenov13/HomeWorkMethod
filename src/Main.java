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

    public static void isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Это високосный год!");
        } else {
            System.out.println("Этот год не високосный!");
        }
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
        int year = 2024;
        isLeapYear(year);



    }
}