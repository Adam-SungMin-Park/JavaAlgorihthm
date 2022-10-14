package classExampleTransportation.problems;

public class averageOfArray {
    public static double solution(int [] nums){
        double answer = 0 ;
        double sum =0 ;
        for (int num : nums) {
            sum += num;
        }
        System.out.println(sum/nums.length);
        double avg = sum / nums.length;

        return avg;
    }
}
