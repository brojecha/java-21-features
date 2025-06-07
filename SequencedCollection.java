import java.util.ArrayList;
import java.util.List;

public class SequencedCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        /**
         * Implementing Java 21 features Sequenced Collection
         */
        list.add(10);
        list.addFirst(0);
        list.addLast(20);
        System.out.println(list);

        System.out.println("===============");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println("===============");
        System.out.println(list.removeLast());
    }
}
