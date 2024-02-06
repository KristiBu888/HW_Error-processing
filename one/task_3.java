package hw.one;

import java.util.Arrays;

// Реализуйте метод divArrays, принимающий в качестве аргументов два целочисленных массива a и b,
//  и возвращающий новый массив с, каждый элемент которого равен частному элементов двух входящих 
//  массивов в той же ячейке.
// Если длины массивов не равны - верните нулевой массив длины 1.
// Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - 
// RuntimeException, т.е. ваше.
// Напишите свой код в методе divArrays класса Answer. Метод divArrays принимает на вход два параметра:
// int[] a - первый массив
// int[] b - второй массив
// Пример

// a = new int[]{12, 8, 16};
// b = new int[]{4, 2, 4};

// Вывод: [3, 4, 4]

// a = new int[]{12, 8, 16, 25};
// b = new int[]{4, 2, 4};

// Вывод: [0]

// моё решение

class Answer {
    public int[] divArrays(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length) {
            return new int[1]; // нулевой массив длины 1 будет означать различие в длине массивов
        } else {
            int[] c = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] / b[i];
            }
            return c;
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class task_3 {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[] { 12, 8, 16 };
            b = new int[] { 4, 2, 4 };
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer ans = new Answer();
        String itresume_res = Arrays.toString(ans.divArrays(a, b));
        System.out.println(itresume_res);
    }
}

// решение с инета

// public class task_3 {
// public static void main(String[] args) {
// task_3 task3 = new task_3();
// int[] array1 = new int[] { 12, 8, 16 };
// int[] array2 = new int[] { 4, 2, 4 };
// int[] array3 = task3.getDivArray(array1, array2);
// System.out.println(Arrays.toString(array3));
// }

// public int[] getDivArray(int[] arr1, int[] arr2) {
// int[] divArr = new int[arr1.length];
// int i, j, k;
// i = j = k = 0;
// try {
// while (i < arr1.length) {
// divArr[k] = arr1[i] / arr2[j];
// i++;
// j++;
// k++;
// }
// } catch (RuntimeException e) {
// System.out.println("Different arrays' size or division by zero observed!");
// System.exit(0);
// }
// return divArr;
// }
// }

// решение автотеста

// class Answer {
// public int[] divArrays(int[] a, int[] b){
// if(a == null || b == null || a.length != b.length){
// return new int[1]; // нулевой массив длины 1 будет означать различие в длине
// массивов
// }
// else{
// int[] c = new int[a.length];
// for(int i = 0; i < a.length; i++){
// if (b[i] == 0) throw new RuntimeException("Division by 0");
// else c[i] = a[i] / b[i];
// }
// return c;
// }
// }
// }

// public class task_3{
// public static void main(String[] args) {
// int[] a = {};
// int[] b = {};

// if (args.length == 0) {
// a = new int[]{12, 8, 16};
// b = new int[]{4, 2, 4};
// }
// else{
// a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
// b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
// }

// Answer ans = new Answer();
// String itresume_res = Arrays.toString(ans.divArrays(a, b));
// System.out.println(itresume_res);
// }
// }
