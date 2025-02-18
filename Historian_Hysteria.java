package AdventOfCode;

import java.util.Arrays;

public class Historian_Hysteria {
    public static void main(String[] args) {
        int[] list1={3,4,2,1,3,3};
        int[] list2={4,3,5,3,9,3};
        System.out.println(DistanceofLists(list1,list2));
    }

    static int DistanceofLists(int[] list1,int[] list2){
        Arrays.sort(list1);
        Arrays.sort(list2);
        int sum=0;

        for(int i=0;i<list1.length;i++){
            sum+=Math.max(list2[i],list1[i])-Math.min(list2[i],list1[i]);
        }
        return  sum;

    }


}