public class Auto {

    public void gas() {

        System.out.println("поехали");

       /*внутри автомобиля происходят какие-то сложные вещи
       в результате которых он едет вперед*/
    }

    public void brake() {

        System.out.println("тормозим");

       /*внутри автомобиля происходят какие-то сложные вещи
       в результате которых он тормозит*/
    }

    public static void main(String[] args) {

        Auto auto = new Auto();

        //Как все выглядит для пользователя

        //нажал одну педаль - поехал
        auto.gas();

        //нажал другую педаль - затормозил
        auto.brake();
    }
}
