public class Automobile {

    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    // Default constructor
    public Automobile() {
        try {
            make = "";
            model = "";
            color = "";
            year = 0;
            mileage = 0;
        } catch (Exception e) {
            System.out.println("Failure: " + e.getMessage());
        }
    }

    // Parameterized constructor
    public Automobile(String make, String model, String color,
                      int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
        } catch (Exception e) {
            System.out.println("Failure: " + e.getMessage());
        }
    }

    public String addNewVehicle(String make, String model,
                                String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;

            return "Success: Vehicle added.";

        } catch (Exception e) {
            return "Failure: " + e.getMessage();
        }
    }

    public String[] listVehicleInformation() {
        try {
            return new String[]{
                    "Make: " + make,
                    "Model: " + model,
                    "Color: " + color,
                    "Year: " + year,
                    "Mileage: " + mileage
            };

        } catch (Exception e) {
            return new String[]{
                    "Failure: " + e.getMessage()
            };
        }
    }

    public String removeVehicle() {
        try {
            make = "";
            model = "";
            color = "";
            year = 0;
            mileage = 0;

            return "Success: Vehicle removed.";

        } catch (Exception e) {
            return "Failure: " + e.getMessage();
        }
    }

    public String updateVehicleAttributes(String make, String model,
                                          String color, int year,
                                          int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;

            return "Success: Vehicle updated.";

        } catch (Exception e) {
            return "Failure: " + e.getMessage();
        }
    }
}
