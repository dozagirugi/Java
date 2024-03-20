package Chapter_4;

public class S_for {
    public static void main(String[] args) {
        String[] languages = {"Java", "Python", "C"};

        for (int i = 0; i<languages.length; i++) {
            System.out.println("내가 공부하는 언어는 "+languages[i]);

            if (i < languages.length-1) {
                System.out.println("그리고");
            }
        }
    }
}
