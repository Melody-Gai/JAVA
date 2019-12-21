package com.bit.demo1;
//组合示例代码
class Address {
    private String house;
    private int floor;

    public Address(String house,int floor) {
        this.floor = floor;
        this.house = house;
    }
}
class Student {
    public String name;
    public Address address;

    public Student (String name,Address add) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
public class Test {

    public static void function() {

    }
    public  static Animal function1() {
        Cat cat = new Cat("小花"."红")；
        return cat;
    }
    public static void main(String[] args) {
        //Animal animal = new Animal("小花");
        /*Cat cat = new Cat("小花2","红")；
        Animal animal = cat;//向上转型*/
        Animal animal = new Cat("小花2","红");
        //animal func1();   error
    }

    public static void main2(String[] args) {
        Address address = new Address("6#",3);
        Student student = new Student("caocoa",address);
        System.out.println(student);
    }
    public static void main1(String[] args) {
        Cat cat = new Cat("小花","红");
        System.out.println("==========");
        Cat cat2 = new Cat("小花","红");
        System.out.println("==========");
        Bird bird = new Bird("小明","羽毛");
        /*cat.eat();
        Bird bird = new Bird("小明","羽毛");
        bird.eat();
        bird.fly();*/
    }
}
