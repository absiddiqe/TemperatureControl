import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class TemperatureInputTest{
    TemperatureInput personTemperature1, personTemperature2, driverTemperature;

    @BeforeEach
    void setUp(){
        personTemperature1 = new TemperatureInput(20, 60);
        personTemperature2 = new TemperatureInput(0, 40);
        driverTemperature = new TemperatureInput();
    }

    @Test
    void getCurrentTemperatureForPerson1(){
        personTemperature1.up();
        personTemperature1.up();
        personTemperature1.up();
        personTemperature1.down();
        assertEquals(42, personTemperature1.getCurrentTemperature());
        personTemperature1.up();
        personTemperature1.up();
        personTemperature1.up();
        assertEquals(45, personTemperature1.getCurrentTemperature());
    }

    @Test
    void getCurrentTemperatureForPerson2(){
        personTemperature2.up();
        personTemperature2.up();
        personTemperature2.down();
        assertEquals(21, personTemperature2.getCurrentTemperature());
        personTemperature2.down();
        personTemperature2.down();
        personTemperature2.down();
        assertEquals(18, personTemperature2.getCurrentTemperature());
    }

    @Test
    void driverTemperature(){
        driverTemperature.up();
        driverTemperature.up();
        driverTemperature.down();
        driverTemperature.down();
        driverTemperature.down();
        driverTemperature.down();
        assertEquals(58, driverTemperature.getCurrentTemperature());
    }
}