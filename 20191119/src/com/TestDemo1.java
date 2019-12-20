package com;

interface  IShape {

    void draw();

    class Rect implements IShape {
        @Override
        public void draw() {
            System.out.println("♦");
        }
    }
    class Cycle implements IShape {
        @Override
        public void draw() {
            System.out.println("⚪");
        }
    }
    class Flower implements IShape {
        @Override
        public void draw() {
            System.out.println("❀");
        }
    }
}
public class TestDemo1 {
    public static void drawMap (IShape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
        IShape shape = new IShape.Cycle();
        IShape.Cycle cycle = new IShape.Cycle();
        drawMap(shape);
        drawMap(cycle);
    }
}
