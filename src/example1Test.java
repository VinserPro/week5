public class example1Test {
    public static void main(String[] args) {
        example1 employee = new example1("Artem", "Pryadko", "213413123", 10000, 0.12);

        System.out.printf("Employee %nFirst Name: %s%nLast Name: %s%nSSN: %s%nGross Sales: $%f%nCommission Rate: %f%n", employee.getFirstName(), employee.getLastName(), employee.getSocialSecutiryNumber(), employee.getGrossSales(), employee.getCommisionRate());

        employee.setCommisionRate(0.1);
        employee.setGrossSales(20000);

        System.out.printf("Employee %nFirst Name: %s%nLast Name: %s%nSSN: %s%nGross Sales: $%f%nCommission Rate: %f%n", employee.getFirstName(), employee.getLastName(), employee.getSocialSecutiryNumber(), employee.getGrossSales(), employee.getCommisionRate());

    }
}
