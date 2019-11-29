package task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        addString(list, "6");
        String b = "9";
        addString(list, b);
        System.out.println(list);

    }
    static void addString(List<Integer> someList, String a){
        someList.add(Integer.parseInt(a));
    }
}
