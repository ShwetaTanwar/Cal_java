package longincrese;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class LIS {
    public static int lengthOfLIS(int[] nums) {
        int[] d = new int[nums.length];
        Arrays.fill(d, 1); 
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<i;j++){
                if(nums[j]<nums[i]){
                    d[i] = Math.max(d[i],d[j]+1);}}}
        int largest = 0; 
        for(int i=0;i<nums.length;i++){
            if(d[i]>largest){
                largest = d[i];}}
       int tmp = largest;
        ArrayList<Integer> subs = new ArrayList<Integer>(nums.length); //Arraylist which prints the longest increasing subsequence
        for (int i = d.length -1;i>=0;i--){
            if (d[i] == tmp){
                subs.add(nums[i]);
                tmp--;}}
         Collections.reverse(subs);
        System.out.println("Longest Increasing Subsequence is: "+subs);
        return largest; }
    public static void main(String args[]){
        Scanner Sc  = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n = Sc.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter elements in array:");
        for (int i=0; i<n;i++){
            nums[i] = Sc.nextInt();}
        int lis  = lengthOfLIS(nums);
        System.out.println("Length of LIS is: "+lis);}}

