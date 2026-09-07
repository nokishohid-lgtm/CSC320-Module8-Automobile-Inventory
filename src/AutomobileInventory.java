import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AutomobileInventory {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            Automobile automobile = new Automobile(
                    "Toyota",
                    "Camry",
                    "Blue",
                    2022,
                    25000
            );

            System.out.println("INITIAL VEHICLE");

            printVehicle(
                    automobile.listVehicleInformation()
            );

            System.out.println(
                    "\n" + automobile.removeVehicle()
            );

            System.out.println(
                    "\n" + automobile.addNewVehicle(
                            "Honda",
                            "Accord",
                            "Black",
                            2023,
                            12000
                    )
            );

            printVehicle(
                    automobile.listVehicleInformation()
            );

            System.out.println(
                    "\n" + automobile.updateVehicleAttributes(
                            "Honda",
                            "Accord",
                            "White",
                            2023,
                            12500
                    )
            );

            printVehicle(
                    automobile.listVehicleInformation()
            );

            System.out.print(
                    "\nWould you like to print the vehicle " +
                    "information to a file? (Y/N): "
            );

            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("Y")) {

                System.out.println(
                        printToFile(
                                automobile.listVehicleInformation()
                        )
                );

            } else {

                System.out.println(
                        "A file will not be printed."
                );
            }

        } catch (Exception e) {

            System.out.println(
                    "Failure: " + e.getMessage()
            );

        } finally {

            scanner.close();
        }
    }

    public static void printVehicle(
            String[] vehicleInformation) {

        try {

            for (String item : vehicleInformation) {
                System.out.println(item);
            }

        } catch (Exception e) {

            System.out.println(
                    "Failure: " + e.getMessage()
            );
        }
    }

    public static String printToFile(
            String[] vehicleInformation) {

        try {

            File directory =
                    new File("C:\\Temp");

            if (!directory.exists()) {
                directory.mkdirs();
            }

            File file =
                    new File(directory, "Autos.txt");

            try (FileWriter writer =
                         new FileWriter(file)) {

                for (String item :
                        vehicleInformation) {

                    writer.write(
                            item +
                            System.lineSeparator()
                    );
                }
            }

            return "Success: Vehicle information printed to " +
                    "C:\\Temp\\Autos.txt";

        } catch (IOException e) {

            return "Failure: " + e.getMessage();
        }
    }
}
