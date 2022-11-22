enum Animals{
    BEAR(12), FOX(3), WOLF(8), TIGER(5), ELEPHANT(24);
    int age;

    Animals(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal: " + super.toString() + "; " + "age - " + age + " years";
    }
}

public class Beasts {
    public static void main(String[] args) {

        Animals animals1 = Animals.BEAR;
        Animals animals2 = Animals.FOX;
        Animals animals5 = Animals.ELEPHANT;

        System.out.println(animals1);
        System.out.println(animals2);
        System.out.println(animals5);

    }
}
