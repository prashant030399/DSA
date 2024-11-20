import java.util.ArrayList;
import java.util.List;

 class Problem1chatgpt {

    public List<String> colors(List<String> list) {
        // Create a new ArrayList to store the colors
        List<String> result1 = new ArrayList<>();

        // Add all the elements from the input list to the result1 list
        for (String value : list) {
            result1.add(value);
        }

        return result1;
    }

    public static void main(String[] args) {
        // Create a list and add colors
        List<String> l = new ArrayList<>();
        l.add("red");
        l.add("blue");
        l.add("orange");

        // Create an instance of Problem1 and call the colors method
        Problem1chatgpt x = new Problem1chatgpt();
        List<String> result = x.colors(l);

        // Print the result
        System.out.println("All the colors: " + result);
    }
}
