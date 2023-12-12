public class Car {
    private String make;
    private String model ;
    private String color;
    private int doors;
    private boolean convertible;

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public String getMake(){
        return make;
    }

    // Setter metodları aşağıdaki gibidir.

    public void setMake(String make){

        if (make == null) make = "Unknown";
        String lowerCaseMake = make.toLowerCase();
        switch (lowerCaseMake){
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> {this.make = "Unsupported ";}
        }

    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar(){
        System.out.println(doors + "-Door " +
                color + "-color " +
                make + "-make " +
                model + "-model " +
                (convertible ? "Convertible" : ""));
    }
}
