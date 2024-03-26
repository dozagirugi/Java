package chapter_7;

public class S_private {
    private String secret;
    // 보통은 변수들은 private임 (중요 상태등을 함부로 노출하지 않기 때문 !)

    private String name;
    private int age;

    private String getSecret(){
        return this.secret;
    }

    public static void main(String[] args) {
        S_private p = new S_private();
        p.secret = "비밀이야 !";
        System.out.println(p.secret);
    } // java에서 main 메소드는 하나만 존재 가능하다. 따라서 밑에 메인 메소드가 있기 때문에 현재 메소드는 작동하지 않는 것 !

    // alt + insert 'Getter'
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // alt + insert 'Setter'
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// get set 메소드로 private 변수에 접근한다 !

class Sample {

    public static void main(String[] args) {
        S_private s = new S_private();

        s.setName("나는 너무 졸려워");
        s.setAge(26);

        System.out.println(s.getName());
        System.out.println(s.getAge());

        S_default d = new S_default();
        System.out.println(d.last_name);
    }

}
