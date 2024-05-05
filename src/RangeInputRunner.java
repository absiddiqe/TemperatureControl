public class RangeInputRunner{
    public static void main(String[] args){
        TemperatureInput inputRunner = new TemperatureInput(10, 70);
        inputRunner.up();
        System.out.println(inputRunner.getCurrentTemperature());
    }
}
