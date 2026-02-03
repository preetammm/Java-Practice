
package DSA;
import java.util.*;
public class backtraking {

    static void subsets(int[] arr, int index, List<Integer> current) {

        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        current.add(arr[index]);
        subsets(arr, index + 1, current);

        current.remove(current.size() - 1);
        subsets(arr, index + 1, current);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        subsets(arr, 0, new ArrayList<>());
    }
}
