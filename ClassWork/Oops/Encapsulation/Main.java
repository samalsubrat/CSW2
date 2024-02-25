package ClassWork.Oops.Encapsulation;

class Player {
    // Private fields encapsulated
    private int age;
    private int bcciSalary;
    private int advertisementIncome;
    
    public int getSalary() {
        return bcciSalary + advertisementIncome;
    }

    public void setBcciSalary(int bcciSalary) {
        this.bcciSalary = bcciSalary;
    }

    public void setAdvertisementIncome(int advertisementIncome) {
        this.advertisementIncome = advertisementIncome;
    }
}

class Tax extends Player {
    public double getTax(double LIC) {
        double tax = super.getSalary() * 0.15;
        if (LIC != 0) {
            tax = tax + LIC;
        }
        return tax;
    }
}

abstract class Players {
    public abstract void battingAverage();
}

class Cricket extends Players {
    public void battingAverage() {
        System.out.println("Batting average is 150");
    }
}

public class Main {
    public static void main(String[] args) {
        Tax rohit = new Tax();
        Cricket Rohit = new Cricket();

        rohit.setBcciSalary(10000);
        rohit.setAdvertisementIncome(250);

        System.out.println("Rohit's total salary is: " + rohit.getSalary());
        System.out.println("The amount of tax Rohit has to pay is: " + rohit.getTax(0));
        System.out.println("The amount of tax Rohit has to pay with Rs 5000 as LIC: " + rohit.getTax(5000));

        Rohit.battingAverage();
    }
}
