package Chapter_5;

public class S_MethodEx5 {
    void sayDozagirugi(String nickName) {
        if ("오수".equals(nickName)) { // equals는 변수명이 아닌 boolean 함수명이다.
            return;
        }
        System.out.println("나의 별명은 " + nickName + " 입니다.");
    }

    public static void main(String[] args) {
        S_MethodEx5 sample = new S_MethodEx5();
        sample.sayDozagirugi("dozagirugi");
        sample.sayDozagirugi("오수");
        sample.sayDozagirugi("김도레미");
    }
}
