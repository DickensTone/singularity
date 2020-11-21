package addoil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        int []nums = new int[10000 + 2];
        while(testCase-- > 0){
            int n;
            n = input.nextInt();
            int minN = 1000 * 1000 * 1000 + 1, maxN = 0;
            for(int i = 0; i < n; i++){
                nums[i] = input.nextInt();
                if(nums[i] < minN) {
                    minN = nums[i];
                }
                if(nums[i] > maxN){
                    maxN = nums[i];
                }
            }
            int needBlocks = 0;
            for(int i = 0; i < n; i++){
                needBlocks += maxN - nums[i];
            }
            needBlocks += minN - maxN;
            int diff;
            if(minN >= needBlocks){
                diff = minN - needBlocks;
                int extra = diff % (n - 1);
                if(extra != 0){
                    diff = (n - 1) - diff % (n - 1);
                }
            } else{
                diff = needBlocks - minN;
            }

            System.out.println(Math.abs(diff));
        }
        input.close();
    }
}