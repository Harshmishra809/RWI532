import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_Interface {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Harsh");

        Consumer<List<Integer>> listConsumer1 = li -> {
            for (Integer i : li) {
                System.out.println(i + 100);
            }
        };
        listConsumer1.accept(Arrays.asList(1,2,3,4));

        Consumer<List<Integer>> listCosumer2 = li -> {
            for(Integer i:li){
                System.out.println(i);
            }
        };
      Consumer<List<Integer>> listConsumer =listCosumer2.andThen(listConsumer1);
listConsumer.accept(Arrays.asList(10,20,30,40));
    }
}