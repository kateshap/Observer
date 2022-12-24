public interface ITerminal {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}