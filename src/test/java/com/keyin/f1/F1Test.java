package com.keyin.f1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class F1Test {

    @Test
    public void testRecord() {
        f1 f1LapTimesTest = new f1();

        Assertions.assertNull(f1LapTimesTest.getRecord());

        Assertions.assertEquals(1.39, f1LapTimesTest.setRecord(1.39));

        Assertions.assertNotNull(f1LapTimesTest.getRecord());
    }

    @Test
    public void testLapTime(){
        f1 f1LapTimesTest = new f1();

        Assertions.assertEquals(1.70, f1LapTimesTest.setLap(1.70));

        Assertions.assertNotEquals(f1LapTimesTest.getRecord(), f1LapTimesTest.recordGap());

        f1LapTimesTest.setRecord(1.14);

        Assertions.assertTrue(1 > f1LapTimesTest.recordGap());

        Assertions.assertTrue(f1LapTimesTest.isFaster());
    }
}

/*

    //f1 times: new time, time gap to record, print record
    String recordDriver = "VER";
    double recordTime = 1.14;

    String currentDriver;
    double currentTime;

    public Object newTime(String driver, int lapTime){
            if(lapTime < recordTime) {
                recordTime = lapTime;
                recordDriver = driver;
            }
            currentDriver = driver;
            currentTime = lapTime;
        return "New Driver created: " + driver + "Time: " + lapTime;
    }

    public String recordGap(){
        if(recordTime == currentTime){
            return "Times are Equal";
        } else {
            double timeGap = recordTime - currentTime;
            return "Current time is " + timeGap + " seconds slower";
        }
    }

    public String recordString(){
        return "Record Time \nDriver: " + recordDriver + "\nTime: " + recordTime;

    }
 */
