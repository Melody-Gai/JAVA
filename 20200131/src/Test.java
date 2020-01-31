import java.util.*;


class Person {

}

public class Test {

    public static void main(String[] args) {
        //int ——》Integer  自动装包/装箱
        Integer a = 10;
        //Integer.valueOf  进行装箱   且是一个静态方法
        System.out.println(a);
        int b = a;//自动拆包
        System.out.println(b);
    }

    public static void main7(String[] args) {
        Person person = new Person();
        System.out.println(person);
        MyArrayList<String> myArrayList = new MyArrayList<>();
        System.out.println(myArrayList);
    }

    public static void main6(String[] args) {

        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("java");
        myArrayList.add("20191207");
        String ret = myArrayList.get();
        System.out.println(ret);

        MyArrayList<Integer> myArrayList2 = new MyArrayList<>();
        myArrayList2.add(1);
        myArrayList2.add(2);
        //Integer ret = myArrayList2.get();
        System.out.println(ret);
    }

    public static void main5(String[] args) {

        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        //int ret = myArrayList.get();
        //System.out.println(ret);
    }

    public static void main4(String[] args) {
        Map<String,String> map = new HashMap<>();
        System.out.println(map.size());
        System.out.println(map.isEmpty());
    }

    public static void main3(String[] args) {
        Collection<String> list = new ArrayList<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add("I");
        list.add("love");
        list.add("you");
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));
        for (String s:list) {
            System.out.println(s);
        }
        list.clear();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }

    public static void main2(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("国民女神","高圆圆");
        map.put("国民老公","王思聪");
        map.put("国民闺女","关晓彤");
        map.put("及时雨","宋江");
        map.put("黑旋风","李逵");
        System.out.println(map);
        String str = map.getOrDefault("及时雨2","小明");
        System.out.println(str);
        System.out.println(map.containsKey("黑旋风1"));

    }

    public static void main1(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Java");
        collection.add("hello");
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());
        System.out.println(collection);
        collection.remove("Java");
        System.out.println(collection);
        collection.add("2019");
        collection.add("2020");
        Object[] strings = collection.toArray();
        System.out.println(Arrays.toString(strings));
        //一个类只要实现Iterable接口，可以用foreach遍历
    }
}