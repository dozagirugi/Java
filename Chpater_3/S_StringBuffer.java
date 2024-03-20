package Chapter_3;

public class S_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("I'm Kim Doyeon");

        String result = sb.toString();

        System.out.println(result);
        System.out.println(sb.toString());
        System.out.println(sb);

        //문자열을 더하기(+)로 추가 가능
        result = "";
        result += "Oh";
        result += " ";
        result += "I'm so tired";

        System.out.println(result);

    }
}
