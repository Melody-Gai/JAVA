package com.user;

import com.book.BookList;
import com.operation.IOperation;

import java.util.Scanner;

public abstract class User {
    public String name;
    //IOperation——》实现了这个接口的类都可以存放进去
    public IOperation[] operations;

    //根据用户选项执行操作
    public void doOperation(int choice, BookList bookList) {
        operations[choice].work(bookList);
        //对象
    }
//写一个抽象方法
    public abstract int menu(); {
        System.out.println("====================");
        System.out.println("hello" + this.name + "欢迎来到图书管理系统");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示所有图书");
        System.out.println("5.退出系统");
        System.out.println("====================");
        Scanner scanner = new Scanner(System.in);
        int choice;
    }
}
