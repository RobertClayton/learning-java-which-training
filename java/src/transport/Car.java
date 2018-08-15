package transport;

public class Car {
    // instance variables
    private int speed;
    private int gear;

    public Car(int speed) {
        setSpeed(speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 150) {
            throw new IllegalArgumentException("Speed is to high");
        }

        setGear(speed);
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int speed) {
        if (((speed/12) == 0) && (speed != 0)) {
            this.gear = 1;
        } else {
            this.gear = (speed/12) + 1;
        }
    }

    public void applyBrake(int decrement) {
        speed = decrement > speed ? 0 : speed - decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}
