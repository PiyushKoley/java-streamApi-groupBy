import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        var list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9,10);
        Map<String, Integer> collect = list.stream()
                .collect(
                        Collectors.groupingBy(
                                integer -> integer % 2 == 0 ? "evenSum" : "oddSum",
                                Collectors.summingInt(Integer::intValue)
                        )
//                        Collectors.partitioningBy(
//                                num -> num%2==0,
//                                Collectors.summingInt(Integer::intValue)
//                        )
                );

        System.out.println(collect);

    }
}
