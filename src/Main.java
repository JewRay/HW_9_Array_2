public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void task1() {
        System.out.println("Задача 1");

        int[] expenses = generateRandomArray();

        int expensesPerMonth = 0;

        for (int i = 0; i < expenses.length; i++) {
            expensesPerMonth = expensesPerMonth + expenses[i];
        }
        System.out.println("Сумма трат за месяц составила " + expensesPerMonth + " рублей");
    }

    private static void task2() {
        System.out.println("Задача 2");

        int[] expenses = generateRandomArray();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i < expenses.length; i++) {
            if (expenses[i] < min) {
                min = expenses[i];
            }
            if (expenses[i] > max) {
                max = expenses[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей." + "\nМаксимальная сумма трат за день составила " + max + " рублей");
    }

    private static void task3() {
        System.out.println("Задача 3");

        int[] expenses = generateRandomArray();

        int expensesPerMonth = 0;

        for (int i = 0; i < expenses.length; i++) {
            expensesPerMonth = expensesPerMonth + expenses[i];
        }
        double average = (double) expensesPerMonth / expenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }

    private static void task4() {
        System.out.println("Задача 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
