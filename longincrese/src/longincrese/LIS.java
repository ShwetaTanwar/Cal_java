package longincrese;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LIS {
    /*Function which prints the longest increasing subsequence and also returns the length of increasing subsequence*/
    public static int lengthOfLIS(int[] nums) {
        /*array d which computes length of lis for all elements in nums including that element*/
        int[] d = new int[nums.length];
        Arrays.fill(d, 1); //initialize d with 1 since lis for each element is initially 1

        /*Check is nums[j] is less than nums[i] if yes then compute d[i] as max(d[i],d[j]+1*/
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<i;j++){
                if(nums[j]<nums[i]){
                    d[i] = Math.max(d[i],d[j]+1);
                }
            }
        }
        int largest = 0; //variable used to find the max value in array d
        for(int i=0;i<nums.length;i++){
            if(d[i]>largest){
                largest = d[i];
            }
        }
        int tmp = largest;
        ArrayList<Integer> subs = new ArrayList<Integer>(nums.length); //Arraylist which prints the longest increasing subsequence
        for (int i = d.length -1;i>=0;i--){
            if (d[i] == tmp){
                subs.add(nums[i]);
                tmp--;
            }
        }

        Collections.reverse(subs);
        System.out.println("Longest Increasing Subsequence is: "+subs);
        return largest;
    }
    public static void main(String args[]){
        Scanner Sc  = new Scanner(System.in);

        /*Take array length and elements as input*/
        System.out.println("Enter length of array:");
        int n = Sc.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter elements in array:");
        for (int i=0; i<n;i++){
            nums[i] = Sc.nextInt();
        }

        /*call lengthOfLIS function and print the length of longest common subsequence*/
        int lis  = lengthOfLIS(nums);
        System.out.println("Length of LIS is: "+lis);

    }
}
