package com.template;

public class Elevator {
    int floor;
    int passengers;
    int minFloor;
    int maxFloor;
    int maxPassengers;

    public Elevator(int minFloor,int maxFloor, int maxPassengers) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.passengers = 0;
        this.maxPassengers = maxPassengers;
    }


    public int moveToFloor(int floorToMove) {
       if (floorToMove >= minFloor && floorToMove <= maxFloor) {
           this.floor = floorToMove;
           return floorToMove;
       }
        return floor;
    }

    public int getCurrentFloor(){
        return floor;
    }
    public int addPassenger() {
        if (passengers < maxPassengers) {
            this.passengers = passengers + 1;
            return passengers;
        }
        return passengers;

    }

    public int getPassengerCount(){
        return passengers;
    }
    public int removePassenger() {
        if (passengers >= 0) {
            this.passengers =  passengers - 1;
            return passengers;
        }
        return passengers;
    }
}
