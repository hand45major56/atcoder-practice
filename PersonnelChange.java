import java.util.*;

public class PersonnelChange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] current = new int[M + 1];
        int[] next = new int[M + 1];

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            current[A]++;
            next[B]++;
        }

        for (int i = 1; i <= M; i++) {
            System.out.println(next[i] - current[i]);
        }

        sc.close();
    }
}
