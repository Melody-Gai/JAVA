class Shape {
    public void draw(){

    }
}
class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("♦");
    }
}
class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("⚪");
    }
}
class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("❀");
    }
}

public class TestDemo {
    public static void drawMap(Shape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
        Rect rect = new Rect();
        Cycle cycle = new Cycle();
        Flower flower = new Flower();
        drawMap(rect);
        drawMap(cycle);
        drawMap(flower);
    }
}
