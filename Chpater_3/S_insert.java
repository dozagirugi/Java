package Chapter_3;

public class S_insert {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append("I Kim Doeyeon");
        sb.insert(1," am");

        System.out.println(sb.toString());
        System.out.println(sb);
    }
}
