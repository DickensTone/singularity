package addoil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        int[] a = new int[26];
        int[] b = new int[26];
        while (testCase-- > 0) {
            for(int i = 0; i < 26; i++){
                a[i] = b[i] = 0;
            }
            int n, k;
            n = input.nextInt();
            k = input.nextInt();
            String stra = input.next();
            String strb = input.next();
            for(int i = 0; i < n; i++){
                a[stra.charAt(i)-'a']++;
                b[strb.charAt(i)-'a']++;
            }
            String ans = "YES";
            for(int i = 0; i < 26; i++){
                while(a[i] > b[i] && i != 25){
                    a[i] -= k;
                    a[i + 1] += k;
                }
                if(a[i] != b[i]){
                    ans="NO";
                }
            }

                System.out.println(ans);
        }
        input.close();
    }
}