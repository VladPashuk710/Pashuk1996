package homework3;

public class MyTask3 {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {1, 4, 7, 10, 6, 5, 8, 12, 25, 30};
        if (arr1.length != arr2.length) {
            System.out.println(arr1.length > arr2.length ? "Arr_1 longer" : "Arr2_longer");
        } else {
            System.out.println("col_1|col_2\t|sum");
            for (int i = 0; i < arr1.length; i++) {
                int sum = arr1[i] + arr2[i];
                System.out.println(arr1[i] + "\t | \t" + arr2[i] + "\t|\t" + sum);
            }
        }
    }
}