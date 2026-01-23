package MultilevelInheritence;


public class Railway {
    int trainNo;

    Railway(int trainNo) {
        this.trainNo = trainNo;
    }
}

class Ticket extends Railway {
    double baseFare;
    int distanceKm;
    double rate;

    Ticket(int trainNo, double baseFare, int distanceKm, double rate) {
        super(trainNo);
        this.baseFare = baseFare;
        this.distanceKm = distanceKm;
        this.rate = rate;
    }
}

class SleeperTicket extends Ticket {
    double sleeperCharge;

    SleeperTicket(int trainNo, double baseFare, int distanceKm,
                  double rate, double sleeperCharge) {
        super(trainNo, baseFare, distanceKm, rate);
        this.sleeperCharge = sleeperCharge;
    }

    void calculateFare() {
        double totalFare = baseFare + (distanceKm * rate) + sleeperCharge;
        System.out.println("Train No: " + trainNo);
        System.out.println("Total Fare: " + totalFare);
    }

    public static void main(String[] args) {
        SleeperTicket st =
            new SleeperTicket(12345, 200, 300, 1.5, 150);
        st.calculateFare();
    }
}
