public class example2 {
    private final String firstName;
    private final String lastName;
    private final String socialSecutiryNumber;
    private double grossSales;
    private double commissionRate;
    private double baseSalery;

    public example2(String firstName, String lastName, String socialSecutiryNumber, double grossSales, double commisionRate, double baseSelery) {

        if (grossSales < 0)
        {
            throw new IllegalArgumentException("gross sales must be higher than 0");
        }

        if (commisionRate < 0.0 || commisionRate > 1.0)
        {
            throw new IllegalArgumentException("Commission rate must be > 0 and < 1");
        }

        if (baseSelery < 0.0)
        {
            throw new IllegalArgumentException("Base Salary must be > 0 ");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecutiryNumber = socialSecutiryNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
        this.baseSalery = baseSelery;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecutiryNumber() {
        return socialSecutiryNumber;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0)
        {
            throw new IllegalArgumentException("gross sales must be higher than 0");
        }

        this.grossSales = grossSales;
    }

    public double getCommisionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate < 0.0 || commissionRate > 1.0)
        {
            throw new IllegalArgumentException("Commission rate must be > 0 and < 1");
        }

        this.commissionRate = commissionRate;
    }

    public double getBaseSelery() {
        return baseSalery;
    }

    public void setBaseSelery(double baseSelery) {
        if (baseSelery < 0.0)
        {
            throw new IllegalArgumentException("Base Salary must be > 0 ");
        }

        this.baseSalery = baseSalery;
    }
}
