package simple;

import java.util.List;
import java.util.stream.Collectors;

public class FilterOnlyInteger {
    //In this kata you will create a function that takes a list of non-negative integers and
    // strings and returns a new list with the strings filtered out.

    public static List<Object> filterList(final List<Object> list) {
        return list.stream()
                .filter(data -> data.getClass() == Integer.class)
                .collect(Collectors.toList());
    }
}
