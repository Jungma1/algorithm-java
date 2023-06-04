package programmers.one;

import java.util.Arrays;
import java.util.Collections;

/**
 * 1 - 과일 장수
 * https://school.programmers.co.kr/learn/courses/30/lessons/135808
 */
class Ex_135808 {

    public int solution(int k, int m, int[] score) {
        int result = 0;

        Integer[] sortedScore = Arrays.stream(score)
                .boxed()
                .sorted(Collections.reverseOrder())
                .toArray(Integer[]::new);

        for (int i = 0; i < sortedScore.length; i++) {
            if ((i + 1) % m == 0) {
                result += sortedScore[i] * m;
            }
        }

        return result;
    }
}
