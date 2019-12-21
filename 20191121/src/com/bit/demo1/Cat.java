package com.bit.demo1;

public class Cat extends Animal{
    public String color;//子类所独有的数据
    /*static {
        System.out.println("Cat::static{}");
    }
    {
        System.out.println("Cat::instance{}");
    }*/
    public Cat(String name,String color) {
        super (name);
        this.color = color;
       // System.out.println("Cat(String)");
    }
    /*public void eat() {
        System.out.println(this.name + "eat()");
    }*/
    public void func1() {
        System.out.println("func1()");
       /* String name = super.name;
        super.eat();*/
    }
}
class ChineseGardenCat extends Cat {
    public String sex;
    public ChineseGardenCat(String name,String color) {
        super(name,color);
        this.sex = sex;
    }
}
