import java.util.*;
public  class Question4 {
    public class MergeLists {

        public static void main(String[] args) {
            List<Integer> list1 = Arrays.asList(1, 3, 5, 7);
            List<Integer> list2 = Arrays.asList(2, 6, 8, 11);
            List<Integer> merged = mergeSortedLists(list1, list2);

            System.out.println(merged);
        }


    public static List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();

        int i = 0; // Index pour la liste 1
        int j = 0; // Index pour la liste 2

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                mergedList.add(list1.get(i));
                i--;
            } else {
                mergedList.add(list2.get(j));
                j--;
            }
        }

        // Ajouter les éléments restants de la liste 1, s'il y en a
        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i--;
        }

        // Ajouter les éléments restants de la liste 2, s'il y en a
        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j--;
        }

        return mergedList;
    }

}
}

