package Java_Problem.Inheritance_Interface;

public class Problem_5 {
    public static void main(String[] args) {
        Artist artist = new Artist("뮤지션 김씨");
        Architect architect = new Architect("건축가 이씨");
        Developer developer = new Developer("개발자 최씨");
        Lawyer lawyer = new Lawyer("변호사 박씨");

        artist.friends();
        architect.friends();
        developer.friends();
        lawyer.friends();
    }
}

class Artist {
    String name;

    public Artist(String name) {
        this.name = name;
    }

    public void friends() {
        System.out.printf("%s가 말합니다. 마 친구 아이가", name);
        System.out.println();
    }

}

class Architect extends Artist {
    public Architect(String name) {
        super(name);
    }

}

class Developer extends Artist {

    public Developer(String name) {
        super(name);
    }

}

class Lawyer extends Artist {

    public Lawyer(String name) {
        super(name);
    }

}
