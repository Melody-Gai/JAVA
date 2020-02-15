public class TestDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,12);
        myArrayList.add(1,3);
        myArrayList.add(2,6);
        myArrayList.add(2,4);
        myArrayList.display();
        myArrayList.add(2,45);
        myArrayList.display();
        myArrayList.add(0,33);
        myArrayList.display();
        myArrayList.remove(6);
        myArrayList.display();

        myArrayList.clear();
        System.out.println("清空");
        myArrayList.display();
    }
}













