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
//        bankAccountTara.depositFunds();
//        System.out.println();
//        bankAccountTara.customerInformation();

//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        calculator.getAdditionResult();
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());

//        Wall wall = new Wall(5,4);
//        System.out.println("area= " + wall.getArea());
//
//         wall.setHeight(-1.5);
//         System.out.println("width= " + wall.getWidth());
//         System.out.println("height= " + wall.getHeight());
//         System.out.println("area= " + wall.getArea());

//        area= 20.0
//        width= 5.0
//        height= 0.0
//        area= 0.0

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());

//        OUTPUT
//        distance(0,0)= 7.810249675906654
//        distance(second)= 5.0
//        distance(2,2)= 5.0
//        distance()= 0.0

    }
}
