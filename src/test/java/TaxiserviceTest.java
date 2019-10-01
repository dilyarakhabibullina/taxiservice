import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxiserviceTest {

    @Test
    void calculateOrder() {
        Taxiservice service = new Taxiservice();
        int orderSum = service.calculateOrder(5);
        assertEquals(160, orderSum);
    }

    {
        Taxiservice service = new Taxiservice();
        int orderSum = service.calculateOrder(100);
        assertEquals(1960, orderSum);
    }

    {
        Taxiservice service = new Taxiservice();
        int orderSum = service.calculateOrder(90);
        assertEquals(1767, orderSum);
    }

}