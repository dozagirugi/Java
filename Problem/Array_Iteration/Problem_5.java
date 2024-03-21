package Java_Problem.Array_Iteration;

public class Problem_5 {
    public static void main(String[] args) {
        printCombos(10);
    }

    public static void printCombos(int n) {
        int count = 0;

        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
                for(int k=0; k<=n; k++){
                    if(i*j*k==n){
                        System.out.printf("%d * %d * %d = %d\n", i,j,k,n);
                        count++;
                    }
                }
            }
        }
        System.out.printf("%d의 세자리 수 곱의 경우의 수는 %d개이다.",n,count);
    }
}
