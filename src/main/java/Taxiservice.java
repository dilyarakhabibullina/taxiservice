public class Taxiservice {
    int distance;

    public int calculateOrder(int distance) {
        int deposit = 60;
        int costPerKm = 20;
        int discountMinOrder = 1000;
        int maxDiscount = 100;
        int discountPercent = 5;
        int orderSum = deposit + (costPerKm * distance);
        int discount = orderSum * discountPercent / 100;
        if (discount > maxDiscount) {
            discount = 100;
        }
        if (orderSum > discountMinOrder) {
            int finalOrder = orderSum - discount;
            return finalOrder;
        } else {
            return orderSum;
        }
    }
}
