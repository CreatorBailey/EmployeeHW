package Homework2;

public class Bicycle {
    int Cadence;
    int Gear;
    int Speed;

    public Bicycle(int Cadence, int Gear, int Speed){
        this.Cadence= Cadence;
        this.Gear= Gear;
        this.Speed= Speed;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "Cadence=" + Cadence +
                ", Gear=" + Gear +
                ", Speed=" + Speed +
                '}';
    }
    public void applyBrake(){
        System.out.println(Speed-Gear);
    }
    public void speedUp(){
        System.out.println(Speed+Speed);
    }
}
