package classExampleTransportation;

import classExampleTransportation.problems.*;

public class Main {
        public static void main(String[] args) {
            waterMelon problem3 = new waterMelon();
            whoCompletedTheRace problem4 = new whoCompletedTheRace();
            evenUpperOddLower problem5 = new evenUpperOddLower();
            flipTheIntegerDigits problem6 = new flipTheIntegerDigits();
            problem7 problem7 = new problem7();
            reverseSortNum problem8 = new reverseSortNum();
            isNumberPerfectSquare problem9 = new isNumberPerfectSquare();
            problem10 problem10 = new problem10();
            problem11 problem11 = new problem11();
            problem12 problem12 = new problem12();
            problem13 problem13 = new problem13();
            problem14 problem14 =new problem14();
            problem15 problem15 = new problem15();
            problem16 problem16 = new problem16();
            problem17 problem17 = new problem17();
            problem18 problem18 = new problem18();
            problem19 problem19 = new problem19();
            problem20 problem20 = new problem20();
            problem21 problem21 = new problem21();
            problem22 problem22 = new problem22();
            problem23 problem23 = new problem23();
            problem24 problem24 = new problem24();
            problem25 problem25 = new problem25();
            problem26 problem26 = new problem26();
            problem27 problem27 = new problem27();
            problem28 problem28 = new problem28();
            problem29 problem29 = new problem29();
            problem30 problem30 = new problem30();
            problem31 problem31 = new problem31();
            averageOfArray problem32 = new averageOfArray();
            countOfPandY problem33 = new countOfPandY();
            stringToNum problem34 = new stringToNum();
            smallestAndLargest problem35 = new smallestAndLargest();
//        jadenCase problem36 = new jadenCase();
//        baseOfTwoConversion problem37 = new baseOfTwoConversion();
            leastSum problem38 = new leastSum();
            sumBetweenTwoNumbers problem39 = new sumBetweenTwoNumbers();
            incrementalNumber problem40 = new incrementalNumber();



// string builder
            //append = O(1)
            // ex: output = output + "2" => O(n)
            // sort = O(n log n)
            // substring O(n)
            //add() O




            problem40.solution(1,100);
//            sumBetweenTwoNumbers.solution(-100,100);
//        leastSum.solution(new int []{1,2,3}, new int[] {5,4,8});
//        baseOfTwoConversion.solution("110010101001");
//        jadenCase.solution("tHis IS an      EXamPle             33asnjdvl");
//        smallestAndLargest.solution("-1 2 3 -4");
//        stringToNum.solution("-11234");
//        countOfPandY.solution("ppPyssYYyyyyy");
//        averageOfArray.solution(new int[] {1,2,3,4});
//        problem31.solution(5, new int[] {2, 1, 2, 6, 2, 4, 3, 3});
//       * problem30.solution(10);
//        problem29.solution(33);
//        problem28.solution(3   ,12);
//        problem27.solution(new int[] {1,3,2,5,4}, 9);
//        problem26.solution(12);
//        problem25.solution(24,27);
//        problem24.solution("...!@Ba____---T#*..y.abcdefghijklm");
//        problem23.solution("z a", 10);
//        problem22.solution("one4seveneight");
//        problem21.solution(new int[]{1,2,3,4,5,6,7,8,9});
//        problem20.solution( "abbabsDDCbEZZcbBsdkjvsd");
//        problem19.solution(new String []{"hello", "adam", "emmanuel"}, 1);
//        problem18.solution(new int[] {1,3,2,4,2});
//        problem17.solution(new int[]{1,1,1,1,1,1}, new int [] {2,2,2,2,2,2});
//        problem16.solution(new int[]{100,5,0,2,7,1,9,12});
//        problem15.solution(125);
//        problem14.solution(new int[]{4,4,4,3,3,1,1,2,3,4,5,1,1,2,3,3,4,4,5,6,7,3,4,1});
//        problem13.solution(new int[][]{{60,50}, {30,70}, {100,100},{80,40}}); // int [][] int arr = {{60,50}, {30,70}, {60,30},{80,40}};
//        problem12.solution(13);
//        problem11.solution(16);//10, 5, 16, 8,4,2,1
//        problem10.solution(new int[]{1,0,0,2,3,99,11});
//        problem9.solution(100);
//        problem8.solution(12395234);
//        problem7.solution(10002346);
//        problem6.solution(1993);
//            problem5.solution("try hello world");
//        problem4.solution(new String[] {"marina", "josipa", "nikola", "vinko", "filipa"},new String[] {"josipa", "filipa", "marina", "nikola"} );
//        problem3.solution(200);
//        whatDayIsit.solution(12, 31);
//        problem2.solution(new int[] {1000,5,6,7,8},5);
        }
    }


//class Transportation {
//    int currentSpeed = 0;
//    int fuelRemaining = 100;
//    int number = (int)floor(Math.random()*5000);
//    String status;
//
//    public void startDrive() {
//        System.out.println(this.getClass().getName() + " is starting");
//    }
//    public void setCurrentSpeed(int changeSpeed){
//        currentSpeed = changeSpeed;
//        System.out.println("Speed has changed to : "+ currentSpeed);
//    }
//    public void setStatus(String status){
//        this.status = status;
//    }
//}
//
//class Bus extends Transportation {
//
//    int maxPassenger = 30;
//    int currentPassenger;
//    int remainingSeat;
//    String status = "drive";
//    int fare = 1000;
//    int totalFare = 0;
//
//    public int setNumber() {
//        this.number = (int) floor(Math.random() * 1000);
//        return number;
//    }
//    public String setRemainingSeat(int passenger){
//        this.remainingSeat = maxPassenger-passenger;
//        return "Remaining Seats : "+ remainingSeat;
//    }
//    public String setTotalFare(int passenger){
//        this.totalFare = passenger*fare;
//        return "Total fare : " + totalFare;
//    }
//    public void onboarding(int passenger){
//        if(passenger > maxPassenger){
//            System.out.println("Too many passengers");
//        }else{
//            System.out.println(passenger + " people onboarded");
//            System.out.println(setTotalFare(passenger));
//            System.out.println(setRemainingSeat(passenger));
//        }
//    }
//
//    public int getNumber() {
//        return this.number;
//    }
//    public void setStatus(String status){
//        this.status = status;
//        if(fuelRemaining <10){
//            this.status = "to the garage";
//        }
//        System.out.println(status);
//    }
//    public void setRemainingFuel(int fuel){
//        fuelRemaining+=fuel;
//        System.out.println(fuelRemaining);
//        if(fuelRemaining < 10){
//            setStatus("to the garage");
//        }
//    }
//
//}
//
//class Taxi extends Transportation {
//    int totalRevenue;
//    int maxPassenger = 4;
//    int baseFare = 3000;
//    int totalFare;
//    int farePerDistance = 1000;
//    int distance;
//    String destination;
//    int minDistance = 1;
//    String status = "vacant";
//
//    public void setFarePerDistance(int passenger,String destination, int distance) {
//        if (passenger > maxPassenger) {
//            System.out.println("Too many passenger");
//        }
//        status = "drive";
//        this.destination = destination;
//        this.distance = distance;
//        totalRevenue += totalFare;
//        System.out.println(passenger + " onboarded");
//        System.out.println(maxPassenger - passenger + " seats available");
//        System.out.println("base fare of : " +baseFare);
//        System.out.println("Destination is : "+ destination);
//        System.out.println("Distance to the destination : " +distance);
//
//        totalFare = baseFare + (farePerDistance*distance);
//        System.out.println("the total fare is : " +totalFare);
//        System.out.println("current status : "+ status);
//        totalRevenue += totalFare;
//
//    }
//    public void pay(){
//        setStatus("vacant");
//        System.out.println("total fare : "+ totalFare);
//    }
//    public void setStatus(String status){
//        this.status = status;
//        System.out.println("current status : "+ status);
//    }
//    public void setFuel(int fuel){
//        fuelRemaining += fuel;
//        System.out.println("Remaining Fuel : "+ fuelRemaining);
//        if(fuelRemaining ==0 ){
//            setStatus("not available");
//            System.out.println("Fuel needed");
//        }
//        System.out.println("total revenue of the day : "+ totalRevenue);
//    }
//
//}






