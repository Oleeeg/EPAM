package HWSecondClass;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        int[] array = new int[1000000];
        for (int i = 0; i < array.length ; i++) {
            array[i] = (int)(Math.random()*1000000);
        }
        System.out.println("Choose a sorting method:");
        System.out.println("1 - Bubble sort");
        System.out.println("2 - Insertion sort");
        System.out.println("3 - Quick sort");
        System.out.println("4 - Selection sort");
        System.out.println("5 - Shell sort");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your answer : ");
        String method = in.nextLine();

        long start = System.currentTimeMillis();

        switch (method) {
            case "1": {
                BubbleSort.bubbleSort(array);
                System.out.print("Bubble sort took ");
                break;
            }
            case "2": {
                InsertionSort.insertionSort(array);
                System.out.print("Insertion sort took ");
                break;
            }
            case "3": {
                QuickSort.quickSort(array, 0, array.length-1);
                System.out.print("Quick sort took ");
                break;
            }
            case "4": {
                SelectionSort.selectionSort(array);
                System.out.print("Selection sort took ");
                break;
            }
            case "5": {
                ShellSort.shellSort(array);
                System.out.print("Shell sort took ");
                break;
            }
            default:
                System.out.print("You have chosen impossible option");
        }

        long end = System.currentTimeMillis();

        System.out.println((end-start)+ " ms to accomplish.");

        System.out.print("\nEnter a number which factorial you would like to find (n>16) : ");
        int number = in.nextInt();
        System.out.println(number+"! = " +Factorial.bigFactorial(number));
    }
}
