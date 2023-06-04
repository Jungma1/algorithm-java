package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Ex_1271 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        BigInteger money = new BigInteger(st.nextToken());
        BigInteger count = new BigInteger(st.nextToken());

        sb.append(money.divide(count))
                .append("\n")
                .append(money.remainder(count));

        System.out.println(sb);

        br.close();
    }
}
