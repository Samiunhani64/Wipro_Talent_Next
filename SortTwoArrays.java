import java.util.ArrayList;
import java.util.List;

class ArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList to hold String elements
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);


        list2.add(11);
        list2.add(22);
        list2.add(33);

        // Remove an element
        // list.remove("Banana");
        // System.out.println("After removing Banana: " + list);

        // // Check if the ArrayList contains an element
        // boolean containsCherry = list.contains("Cherry");
        // System.out.println("Contains Cherry? " + containsCherry);

        // Get the size of the ArrayList
        int size1 = list1.size();
        int size2 = list2.size();

        ArrayList<Integer> mergedList = new ArrayList<>(size1 + size2);
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        System.out.println("Merged List: " + mergedList);
        
    }
}
