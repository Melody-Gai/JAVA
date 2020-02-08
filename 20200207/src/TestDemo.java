

public class TestDemo {

    public void mystery (int x) {
        System.out.print(x % 10);
        if ((x / 10) != 0){
            mystery(x / 10);
        }
        System.out.print(x % 10);
    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,12);
        myArrayList.add(1,18);
        myArrayList.add(2,15);
        myArrayList.add(3,13);
        myArrayList.add(4,5);
        myArrayList.add(5,2);
        myArrayList.display();
        myArrayList.add(2,2);
        myArrayList.display();
        myArrayList.add(2,52);
        myArrayList.display();
        myArrayList.remove(3);
        myArrayList.display();

        myArrayList.clear();
        System.out.println("清空");
        myArrayList.display();
    }
}
