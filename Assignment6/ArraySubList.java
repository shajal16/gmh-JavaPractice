package Assignment6;

import java.util.*;

public class ArraySubList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(
                Arrays.asList("Steve", "Justin", "Ajeet", "John", "Arnold", "Chaitanya"));

        List<String> sub = arrayList.subList(1, 4);

        System.out.println("sublist: " + sub);
    }

}
