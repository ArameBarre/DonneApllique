import java.util.*;
public class Question3 {
    public class FrequencyIndexSort {

        static void sortByFrequencyAndIndex(int[] arr) {
            Map<Integer, Integer> frequencyMap = new HashMap<>();

            for (int num : arr) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }

            Arrays.sort(arr, (a, b) -> {
                int freqCompare = Integer.compare(frequencyMap.get(b), frequencyMap.get(a));
                var i = (freqCompare == 0) ? Integer.compare(a, b) : freqCompare;
                return i;
            });
        }

        public static void main(String[] args) {
            int[] array = {1,5,2,0,5,7,4,3,5,2,1,5,8};
            sortByFrequencyAndIndex(array);

            System.out.println(Arrays.toString(array));

        }
    }
}
