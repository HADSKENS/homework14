package transport;

public class Car {
    public static class Key {
        private boolean keyless_entry;
        private boolean remote_engine_start;
        public Key (boolean keyless_entry, boolean remote_engine_start){
            this.remote_engine_start=remote_engine_start;
            this.keyless_entry=keyless_entry;
            }
        }
        private Key key;
        final private String brand;
        final private String model;
        final private double engineVolume;
        final private String color;
        final private int year;
        final private String country;
        private String transmission;
        private String type_body;
        private String registration_number;
        private int seats;
        private boolean summer_tires;
        private static String tires;
        public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String type_body, String registration_number, int seats, boolean summer_tires,Key key) {
            if (brand == "" || brand == "null") {
                this.brand = "default";
            } else {
                this.brand = brand;
            }
            if (model == "" || model == "null") {
                this.model = "default";
            } else {
                this.model = model;
            }
            if (year <= 0) {
                this.year = 2000;
            } else {
                this.year = year;
            }
            if (engineVolume <= 0) {
                this.engineVolume = 1.5;
            } else {
                this.engineVolume = engineVolume;
            }
            if (color == "" || color == "null") {
                this.color = "Белого";
            } else {
                this.color = color;
            }
            if (country == "" || country == "null") {
                this.country = "default";
            } else {
                this.country = country;
            }
            if (type_body == "" || type_body == "null") {
                this.type_body = "default body";
            } else {
                this.type_body = type_body;
            }
            if (transmission == "" || transmission == "null") {
                this.transmission = "Механического";
            } else {
                this.transmission = transmission;
            }
            if (registration_number == "" || registration_number == "null") {
                this.registration_number = "Отсутствует";
            } else {
                this.registration_number = registration_number;
            }
            if (seats == 0) {
                this.seats = 4;
            } else {
                this.seats = seats;
            }
            if (summer_tires == true) {
                tires = "Летняя";
            } else {
                tires = "Зимняя";
            }
        }



    public static void Changetires() {
            if (tires == "Летняя") {
                tires = "Зимняя";
            } else {
                tires = "Летняя";
            }
        }


        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public int getYear() {
            return year;
        }

        public String getCountry() {
            return country;
        }

        public double getEngineVolume() {
            return engineVolume;
        }

        public String getColor() {
            return color;
        }

        public String getTransmission() {
            return transmission;
        }

        public String getType_body() {
            return type_body;
        }

        public String getRegistration_number() {
            return registration_number;
        }

        public int getSeats() {
            return seats;
        }

        public boolean getSummer_tires() {
            return summer_tires;
        }

        public static String getTires() {
            return tires;
        }

        public void setTransmission(String transmission) {
            this.transmission = transmission;
        }

        public void setType_body(String type_body) {
            this.type_body = type_body;
        }

        public void setRegistration_number(String registration_number) {
            this.registration_number = registration_number;
        }

        public void setSeats(int seats) {
            this.seats = seats;
        }

        public void setSummer_tires(boolean summer_tires) {
            this.summer_tires = summer_tires;
        }

        public static void setTires(String tires) {
            tires = tires;
        }

        public String toString() {
            return brand + " " + model + ", " + year + " года выпуска," + " сборка в " + country + " ," + color + " цвета," + " объем двигателя " + engineVolume + " с трансмиссией " + transmission + " типа," + " типом кузова " + type_body + ", количество мест " + seats + ", регистрационный знак " + registration_number + ", " + tires + " резина, "+"Удаленный запуск двигателя "+ key.remote_engine_start+", Бесключевой доступ "+key.keyless_entry;
        }
    }
