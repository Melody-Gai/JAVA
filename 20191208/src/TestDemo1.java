import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person>{
    public String name;
    public int age;
    public Person(String name,int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        if(this.age > o.age) {
            return 1;
        }else if(this.age < o.age) {
            return -1;
        }else{
            return 0;
        }
        //return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class TestDemo1 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("zhangeffi",13));
        list.add(new Person("caocao",53));
        list.add(new Person("guanyu",33));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
