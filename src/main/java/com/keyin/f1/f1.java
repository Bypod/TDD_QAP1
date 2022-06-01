package com.keyin.f1;

public class f1 {

    double recordTime;
    double currentTime;

    public double setRecord(double time){
        recordTime = time;
        System.out.println("Record Time Set: " + recordTime);
        return recordTime;
    }

    public double setLap(double time){
        currentTime = time;
        System.out.println("New Lap Time Set: " + time);
        return currentTime;
    }

    public Object getRecord(){
        if(recordTime == 0.0){
            System.out.println("Record Time: " + recordTime);
            return null;
        } else {
            System.out.println("Record Time: " + recordTime);
            return recordTime;
        }
    }

    public double getCurrent(){
        System.out.println("Current Lap Time: " + currentTime);
        return currentTime;
    }

    public double recordGap(){
        double gap = currentTime - recordTime;
        System.out.println("Gap to record: " + String.format("%.2f", gap));
        return gap;
    }

    public boolean isFaster(){
        if(currentTime > recordTime){
            System.out.println("New Time is faster then record... Use setRecord() to set new record");
        } else {
            System.out.println("New Time is slower then record");

        }
        return currentTime > recordTime;
    }
}
