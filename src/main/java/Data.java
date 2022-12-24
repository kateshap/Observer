public class Data {
    private double pressure;
    private int temperature;
    private int rotationSpeed;

    public Data(double p,int t,int r){
        this.pressure=p;
        this.temperature=t;
        this.rotationSpeed=r;
    }

    public double GetPressure(){
        return pressure;
    }
    public int GetTemperature(){
        return temperature;
    }
    public int GetRotationSpeed(){
        return rotationSpeed;
    }
}