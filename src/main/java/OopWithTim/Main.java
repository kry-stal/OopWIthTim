package OopWithTim;

public class Main {
    public static void main(String[] args) {
//        BankAccount WES2 = new BankAccount();
//        WES2.setCustomerName("WES GIBBINS");
//        WES2.setAccountBalance(8900L);
//        WES2.setAccountNumber(1234567L);
//        WES2.setEmailAddress("wesgib@gmail.com");
//        WES2.setPhoneNumber("(+234)80-8957-0213");
//        WES2.withdrawFunds();
//        System.out.println();
//        WES2.depositFunds();
//
//        System.out.println();
//
//        BankAccount bankAccountTara = new BankAccount();
//        bankAccountTara.setCustomerName("TARA GILBERT");
//        bankAccountTara.setAccountNumber(12345678L);
//        bankAccountTara.setAccountBalance(5000.00);
//        bankAccountTara.setPhoneNumber("(+234)81-5401-7014");
//        bankAccountTara.setEmailAddress("taragil@gmail.com");
//        bankAccountTara.depositFunds();
//        System.out.println();
//        bankAccountTara.withdrawFunds();
//        System.out.println();
//        bankAccountTara.customerInformation();

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        calculator.getAdditionResult();
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());

//        OUTPUT
//        add= 9.0
//        subtract= 1.0
//        multiply= 0.0
//        divide= 0.0
//
//
    }
}
