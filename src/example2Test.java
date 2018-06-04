public class example2Test {
        public static void main(String[] args) {
            example2 employee = new example2("Artem", "Pryadko", "213413123", 10000, 0.12, 2000);

            System.out.printf("Employee %nFirst Name: %s%nLast Name: %s%nSSN: %s%nGross Sales: $%f%nCommission Rate: %f%nBase Salary: %f%n", employee.getFirstName(), employee.getLastName(), employee.getSocialSecutiryNumber(), employee.getGrossSales(), employee.getCommisionRate(), employee.getBaseSelery());

            employee.setCommissionRate(0.1);
            employee.setGrossSales(20000);

            System.out.printf("Employee %nFirst Name: %s%nLast Name: %s%nSSN: %s%nGross Sales: $%f%nCommission Rate: %f%nBase Salary: %f%n", employee.getFirstName(), employee.getLastName(), employee.getSocialSecutiryNumber(), employee.getGrossSales(), employee.getCommisionRate(), employee.getBaseSelery());

        }
    }

