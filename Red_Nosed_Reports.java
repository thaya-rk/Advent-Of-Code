package AdventOfCode;

public class Red_Nosed_Reports {
    public static void main(String[] args) {
        int[][] matrix={{7,6,4,2,1},
                        {1,2,7,8,9},
                        {9,7,6,2,1},
                        {1,3,2,4,5},
                        {1,3,6,7,9}};

        int result=countSafe(matrix);
        System.out.println(result);
    }
    static boolean safeNum(int[] row){
        boolean StrictlyIncreasing=true;
        boolean StrictlyDecreasing=true;

        for(int i=1;i<row.length;i++){   //Approach:Checking whether Strictly increasing or decreasing
                if(row[i]<row[i-1]){
                    StrictlyIncreasing=false;
                }
                if(row[i]>row[i-1]){
                    StrictlyDecreasing=false;
            }
        }
        return StrictlyIncreasing || StrictlyDecreasing;
    }
    static int countSafe(int[][] matrix){
        int count=0; //Count total safe
        for (int[] row : matrix) {
            if (safeNum(row)) {
                count++;
            }
        }
        return count;
    }


}

//        7 6 4 2 1
//        1 2 7 8 9
//        9 7 6 2 1
//        1 3 2 4 5
//        8 6 4 4 1
//        1 3 6 7 9
