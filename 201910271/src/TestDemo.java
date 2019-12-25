/*class Person {
    public String name = "盖盖";
    public int age = 10;

    public static int count = 100;

    public void eat() {
        //int a = 10;
        System.out.println("吃饭");
    }
    public void sleep() {
        System.out.println("睡觉");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void show() {
        System.out.println("name: "+ name +" age: "+age);
    }

}

public class TestDemo {
    public static void main(String[] args) {
        //实例化一个对象   new
        Person person1 = new Person();
        System.out.println(person1.name);
        System.out.println(person1.age);

        System.out.println(Person.count);

       // person1.show();
       // Person person2 = new Person();
        //Person person3 = new Person();
    }
}
*/
public class TestDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,12);
        myArrayList.add(1,3);
        myArrayList.add(2,6);
        myArrayList.add(2,61);
        myArrayList.display();
        myArrayList.add(2,56);
        myArrayList.display();
        myArrayList.add(0,23);
        myArrayList.display();
        myArrayList.remove(6);
        myArrayList.display();

        myArrayList.clear();
        System.out.println("清空");
        myArrayList.display();

    }
}

