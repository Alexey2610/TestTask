import java.util.Arrays;

public class Main {
    public static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr);
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                arr[k++] = arr[i];
            }
        }
        return Arrays.copyOf(arr, k);
    }

    public static void main(String[] args) {
        int[] arr = {12, 13, 13,14,15, 14, 16, 17,12,15};

        int[] distinct = removeDuplicates(arr);
        System.out.println(Arrays.toString(distinct));
    }

    }




