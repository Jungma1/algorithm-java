package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_1037 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());
        int[] divisors = new int[count];

        int index = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            divisors[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        int max = divisors[0];
        int min = divisors[0];
        for (int divisor : divisors) {
            max = Math.max(divisor, max);
            min = Math.min(divisor, min);
        }

        sb.append(max * min);
        System.out.println(sb);

        br.close();
    }
}
