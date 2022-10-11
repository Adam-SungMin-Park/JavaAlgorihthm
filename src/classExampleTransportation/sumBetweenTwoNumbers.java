package classExampleTransportation;

public class sumBetweenTwoNumbers {
    public static long solution(int a, int b){
        long sum = 0;

        //3,5 = 3+4+5; // 5,3 = 3+4+5; // 3,3 = 3;
        if(a==b){
            return a;
        }
        else{
            int small = Math.min(a,b);
            int big = Math.max(a,b);
            for(int i = small; i <= big; i++){
                sum+= i;
            }
        }
        System.out.println(sum);
        return sum;
    }
}
