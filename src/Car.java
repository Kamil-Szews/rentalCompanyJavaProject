public class Car extends Vehicle{

    private static int nextVehicleId = 0;
    private final int id;
    private String plate;
    private String brand;
    private String model;
    private int oneDayRentCost;
    private int oneWeekRentCost;
    private int oneMonthRentCost;
    private int distance;

    public Car(String plate, String brand, String model, int oneDayRentCost,
               int oneWeekRentCost, int oneMonthRentCost, int distance) {
        this.plate = plate;
        this.brand = brand;
        this.model = model;
        this.oneDayRentCost = oneDayRentCost;
        this.oneWeekRentCost = oneWeekRentCost;
        this.oneMonthRentCost = oneMonthRentCost;
        this.distance = distance;
        nextVehicleId += 100;
        this.id = nextVehicleId;
    }

    public static void setNextVehicleId(int nextVehicleId) {
        Car.nextVehicleId = nextVehicleId;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOneDayRentCost(int oneDayRentCost) {
        this.oneDayRentCost = oneDayRentCost;
    }

    public void setOneWeekRentCost(int oneWeekRentCost) {
        this.oneWeekRentCost = oneWeekRentCost;
    }

    public void setOneMonthRentCost(int oneMonthRentCost) {
        this.oneMonthRentCost = oneMonthRentCost;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public static int getNextVehicleId() {
        return nextVehicleId;
    }

    public int getId() {
        return id;
    }

    public String getPlate() {
        return plate;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getOneDayRentCost() {
        return oneDayRentCost;
    }

    public int getOneWeekRentCost() {
        return oneWeekRentCost;
    }

    public int getOneMonthRentCost() {
        return oneMonthRentCost;
    }

    public int getDistance() {
        return distance;
    }
}
