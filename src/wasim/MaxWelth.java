package wasim;
public class MaxWelth {
    public static void main(String[] args) {
        int[][] accounts = {
            {1,2,3},
            {5,8,45,65},
            {12,54},
        };
        System.out.println("Max welth is "+welth(accounts));

    }

    // I this program we can return row value as well so that people 
    // could understand which person has max welth....
    public static int welth(int[][] acc){
        int max = Integer.MIN_VALUE,sum;
        for(int i=0;i<acc.length;i++){
            sum =0;
            for(int j=0;j<acc[i].length;j++){
                sum+=acc[i][j];
            }
            if(sum>max){
                max = sum;
            }
        }
        return max;
    }
}
