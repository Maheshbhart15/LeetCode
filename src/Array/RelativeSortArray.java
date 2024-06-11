package Array;

import java.util.*;

public class RelativeSortArray {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        // Create a map to store the index of each element in arr2
        Map<Integer, Integer> rank = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            rank.put(arr2[i], i);
        }

        // Create a comparator that compares based on the index in arr2
        Comparator<Integer> comparator = (a, b) -> {
            if (rank.containsKey(a) && rank.containsKey(b)) {
                return rank.get(a) - rank.get(b);
            } else if (rank.containsKey(a)) {
                return -1;
            } else if (rank.containsKey(b)) {
                return 1;
            } else {
                return a - b;
            }
        };

        // Convert arr1 to a list and sort it with the custom comparator
        List<Integer> list = new ArrayList<>();
        for (int num : arr1) {
            list.add(num);
        }
        list.sort(comparator);

        // Convert the sorted list back to an array
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = list.get(i);
        }

        return arr1;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};

        int[] result = relativeSortArray(arr1, arr2);

        System.out.println(Arrays.toString(result));
    }
}

