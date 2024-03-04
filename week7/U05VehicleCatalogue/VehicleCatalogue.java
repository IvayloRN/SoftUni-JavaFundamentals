package javaFundamentals.week7.U05VehicleCatalogue;


public class VehicleCatalogue {
    private String typeOfVehicle;
    private String model;
    private String color;
    private int horsePower;


    public VehicleCatalogue(String typeOfVehicle, String model, String color, int horsePower) {
        this.typeOfVehicle = typeOfVehicle;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }
}
//"{typeOfVehicle} {model} {color} {horsepower}"