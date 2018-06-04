

public class example1 extends Object{
    private final String firstName;
    private final String lastName;
    private final String socialSecutiryNumber;
    private double grossSales;
    private double commisionRate;

    //Constructor

    public example1(String fName, String lName, String ssn, double grossSales, double commisionRate)
    {
        //implicit call to the object default constructor

        if (grossSales < 0)
        {
            throw new IllegalArgumentException("gross sales must be higher than 0");
        }

        if (commisionRate < 0.0 || commisionRate > 1.0)
        {
            throw new IllegalArgumentException("Commission rate must be > 0 and < 1");
        }

        this.firstName = fName;
        this.lastName = lName;
        this.socialSecutiryNumber = ssn;
        this.grossSales = grossSales;
        this.commisionRate = commisionRate;
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
        return commisionRate;
    }

    public void setCommisionRate(double commisionRate) {
        if (commisionRate < 0.0 || commisionRate > 1.0)
        {
            throw new IllegalArgumentException("Commission rate must be > 0 and < 1");
        }

        this.commisionRate = commisionRate;
    }
}
