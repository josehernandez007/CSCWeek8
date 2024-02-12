import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            // Call automobile class with parameterized constructor
            automobile car = new automobile("Toyota", "Camry", "Red", 2022, 10000);

            // Call the method to list the values
            String[] vehicleInfo = car.listVehicleInformation();

            // Loop through the array and print to the screen
            for (String info : vehicleInfo) {
                System.out.println(info);
            }

            // Call the remove vehicle method to clear the variables
            String removeResult = car.removeVehicle();
            System.out.println(removeResult);

            // Add a new vehicle
            String addResult = car.addNewVehicle("Honda", "Accord", "Blue", 2023, 5000);
            System.out.println(addResult);

            // Call the list method and print the new vehicle information to the screen
            String[] newVehicleInfo = car.listVehicleInformation();
            for (String info : newVehicleInfo) {
                System.out.println(info);
            }

            // Update the vehicle
            String updateResult = car.updateVehicleAttributes("Honda", "Accord", "Green", 2023, 6000);
            System.out.println(updateResult);

            // Call the listing method and print the information to the screen
            String[] updatedVehicleInfo = car.listVehicleInformation();
            for (String info : updatedVehicleInfo) {
                System.out.println(info);
            }

            // Display a message asking if the user wants to print the information to a file (Y or N)
            System.out.println("Do you want to print the information to a file? (Y/N)");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine();

            // If "Y", print the file to a predefined location
            if (response.equalsIgnoreCase("Y")) {
                printToFile(updatedVehicleInfo);
                System.out.println("Information printed to file.");
            } else {
                System.out.println("File will not be printed.");
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    
    private static void printToFile(String[] vehicleInfo) {
        try (FileWriter writer = new FileWriter("C:\\Temp\\Autos.txt")) {
            for (String info : vehicleInfo) {
                writer.write(info + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error printing to file: " + e.getMessage());
        }
    }
}