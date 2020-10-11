/**
 * @program: 20201011
 * @description：
 * @author: GAI
 * @create: 2020-10-11 15:28
 **/
public class TestDemo {

    public static void main(String[] args) {

        MyArrayList myArrayList1 = new MyArrayList();
        myArrayList1.add(0,12);
        myArrayList1.add(1,3);
        myArrayList1.add(2,15);
        myArrayList1.add(3,7);
        myArrayList1.display();
        System.out.println(myArrayList1.search(3));
        MyArrayList myArrayList2 = new MyArrayList();

    }

}
