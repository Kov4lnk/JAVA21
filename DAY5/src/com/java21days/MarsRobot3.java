package com.java21days;

public class MarsRobot3 {
    String status;
    int speed;
    float temperature;

    public MarsRobot3(String inStatus, int inSpeed, float inTemperature){
        status = inStatus;
        speed = inSpeed;
        temperature = inTemperature;
    }

    void checkTemperature(){
        if (temperature < -80){
            status = "returning home";
            speed = 5;
        }
    }

    void showAttributes(){
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);
    }

    public static void main(String[] args) {
        MarsRobot3 robotThree = new MarsRobot3("diging", 4, -70);
        robotThree.showAttributes();
        robotThree.checkTemperature();
        robotThree.showAttributes();
    }
}
