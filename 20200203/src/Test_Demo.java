class Person {
    public String name = "盖盖";
    public int age = 10;
    public static int count = 100;
    public void eat() {
        System.out.println("吃饭");
    }
    public void sleep() {
        System.out.println("睡觉");
    }
    public void show() {
        System.out.println("name:" + name +"age:" + age);
    }
}


public class Test_Demo {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(Person.count);
    }
}
