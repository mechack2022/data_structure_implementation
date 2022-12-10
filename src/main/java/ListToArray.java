import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

// Convert the list to an array
        int[] array = list.stream().mapToInt(i->i).toArray();
//        Object[] array = list.toArray(new int[list.size()]);
        System.out.println(Arrays.toString(array));
// Print the array
//        for (int value : array) {
//            System.out.println(value);
//        }
    }
}
