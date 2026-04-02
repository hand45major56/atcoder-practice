import java.util.*;

/*
問題名:
ABC450 B - Split Ticketing

問題:
N個の駅 1,2,...,N がある。
駅 i から駅 j (1 <= i < j <= N) までの運賃は C[i][j]。

3つの整数 a, b, c (1 <= a < b < c <= N) が存在して、
C[a][b] + C[b][c] < C[a][c]
となるか判定せよ。

存在するなら Yes、存在しないなら No を出力せよ。

入力:
N
C1,2 C1,3 ... C1,N
C2,3 ... C2,N
...
C(N-1),N

出力:
Yes または No
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[][] cost = new long[N + 1][N + 1];

        for (int i = 1; i <= N - 1; i++) {
            for (int j = i + 1; j <= N; j++) {
                cost[i][j] = sc.nextLong();
            }
        }

        for (int a = 1; a <= N; a++) {
            for (int b = a + 1; b <= N; b++) {
                for (int c = b + 1; c <= N; c++) {
                    if (cost[a][b] + cost[b][c] < cost[a][c]) {
                        System.out.println("Yes");
                        return;
                    }
                }
            }
        }

        System.out.println("No");
    }
}
