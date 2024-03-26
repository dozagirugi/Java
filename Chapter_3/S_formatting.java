package chapter_3;

public class S_formatting {
    public static void main(String[] args) {
        int i = 3;
        System.out.println(String.format("I need %d apples.", i));

        String name = "KDY";
        int number = 1904;

        System.out.println(String.format("My name is %s and my class number is %d.",name,number)); //변수까지 format 함수 안에 입력하기

        System.out.println(String.format("%10s","kim")); //포매팅하는 변수를 맨 뒤에 두고 그것을 포함한 10자리 출력

        System.out.println(String.format("%-10d doyeon",1904)); //포매팅하는 변수를 맨 앞에 두고 그것을 포함한 10자리 출력

        System.out.println(String.format("%.2f",3.14467865465458979856)); //소수점은 반올림 되어서 출력된다
        System.out.println(String.format("My height is %10.2f",158.4578));
    }
}
