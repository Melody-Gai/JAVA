import java.util.ArrayList;
import java.util.List;

public class TestDemo2 {

    public static void main(String[] args) {
        //  ArrayList默认大小为10 ，扩容以1.5倍扩容
        List<String> list = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        list.add("hello");
        list.add("java");
        list.add("99");
        System.out.println(list);
        list.add(1,"moon");
        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        list.add("1");
        list.add("2");

        list.addAll(list1);
        System.out.println(list);

        String s = list.remove(1);
        System.out.println(s);
        System.out.println(list);

        list.remove("java");
        System.out.println(list);

        String s1 = list.get(0);
        System.out.println(s1);
//设置已有元素    修改
        list.set(2,"niuniu");
        System.out.println(list);
        System.out.println(list.contains("niuniu"));
        System.out.println(list.indexOf("99"));
        System.out.println(list.indexOf("90"));
        System.out.println(list.lastIndexOf("99"));
//[)左闭右开的
        List<String> ret = list.subList(1,2);
        //subList不会产生新对象
        System.out.println(ret);
        ret.set(0,"g");
        System.out.println(list);
        System.out.println(ret);
    }

    public static void main1(String[] args) {
        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b);

        Integer c = 150;
        Integer d = 150;
        System.out.println(c == d);
    }
}
