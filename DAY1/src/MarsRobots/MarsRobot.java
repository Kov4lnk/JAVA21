package MarsRobots;

public class MarsRobot {
    String status;
    int speed;
    float temperature;

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
        MarsRobot opportunity = new MarsRobot();
        opportunity.status = "diging";
        opportunity.speed = 4;
        opportunity.temperature = -90;

        opportunity.showAttributes();
        opportunity.checkTemperature();
        opportunity.showAttributes();
    }
}
