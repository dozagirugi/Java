package Java_Problem.Class;

public class Problem_1 {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();

        c.r=4;
        c.h=5;

        System.out.printf("원기둥의 부피: %.2f", c.getVolume());
        System.out.printf("원기둥의 겉넓이: %.2f", c.getArea());
    }

}

class Cylinder {
    int r ;
    int h;

    double getVolume() {
        return r*r*Math.PI*h;
    }

    double getArea() {
        return 2*r*r*Math.PI + 2*Math.PI*r*h;
    }

}