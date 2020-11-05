import java.awt.*;
import java.util.*;
import java.util.List;

public class main {

    public static void main(String[] args) {

        List<String> tmp = new ArrayList();
        tmp.add("CCC");
        tmp.add("DDDD");
        tmp.add("AA");
        tmp.add("B");

        System.out.println(tmp);

        Collections.sort(tmp, new Comparator<String>() {

                    @Override
                    public int compare(String o1, String o2) {
                        return o1.length() - o2.length();
                    }
                }

        );
        System.out.println(tmp);



    }
}
