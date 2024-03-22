package Chapter_5;

class Cat {
    void sounds() {
        System.out.println("야옹");
    }
}

class HouseCat extends Cat {
    void sounds() {
        System.out.println("먕먕");
    }
}

class RoadCat extends Cat {
    void sounds() {
        System.out.println("냐옹이다옹");
    }
}

public class S_MethodOverriding {

    public static void main(String[] args) {
        HouseCat muha = new HouseCat();
        RoadCat navi = new RoadCat();

        muha.sounds();
        navi.sounds();
    }
}
