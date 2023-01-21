package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;



    public Vehicle(String name)
    {
       this.name=name;
       this.currentSpeed=0;
       this.currentDirection=0;
    }

    public void move(int speed,int direction)
    {
        currentSpeed=speed;
        currentDirection=direction;
        System.out.println("Speed Changed to:"+currentSpeed+ ",and the direction is changed to:" +currentDirection+ " degrees");
    }

    public void steer(int direction)
    {
        currentDirection+=direction;
        System.out.println("The direction change :" + currentDirection + " degrees");
    }

    public void stop(){
        //direction is in degrees, add it to the current direction
        currentSpeed=0;
        System.out.println("The Vehicle Stopped");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
}
