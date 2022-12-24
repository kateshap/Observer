import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Terminal implements ITerminal{
    private List<Observer> participants = new ArrayList();
    private ArrayList<Data> Data = new ArrayList();
    private double pressure;
    private int temperature;
    private int rotationSpeed;

    public void updateData() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(), 1000, 10000);
    }

    public void notifyOb(){
        this.notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        this.participants.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.participants.remove(o);
    }

    @Override
    public void notifyObservers() {
        participants.forEach(o->o.update(Data));
    }

    class MyTimerTask extends TimerTask {
        public void run() {
            pressure = Math.random()*(6) +1;
            temperature = (int)Math.random()*(600)+100;
            rotationSpeed = (int)Math.random()*(3500) +1000;
            Data.add(new Data(pressure, temperature, rotationSpeed));
            notifyOb();
        }
    }
}