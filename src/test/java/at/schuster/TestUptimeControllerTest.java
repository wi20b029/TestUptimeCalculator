package at.schuster;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUptimeControllerTest {

    @Test
    public void test_calculateUptime_shouldBeCalulatedCorrectly(){

        // Arrange // 1. Test ohne Eingabe in controller über die API
        TestUptimeController controller = new TestUptimeController();

        // Act
        String actualValue = controller.calculateUptime(99.95);
        // Assert
        //Assertions.assertEquals(String.format("%.2f", 43178.40), actualValue);
        Assertions.assertEquals("43178,40", actualValue);

    }


}

