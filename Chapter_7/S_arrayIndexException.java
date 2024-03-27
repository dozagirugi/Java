package chapter_7;

public class S_arrayIndexException {
    public static void main(String[] args) {
        int array_a[] = {1,2,3};

        try {
            System.out.println(array_a[3]); // 예외 발생 시 실행 안됨 !
        } catch (Exception e) {
            System.out.println("오류 발생 ! : 배열 범위를 벗어났습니다 !"); // 예외가 발생해야 실행되는 코드
        } finally {
            System.out.println("이거슨 무.적.권 실행되는 코드"); // 무조건 발생하는 코드
        }
        // array_a의 3번째 자리에는 데이터가 없기 때문에 오류가 난다 !

        System.out.println("정 상 종 료");
    }
}
