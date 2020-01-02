import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*1、某学校有若干学生（学生对象放在一个List中），
每个学生有一个姓名，班级和考试成绩属性
某次考试结束后，每个学生获得了一个考试成绩，遍历List集合
并把学生对象的属性打印出来*/
class Student{
    public String name;
    public String classes;
    public Double score;

    public Student(String name, String classes, Double score) {
        this.name = name;
        this.classes = classes;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                ", score=" + score +
                '}';
    }
}

/*2、删除第一个字符串当中出现的第二个字符串中的字符
* 例如：
* String str1 = "welcome to java";
* String str2 = "come";
* 输出结果：wl t java*/

public class TestDemo {

    public static List<Character> func(String str1,String str2){
        List<Character> ret = new ArrayList<>();

        for(int i = 0;i < str1.length();i++) {
            char ch = str1.charAt(i);
            if(!str2.contains(ch+"")) {
                ret.add(ch);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        List<Character> list = func("welcome to java","come");
        System.out.println(list);
    }

    public static void main2(String[] args) {
        List<Student> list = new ArrayList<>();
        Student student1 = new Student("盖盖","java 12",13.9);
        Student student2 = new Student("张三","智能1802",14.8);
        Student student3 = new Student("李四","智能1802",16.9);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        System.out.println(list);
        System.out.println("===========");
        for (Student student:list) {
            System.out.println(student);
        }
    }

    public static void main1(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(4);
        list.add(1);
        list.add(8);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}

