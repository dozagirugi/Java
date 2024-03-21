package Chapter_5;

public class S_MethodEx2 {

    String say(){
        return "Hi !";
    }

    public static void main(String[] args) {

        S_MethodEx2 whatsup = new S_MethodEx2();

        System.out.println(whatsup.say());

        String a = whatsup.say();
        System.out.println(a);

    }
}
