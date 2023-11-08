public interface ISubject {
    void registerObserver(IObserver IObserver);
    boolean removeObserver(IObserver IObserver);
    void notifyObservers();
}
