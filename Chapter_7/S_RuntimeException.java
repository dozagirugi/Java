package chapter_7;

class FoolException extends RuntimeException {
    // 런타임 예외를 상속받은 커스텀 예외 클래스
    // 런타임 예외는 미리 처리하지 않아도 됨
}

public class S_RuntimeException {

    public void sayNick (String nick) {
        if ("바보".equals(nick)) {
            throw new FoolException();
        }
        System.out.println("당신의 별명은 " + nick + "입니다.");
    }

    public static void main(String[] args) {
        S_RuntimeException s = new S_RuntimeException();
        try {
            s.sayNick("바보");
            s.sayNick("멍충이");
        } catch (FoolException e) {
            System.err.println("Fool 예외가 발생했습니다.");
        }

    }
}
