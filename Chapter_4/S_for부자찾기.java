package Chapter_4;

public class S_for부자찾기 {
    public static void main(String[] args) {
        int[] property = {700,50,1100,99,300};

        for(int i=0; i < property.length; i++) {
            if (property[i] > 100) {
                System.out.println((i+1)+"번째 님은 재산이 100만원이 넘군요 당신은 부자입니다");
            } else {
                System.out.println((i+1)+"번째 님은 재산이 100만원도 안되나요? 당신은 가난뱅이예요");
            }
        }
    }
}
