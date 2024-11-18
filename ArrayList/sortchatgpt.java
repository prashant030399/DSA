import java.util.*;

class Sortchatgpt {

    public List<Integer> sortRows(List<Integer> lists) {
        // Sort the list in place
        Collections.sort(lists);
        // Return the sorted list
        return lists;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(1, 88);  // Inserts 88 at index 1, shifting other elements

        Sort x = new Sort();
        List<Integer> sortResult = x.sortRows(l);  // Sort the list
        System.out.println("Sorted Rows: " + sortResult);
    }
}

