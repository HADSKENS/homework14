import transport.Car;

import java.security.Key;

public class Main {
    public static void main(String[] args) {
        Car Lada = new Car("null", "", 0.0, "", 0, "null","","null","",0,false,new Car.Key(false,false));
        Car Audi = new Car("Audi A8", "50 L TDI quattro", 3.0, "Черного", 2020, "Германии","гидромеханического","A","A256ВВ 96",4,false,new Car.Key(false,false));
        Car BMW = new Car("BMW", "Z8", 3.0, "Черного", 2021, "Германии","автоматического","B","A256ВВ 96",2,false,new Car.Key(false,false));
        Car Kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "Красного", 2018, "Южной Корее","гидравлического","C","A256ВВ 96",4,false,new Car.Key(false,false));
        Car Hyundai = new Car("Hyundai", "Avante", 1.6, "Оранжевого", 2016, "Южной Корее","электромеханического","B","A256ВВ 96",4,false,new Car.Key(false,false));
        System.out.println(Lada);
        System.out.println(Audi);
        System.out.println(BMW);
        System.out.println(Kia);
        System.out.println(Hyundai);
        System.out.println("");
        Car.Changetires();
        System.out.println(Lada);
        System.out.println(Audi);
        System.out.println(BMW);
        System.out.println(Kia);
        System.out.println(Hyundai);
    }

}