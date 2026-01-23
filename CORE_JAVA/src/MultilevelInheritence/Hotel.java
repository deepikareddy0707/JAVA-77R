package MultilevelInheritence;

public class Hotel {
    int hotelId;

    Hotel(int hotelId) {
        this.hotelId = hotelId;
    }
}

class Room extends Hotel {
    int days;
    double roomRentPerDay;

    Room(int hotelId, int days, double roomRentPerDay) {
        super(hotelId);
        this.days = days;
        this.roomRentPerDay = roomRentPerDay;
    }
}

class LuxuryRoom extends Room {
    double serviceCharge;
    double foodCharge;

    LuxuryRoom(int hotelId, int days, double roomRentPerDay,
               double serviceCharge, double foodCharge) {
        super(hotelId, days, roomRentPerDay);
        this.serviceCharge = serviceCharge;
        this.foodCharge = foodCharge;
    }

    void calculateBill() {
        double totalBill =
            (days * roomRentPerDay) + serviceCharge + foodCharge;
        System.out.println("Hotel ID: " + hotelId);
        System.out.println("Final Bill: " + totalBill);
    }

    public static void main(String[] args) {
        LuxuryRoom lr =
            new LuxuryRoom(101, 3, 2000, 1500, 2000);
        lr.calculateBill();
    }
}
