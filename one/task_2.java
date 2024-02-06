package hw.one;

import java.util.Arrays;

/**
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных
 * массива,
 * и возвращающий новый массив, каждый элемент которого равен разности элементов
 * двух входящих
 * массивов в той же ячейке. Если длины массивов не равны, необходимо как-то
 * оповестить пользователя.
 */
public class task_2 {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        task_2 task2 = new task_2();
        int[] array1 = new int[] { 5, 4, 3 };
        int[] array2 = new int[] { 2, 1, 0 };
        int[] array3 = task2.getDifArray(array1, array2);
        System.out.println(Arrays.toString(array3));
    }

    public int[] getDifArray(int[] arr1, int[] arr2) throws ArrayIndexOutOfBoundsException {
        if (arr1.length != arr2.length) {
            throw new ArrayIndexOutOfBoundsException("Both arrays need to be of the same length!");
        }
        int[] difArr = new int[arr1.length];
        int i, j, k;
        i = j = k = 0;
        while (i < arr1.length) {
            difArr[k] = arr1[i] - arr2[j];
            i++;
            j++;
            k++;
        }
        return difArr;
    }
}

// решение автотеста

// import java.util.Arrays;

// class Answer {
// public int[] subArrays(int[] a, int[] b){
// if(a == null || b == null || a.length != b.length){
// return new int[1]; // нулевой массив длины 1 будет означать различие в длине
// массивов
// }
// else{
// int[] c = new int[a.length];
// for(int i = 0; i < a.length; i++){
// c[i] = a[i] - b[i];
// }
// return c;
// }
// }
// }

// public class task_2{
// public static void main(String[] args) {
// int[] a = {};
// int[] b = {};

// if (args.length == 0) {
// a = new int[]{4, 5, 6};
// b = new int[]{1, 2, 3};
// }
// else{
// a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
// b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
// }

// Answer ans = new Answer();
// String itresume_res = Arrays.toString(ans.subArrays(a, b));
// System.out.println(itresume_res);
// }
// }