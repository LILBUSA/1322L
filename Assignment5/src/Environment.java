public class Environment {
    private int currentTemp;

    public Environment(int currentTemp) {
        setCurrentTemp(currentTemp);
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(int currentTemp) {
        this.currentTemp = currentTemp;
    }
}
