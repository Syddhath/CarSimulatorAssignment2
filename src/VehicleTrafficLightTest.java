import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTrafficLightTest {

    @Test
    void test() {
        VehicleTrafficLight light = new VehicleTrafficLight();
        assertEquals(0, light.getX());
        assertEquals(0, light.getY());

    }
}