public class TemperatureInput {
    private int minTemperature, maxTemperature, currentTemperature;

    private void averageTemperature(){
        currentTemperature = (maxTemperature + minTemperature) / 2;
    }

    public TemperatureInput(){
        maxTemperature = 100;
        minTemperature = 20;
        averageTemperature();
    }

    public TemperatureInput(int min, int max){
        maxTemperature = max;
        minTemperature = min;
        averageTemperature();
    }
    public void up(){
        currentTemperature = Math.min(currentTemperature + 1, maxTemperature);
    }
    public void down(){
        currentTemperature = Math.max(currentTemperature - 1, minTemperature);
    }

    public int getCurrentTemperature(){
        return currentTemperature;
    }
}
