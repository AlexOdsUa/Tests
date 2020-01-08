import java.util.Scanner;

public class KondrashovAQA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Составить алгоритм: если введенное число больше 7, то вывести “Привет”
        System.out.println("Enter digit:");
        numberMoreThan7(scanner.nextInt());

        //Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
        System.out.println("\nEnter name:");
        trueName(scanner.next());

        //Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
        System.out.println("\nEnter size of the array: ");
        arrayMultiple3(scanner.nextInt());


    }

    static void numberMoreThan7(int a) {

        if (a > 7) {
            System.out.println("Привет");
        } else {
            System.out.println();
        }
    }

    static void trueName(String str) {

        if (str.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    static void arrayMultiple3(int volArray) {

        int[] array = new int[volArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Our Array is: ");

        for (Integer inte : array) {
            System.out.print(inte + ", ");
        }
        System.out.println("\n\n");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i] + " true");
            } else {
                System.out.println(array[i] + " false");
            }
        }

    }


}
