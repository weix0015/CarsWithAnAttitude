import java.util.ArrayList;

public class Car {
    private String Brand;
    private String Make;
    private String Honk;

    private String Sound;

    private String Drive;

    private String Park;

    private boolean engine;

    // getter
    public String getBrand() {

        return Brand;
    }

    // setter
    public void setBrand(String newBrand) {

        this.Brand = newBrand;
    }

    // getter
    public String getMake() {

        return Make;
    }

    // setter
    public void setMake(String newMake) {

        this.Make = newMake;
    }

    // getter
    public String getHonk() {

        return Honk;
    }

    // setter
    public void setHonk(String newHonk) {

        this.Honk = newHonk;
    }

    // getter
    public String getSound() {

        return Sound;
    }

    // setter
    public void setSound(String newSound) {

        this.Sound = newSound;
    }

    // getter
    public String getDrive() {

        return Drive;
    }

    // setter
    public void setDrive(String newDrive) {

        this.Drive = newDrive;
    }

    // getter
    public String getPark() {

        return Park;
    }

    // setter
    public void setPark(String newPark) {

        this.Park = newPark;
    }

    // getter
    public boolean isEngine() {
        return engine;
    }

    // setter
    public void setEngine(boolean isEngine) {
        engine = isEngine;
    }

    public String checkEngine(){
        String On = "Engine is on";
        String Off = "Engine is off";
        if (engine == false) {
            return Off;
        } else if (engine == true) {
            return On;
        }
        return null;
    }

    public void turnEngine() {
        engine = true;
        System.out.println("Engine is on");
    }

    public void turnEngineOff() {
            this.engine = false;
            System.out.println("Engine is off");

    }

    @Override
    public String toString() {
        return "Car{" +
                "Brand='" + Brand + '\'' +
                ", Make='" + Make + '\'' +
                ", Honk='" + Honk + '\'' +
                ", Sound='" + Sound + '\'' +
                ", Drive='" + Drive + '\'' +
                ", Park='" + Park + '\'' +
                ", engine=" + checkEngine() +
                '}';
    }

    Car() {
            setBrand("Honda");
            setMake("One");
            setHonk("Dyt");
            setDrive("Bilen kører");
            setPark("Bilen er ikke parkeret");
            setEngine(engine);
        }
    }
