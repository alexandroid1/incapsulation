public class Cat {

    public String name;
    public int age;
    public int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat() {
    }

    public void sayMeow() {
        System.out.println("Ìÿó!");
    }

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.name = "";
        cat.age = -1000;
        cat.weight = 0;

    }

}

