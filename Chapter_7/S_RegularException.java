package chapter_7;

class Fool2Exception extends Exception {
    // 일반 예외를 상속받은 커스텀 예외 클래스
}

public class S_RegularException {
    public void sayNick (String nick) throws Fool2Exception {
        if ("바보".equals(nick)) {
            throw new Fool2Exception(); // 일반 예외는 예외 처리를 해야한다
        }
        System.out.println("당신의 별명은 " + nick + "입니다.");
    }

    public static void main(String[] args) {
        S_RegularException s = new S_RegularException();
        try {
            s.sayNick("바보");
            s.sayNick("멍충이");
        } catch (Fool2Exception e) {
            System.err.println("Fool 예외가 발생했습니다.");
        }

    }
}
