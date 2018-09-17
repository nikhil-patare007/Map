import java.util.TreeSet;

public class NavigableSetDemo {
    public static void main(String[] args) {
        TreeSet ts =new TreeSet();
        for (int i = 0; i <10 ; i++) {
            ts.add(i);

        }
        System.out.println(ts.lower(3));
        System.out.println(ts.floor(3));
        System.out.println(ts.higher(3));
        System.out.println(ts.pollFirst());
        System.out.println(ts.pollLast());
        System.out.println(ts.descendingSet());
        System.out.println(ts);
    }
}
