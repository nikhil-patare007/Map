import java.util.TreeMap;


    public class NavigableMapDemo {
        public static void main(String[] args) {
            TreeMap ts =new TreeMap();
            for (int i = 0; i <10 ; i++) {
                ts.put(i,i+1);

            }
            System.out.println(ts);
            System.out.println(ts.ceilingEntry(3));
            System.out.println(ts.lowerEntry(3));
            System.out.println(ts.floorEntry(3));
            System.out.println(ts.higherEntry(3));
            System.out.println(ts.pollFirstEntry());
            System.out.println(ts.pollLastEntry());
            System.out.println(ts.descendingMap());
            System.out.println(ts);
        }
    }

