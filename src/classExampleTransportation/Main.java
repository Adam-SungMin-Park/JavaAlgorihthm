package classExampleTransportation;

import static java.lang.Math.floor;
import static java.lang.Math.max;

public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        bus1.setRemainingFuel(-95);
        Taxi taxi1 = new Taxi();
        taxi1.setFarePerDistance(2, "Seoul", 100);
        taxi1.pay();
        taxi1.setFarePerDistance(2,"busan",10);
        taxi1.setFuel(-100);
    }
}


class Transportation {
    int currentSpeed = 0;
    int fuelRemaining = 100;
    int number = (int)floor(Math.random()*5000);
    String status;

    public void startDrive() {
        System.out.println(this.getClass().getName() + " is starting");
    }
    public void setCurrentSpeed(int changeSpeed){
        currentSpeed = changeSpeed;
        System.out.println("Speed has changed to : "+ currentSpeed);
    }
    public void setStatus(String status){
        this.status = status;
    }
}

class Bus extends Transportation {

    int maxPassenger = 30;
    int currentPassenger;
    int remainingSeat;
    String status = "drive";
    int fare = 1000;
    int totalFare = 0;

    public int setNumber() {
        this.number = (int) floor(Math.random() * 1000);
        return number;
    }
    public String setRemainingSeat(int passenger){
        this.remainingSeat = maxPassenger-passenger;
        return "Remaining Seats : "+ remainingSeat;
    }
    public String setTotalFare(int passenger){
        this.totalFare = passenger*fare;
        return "Total fare : " + totalFare;
    }
    public void onboarding(int passenger){
        if(passenger > maxPassenger){
            System.out.println("Too many passengers");
        }else{
            System.out.println(passenger + " people onboarded");
            System.out.println(setTotalFare(passenger));
            System.out.println(setRemainingSeat(passenger));
        }
    }

    public int getNumber() {
        return this.number;
    }
    public void setStatus(String status){
        this.status = status;
        if(fuelRemaining <10){
            this.status = "to the garage";
        }
        System.out.println(status);
    }
    public void setRemainingFuel(int fuel){
        fuelRemaining+=fuel;
        System.out.println(fuelRemaining);
        if(fuelRemaining < 10){
            setStatus("to the garage");
        }
    }

}

class Taxi extends Transportation {
    int totalRevenue;
    int maxPassenger = 4;
    int baseFare = 3000;
    int totalFare;
    int farePerDistance = 1000;
    int distance;
    String destination;
    int minDistance = 1;
    String status = "vacant";

    public void setFarePerDistance(int passenger,String destination, int distance) {
        if (passenger > maxPassenger) {
            System.out.println("Too many passenger");
        }
        status = "drive";
        this.destination = destination;
        this.distance = distance;
        totalRevenue += totalFare;
        System.out.println(passenger + " onboarded");
        System.out.println(maxPassenger - passenger + " seats available");
        System.out.println("base fare of : " +baseFare);
        System.out.println("Destination is : "+ destination);
        System.out.println("Distance to the destination : " +distance);

        totalFare = baseFare + (farePerDistance*distance);
        System.out.println("the total fare is : " +totalFare);
        System.out.println("current status : "+ status);
        totalRevenue += totalFare;

    }
    public void pay(){
        setStatus("vacant");
        System.out.println("total fare : "+ totalFare);
    }
    public void setStatus(String status){
        this.status = status;
        System.out.println("current status : "+ status);
    }
    public void setFuel(int fuel){
        fuelRemaining += fuel;
        System.out.println("Remaining Fuel : "+ fuelRemaining);
        if(fuelRemaining ==0 ){
            setStatus("not available");
            System.out.println("Fuel needed");
        }
        System.out.println("total revenue of the day : "+ totalRevenue);
    }

}






