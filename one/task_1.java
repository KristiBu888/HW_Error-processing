package hw.one;

// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
// Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
// Метод divisionByZero - Деление на 0
// Метод numberFormatException - Ошибка преобразования строки в число
// Важно: они не должны принимать никаких аргументов
// (т е написать сами причины ошибок).

class Answer {
    public static void arrayOutOfBoundsException() {
        int array[] = new int[2];
        array[5] = 10;
        // Напишите свое решение ниже

    }

    public static void divisionByZero() {
        int num = 5 / 0;
        // Напишите свое решение ниже

    }

    public static void numberFormatException() {
        String myString = "fytjustreyhrw4565thgrstfhytd";
        int i = Integer.parseInt(myString);

        // Напишите свое решение ниже

    }
}

public class task_1 {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}

// решение автотеста

// class Answer {
// public static void arrayOutOfBoundsException() {
// int[] array = new int[10];
// System.out.println(array[11]); // Выход за пределы массива
// }

// public static void divisionByZero() {
// int a = 1;
// int b = 0;
// int c = a / b; // Деление на ноль
// }

// public static void numberFormatException() {
// String str = "abc";
// int num = Integer.parseInt(str); // Ошибка преобразования строки в число
// }
// }

// public class task_1 {
// public static void main(String[] args) {
// Answer ans = new Answer();
// try {
// ans.arrayOutOfBoundsException();
// } catch (ArrayIndexOutOfBoundsException e) {
// System.out.println("Выход за пределы массива");
// }

// try {
// ans.divisionByZero();
// } catch (ArithmeticException e) {
// System.out.println("Деление на ноль");
// }

// try {
// ans.numberFormatException();
// } catch (NumberFormatException e) {
// System.out.println("Ошибка преобразования строки в число");
// }
// }
// }
