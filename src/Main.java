public class Main {
    public static void main(String[] args) {
        Car car = new Car("Мерседес", 4);
        Car car2 = new Car("Ауди", 4);


        Truck truck = new Truck("Маз", 6);
        Truck truck2 = new Truck("Белаз", 8);


        Bicycle bicycle = new Bicycle("Кама", 2);
        Bicycle bicycle2 = new Bicycle("Салют", 2);

        Transport[] transports = {car, car2, truck, truck2, bicycle, bicycle2};

        ServiceStation station = new ServiceStation();
        for (Transport transport : transports) {
            System.out.println(transport.getModelName());

            station.check(transport);
            System.out.println();

        }

    }


}