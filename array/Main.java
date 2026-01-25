import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 1, 1, 1, 0};

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLength = 0;

        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0)
                sum -= 1;
            else
                sum += 1;

            if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        System.out.println(maxLength);
    }
}
