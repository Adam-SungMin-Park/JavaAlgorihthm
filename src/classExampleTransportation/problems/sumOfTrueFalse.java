package classExampleTransportation.problems;

public class sumOfTrueFalse {
    public int solution(int[] num, boolean []abs){
        int sum = 0 ;
        for(int i = 0 ; i < num.length; i++){
            if(abs[i]){
                sum+=num[i];
            }else{
                sum-=num[i];
            }
        }
        System.out.println(sum);
        return sum;
    }
}
