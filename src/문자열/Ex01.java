package 문자열;

import java.util.Scanner;
// 대소문자 바꾸기
public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ans = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if ('a' <= ans[i] && ans[i] <= 'z')
                ans[i] = (char)('A' + ans[i] - 'a');
            else ans[i] = (char)('a' + ans[i] - 'A');
        }
        System.out.println(ans);
        }

}
