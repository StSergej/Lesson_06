enum Vehicles {
    Honda(8000, "White"), Toyota(8500, "Red"),
    Mazda(7600, "Blue"), Nissan(7200, "Black");
    int price;
    String color;

    Vehicles(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Автомобиль: " + super.toString() + ", стоимость: " + price + ", цвет: " + getColor();
    }
}

public class Cars {
    public static void main(String[] args) {
        Vehicles car1 = Vehicles.Honda;
        Vehicles car2 = Vehicles.Toyota;
        Vehicles car3 = Vehicles.Mazda;
        Vehicles car4 = Vehicles.Nissan;

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
    }
}
