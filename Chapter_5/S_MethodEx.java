package Chapter_5;

public class S_MethodEx {

    int sum(int a, int b) {
        return a + b;
        // 메소드의 입력 변수는 메소드 내에서만 사용됨
    }

    // 이름을 입력 받아 문자열로 리턴하는 메소드
    String name(String name) {
        return "My name is " + name + ".";
    }

    public static void main(String[] args) {
        int alpha = 3;
        int beta = 7;

        S_MethodEx result = new S_MethodEx();

        System.out.println();
        System.out.println(result.sum(100,100));

        System.out.println(result.name(("김도연")));


        }
    }

