package MultilevelInheritence;

public class Gym {
    int gymId;

    Gym(int gymId) {
        this.gymId = gymId;
    }
}

class Member extends Gym {
    double monthlyFee;

    Member(int gymId, double monthlyFee) {
        super(gymId);
        this.monthlyFee = monthlyFee;
    }
}

class PremiumMember extends Member {
    double trainerFee;
    double dietFee;

    PremiumMember(int gymId, double monthlyFee,
                  double trainerFee, double dietFee) {
        super(gymId, monthlyFee);
        this.trainerFee = trainerFee;
        this.dietFee = dietFee;
    }

    void totalPayment() {
        double total =
            monthlyFee + trainerFee + dietFee;
        System.out.println("Gym ID: " + gymId);
        System.out.println("Total Monthly Payment: " + total);
    }

    public static void main(String[] args) {
        PremiumMember pm =new PremiumMember(301, 2000, 1500, 1000);
        pm.totalPayment();
    }
}

