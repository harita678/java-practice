import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayListTest alt = new ArrayListTest();

        alt.createArrayList();
    }

    public void createArrayList(){
      List<Integer> al = new ArrayList<>();
      Integer i1 = 4;
        al.add(i1);
        al.add(3);
        System.out.println(al);
       al.remove(i1);
        System.out.println(al);
    }
}
