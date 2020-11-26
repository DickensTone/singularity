package addoil;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        while (testCase-- > 0) {
            long n = input.nextLong();
            long temp = n;
            List<Long> factors = new ArrayList<>();
            int tot = 0, key = 1;
            for(int i = 2; i < Math.sqrt(n + 1); i++){
                int cnt = 0;
                while(temp%i == 0){
                    factors.add((long) i);
                    temp = temp / i;
                    cnt++;
                }
                if(cnt > tot){
                    tot = cnt;
                    key = i;
                }
            }
            if(temp != 1){
                factors.add(temp);
            }
            if(factors.size() <= 2){
                tot = 1;
                System.out.println(tot);
                System.out.println(n);
            }else {

                System.out.println(tot);

                for (int i = 1; i < tot; i++) {
                    System.out.print(key + " ");
                }
//            System.out.println(9876543210L/3);
//            System.out.println((int)Math.pow(key, tot- 1));
                System.out.println(n / (int) Math.pow(key, tot - 1));
            }
        }

        input.close();
    }
}