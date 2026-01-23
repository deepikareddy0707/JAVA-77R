package MultilevelInheritence;

public class Company {
    int companyId;

    Company(int companyId) {
        this.companyId = companyId;
    }
}

class Project extends Company {
    double projectBudget;

    Project(int companyId, double projectBudget) {
        super(companyId);
        this.projectBudget = projectBudget;
    }
}

class Developer extends Project {
    int hoursWorked;
    double costPerHour;

    Developer(int companyId, double projectBudget,
              int hoursWorked, double costPerHour) {
        super(companyId, projectBudget);
        this.hoursWorked = hoursWorked;
        this.costPerHour = costPerHour;
    }

    void checkBudget() {
        double totalCost = hoursWorked * costPerHour;
        System.out.println("Company ID: " + companyId);
        System.out.println("Project Cost: " + totalCost);

        if (totalCost > projectBudget)
            System.out.println("Budget Exceeded");
        else
            System.out.println("Within Budget");
    }

    public static void main(String[] args) {
        Developer d =
            new Developer(9001, 50000, 120, 500);
        d.checkBudget();
    }
}
