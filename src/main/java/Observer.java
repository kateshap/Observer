import java.util.ArrayList;

public class Observer implements IObserver {
    private String name;

    public Observer(String name, Terminal terminal) {
        this.name = name;
        terminal.registerObserver(this);
    }
    @Override
    public void update(ArrayList<Data> dat) {
        Data d = (Data)dat.get(dat.size()-1);
        System.out.println();
        System.out.println("Значение температуры: "+ d.GetTemperature());
        System.out.println("Зачение давления: " + d.GetPressure());
        System.out.println("Значение скорости вращения: "+ d.GetRotationSpeed());

        if (d.GetTemperature()<360 || d.GetTemperature()>500){
            System.out.println();
            System.out.println("Обозреватель " + name + " заметил опасность! Значение температуры: "+ d.GetTemperature());
        }
        if (d.GetPressure()<4.8 || d.GetPressure()>5.5){
            System.out.println("Обозреватель " + name + " заметил опасность! Значение давления: " + d.GetPressure());
        }
        if (d.GetRotationSpeed()<2999 || d.GetRotationSpeed()>3001){
            System.out.println("Обозреватель " + name + " заметил опасность! Значение скорости вращения: "+ d.GetRotationSpeed());
        }
    }


}
