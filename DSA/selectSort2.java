package DSA;
///advance way of solving selecting sort
/// 
public class selectSort2 {


    static void selectionSort(int[] arr, int i) {
        if (i == arr.length - 1)
            return;

        int min = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[min]) {
                min = j;
            }
        }

        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;

        selectionSort(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selectionSort(arr, 0);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
