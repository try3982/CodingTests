package 문자열;

import java.util.Scanner;

//소금 폭탄 : https://www.acmicpc.net/problem/13223
public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String current = sc.next();
        String drop = sc.next();

        int cHour = (current.charAt(0) - '0') * 10 + current.charAt(1) - '0';
        int cMinute = (current.charAt(3) - '0') * 10 + current.charAt(4) - '0';
        int cSecond = (current.charAt(6) - '0') * 10 + current.charAt(7) - '0';

        int tHour = (drop.charAt(0) - '0') * 10 + drop.charAt(1) - '0';
        int tMinute = (drop.charAt(3) - '0') * 10 + drop.charAt(4) - '0';
        int tSecond = (drop.charAt(6) - '0') * 10 + drop.charAt(7) - '0';

        int cSecondAmount = cHour * 3600 + cMinute * 60 + cSecond;  // current
        int tSecondAmount = tHour * 3600 + tMinute * 60 + tSecond;  // target

        int nSecondAmount = tSecondAmount - cSecondAmount;  // need

        if(nSecondAmount <= 0)
            nSecondAmount += 24 * 3600;

        int h = nSecondAmount / 3600;
        int m = (nSecondAmount % 3600) / 60;
        int s = nSecondAmount % 60;

        String ans = String.format("%02d:%02d:%02d", h, m, s);
        System.out.println(ans);

    }
}
