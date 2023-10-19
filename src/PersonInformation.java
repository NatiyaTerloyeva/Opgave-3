import java.util.Scanner;

public class PersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;

        int birthYear;
        double bmi;
        boolean hasDriveLicence;
        String gender;

        System.out.println("Set your name: ");

        name = scanner.nextLine();

        System.out.println("Set your birthday: ");

        birthYear = scanner.nextInt();

        System.out.println("Set your Bmi: ");
        bmi = scanner.nextDouble();


        System.out.println("Have you licensestatus? ");

        String licenseStatus = scanner.next();
        hasDriveLicence = licenseStatus.equalsIgnoreCase("ja");

        scanner.nextLine();

        System.out.println("your gender: ");
        gender = scanner.nextLine();

        System.out.println(" person information: ");
        System.out.println("Name: " + name);
        System.out.println("Birthday"+ birthYear);
        System.out.println("bmi" + bmi);
        System.out.println("have license:" + (hasDriveLicence? "ja" : " no"));

        scanner.close();


    }
}
