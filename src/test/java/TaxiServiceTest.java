import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxiServiceTest {
    @Test
    void calculateOrder() {
        TaxiService service = new TaxiService();
        int orderSum = service.calculateOrder(5);
        assertEquals(160, orderSum);
    }

    @Test
    void calculateOrderWithDiscount() {
        TaxiService service = new TaxiService();
        int orderSum = service.calculateOrder(100);
        assertEquals(1960, orderSum);
    }

    @Test
    void calculateAnotherOrderWithDiscount() {
        TaxiService service = new TaxiService();
        int orderSum = service.calculateOrder(90);
        assertEquals(1767, orderSum);
    }

}