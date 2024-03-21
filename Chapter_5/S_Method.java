package Chapter_5;

class City{
    String name;

    public void set_KR_Name(String name) { // public: 공용 | void: 리턴 값이 없다 | setName: 메소드 이름
        this.name = name;
    }
}

public class S_Method {
    public static void main(String[] args) {
        City Busan = new City();
        Busan.set_KR_Name("부산");
        // 메소드 호출

        City Geoje = new City();
        Geoje.set_KR_Name("거제");

        System.out.println(Busan.name);
    }
}
