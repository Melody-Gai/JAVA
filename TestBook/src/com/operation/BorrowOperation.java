package com.operation;

import com.book.Book;
import com.book.BookList;

public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅书籍");
        System.out.println("请输入要借阅的书名：");
        String name = scan.next();
        int i = 0;
        Book book = null;
        //遍历bookList数组
        for(  ;i < bookList.getUsedSize();i++) {
            //bookList.getBook(i).getName().equals(name);
            book = bookList.getBook(i);
            if(book.getName().equals(name)){
                break;
            }
        }
        if(i == bookList.getUsedSize()) {
            System.out.println("没有此书");
            return;
        }
        book = bookList.getBook(i);
        if(book.isBorrowed()) {
            System.out.println("此书已经被借出去了");
        }else {
            book.setBorrowed(true);
            System.out.println("借阅成功");
        }
    }
}
