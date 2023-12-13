import java.util.*;

public class Test_1 {
    public static void main(String[] args) {


        ArrayList<List<Integer>> x = new ArrayList<>();
        x.add(Arrays.asList(1,2));
        x.add(Arrays.asList(3,4));
        x.add(Arrays.asList(11,22));
        x.add(Arrays.asList(21,22,23,24));
        System.out.println(x);

        List<Integer> e = new LinkedList<>();
        List<Integer> e1 = new LinkedList<>();

        for (List<Integer> i : x){
            e.add(i.get(0));
            e1.add(i.get(1));
        }
        System.out.println(e);
        System.out.println(e1);

        Map<Integer,Integer> m = new LinkedHashMap<>();
        for (int i = 0 ; i < 4 ; i++){
            m.put(e.get(i), e1.get(i));
        }
        System.out.println(m);
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m);

        for (Integer i : m.values()){
            System.out.print(i + " " );
        }
        m.values().stream().filter(i -> i%22 == 0).forEach(System.out::println);



    }
}
