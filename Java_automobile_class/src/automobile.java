public class automobile {
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    // Default constructor
    public automobile() {
    }

    // Parameterized constructor
    public automobile(String make, String model, String color, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

    // Add a new vehicle method
    public String addNewVehicle(String make, String model, String color, int year, int mileage) {
        try {
            // Add vehicle logic here
            return "Vehicle added successfully";
        } catch (Exception e) {
            return "Failed to add vehicle: " + e.getMessage();
        }
    }

    // List vehicle information method
    public String[] listVehicleInformation() {
        try {
            String[] vehicleInfo = {make, model, color, String.valueOf(year), String.valueOf(mileage)};
            return vehicleInfo;
        } catch (Exception e) {
            return new String[]{"Failed to list vehicle information: " + e.getMessage()};
        }
    }

    // Remove a vehicle method
    public String removeVehicle() {
        try {
            // Remove vehicle logic here
            return "Vehicle removed successfully";
        } catch (Exception e) {
            return "Failed to remove vehicle: " + e.getMessage();
        }
    }

    // Update vehicle attributes method
    public String updateVehicleAttributes(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle attributes updated successfully";
        } catch (Exception e) {
            return "Failed to update vehicle attributes: " + e.getMessage();
        }
    }
}