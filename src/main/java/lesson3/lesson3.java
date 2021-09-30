package lesson3;

import java.util.Arrays;

public class lesson3 {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        array01();

        System.out.println("Задание 2");
        array1_100();

        System.out.println("Задание 3");
        array1_2();

        System.out.println("Задание 4");
        int arr[][] = new int[5][5];
        diagonal(arr);

        System.out.println("Задание 5");
        int arr2[] = initArray(5,8);
        printArray(arr2);

        System.out.println("Задание 6");
        minMax();

    }

    public static void array01(){
        int arr01[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr01.length; i++) {
            if (arr01[i] == 0) {
                arr01[i] = 1;
            } else {
                arr01[i] = 0;
            }
        }
        printArray(arr01);
    }

    public static void array1_100(){
        int arr[] = new int[100];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = i + 1;
        }
        printArray(arr);
    }

    public static void array1_2() {
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<6){
                arr[i] = arr[i] * 2;
            }
        }
        printArray(arr);
    }

    public static void diagonal(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length-i-1]=1;
        }
        printArray(arr);
    }

    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            printArray(arr[i]);
        }
    }

    public static int[] initArray(int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < len ; i++) {
            arr[i]=initialValue;
        }
        return arr;
    }

    public static void minMax(){
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] temp = arr.clone();
        Arrays.sort(temp);
        System.out.println("Минимальное значение: " + temp[0] + "; Максимальное значение - " + temp[temp.length-1]);
        temp = null;
    }

    
}
