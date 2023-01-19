package transport;

public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand=="" || brand=="null"){
            this.brand="default";
        }
        else {
            this.brand=brand;
        }
        if (model=="" || model=="null"){
            this.model="default";
        }
        else {
            this.model=model;
        }
        if (year<=0){
            this.year=2000;
        }
        else {
            this.year = year;
        }
        if (engineVolume<=0){
            this.engineVolume=1.5;
        }
        else {
            this.engineVolume=engineVolume;
        }
        if (color=="" || color=="null"){
            this.color="Белого";
        }
        else {
            this.color=color;
        }
        if (country=="" || country=="null"){
            this.country="default";
        }
        else {
            this.country=country;
        }
    }

    public java.lang.String toString() {
        return brand+" "+model+", "+year+" года выпуска,"+" сборка в "+country+" ,"+color+" цвета,"+" объем двигателя "+engineVolume;
    }
}