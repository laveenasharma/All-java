import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cm, meter, kilometer;
        boolean continueFlag = true;
        String continueChoice;
        while (continueFlag) {
            System.out.println(" Unit conversion for Distance\n1.CM to M\n 2.M to KM\n 3.KM to M\n 4.M to CM");
            System.out.println("Enter your value: ");
            int number = input.nextInt();

            switch (number) {
                case 1:
                    System.out.println("Please enter the CM Value:");
                    cm = input.nextDouble();
                    meter = cm / 100.0;
                    System.out.println("Length in meter = " + meter + "m");
                    System.out.println("Do you want to Continue (y/n)? ");
                    continueChoice = input.next();

                    if (continueChoice.equalsIgnoreCase("n")) {
                        continueFlag = false;
                    }
                    break;
                case 2:
                    System.out.println("Please enter the Meter Value:");
                    meter = input.nextDouble();
                    kilometer = meter / 1000.0;
                    System.out.println("Length in Kilometer = " + kilometer + "km");
                    System.out.println("Do you want to Continue (y/n)? ");
                    continueChoice = input.next();

                    if (continueChoice.equalsIgnoreCase("n")) {
                        continueFlag = false;
                    }
                    break;
                case 3:
                    System.out.println("Please enter the KM Value:");
                    kilometer = input.nextDouble();
                    meter = kilometer * 1000.0;
                    System.out.println("Length in meter = " + meter + "m");
                    System.out.println("Do you want to Continue (y/n)? ");
                    continueChoice = input.next();

                    if (continueChoice.equalsIgnoreCase("n")) {
                        continueFlag = false;
                    }
                    break;
                case 4:
                    System.out.println("Please enter the Meter Value:");
                    meter = input.nextDouble();
                    cm = meter * 100.0;
                    System.out.println("Length in meter = " + meter + "m");
                    System.out.println("Do you want to Continue (y/n)? ");
                    continueChoice = input.next();

                    if (continueChoice.equalsIgnoreCase("n")) {
                        continueFlag = false;
                    }
                    break;
                default:
                    System.out.println("Enter the correct values.");
                    break;
            }

        }
    }
}
