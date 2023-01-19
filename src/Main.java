import transport.Car;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Car Lada = new Car("null", "", 0.0, "", 0, "null");
        Car Audi = new Car("Audi A8", "50 L TDI quattro", 3.0, "Черного", 2020, "Германии");
        Car BMW = new Car("BMW", "Z8", 3.0, "Черного", 2021, "Германии");
        Car Kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "Красного", 2018, "Южной Корее");
        Car Hyundai = new Car("Hyundai", "Avante", 1.6, "Оранжевого", 2016, "Южной Корее");
        System.out.println(Lada);
        System.out.println(Audi);
        System.out.println(BMW);
        System.out.println(Kia);
        System.out.println(Hyundai);
    }
}