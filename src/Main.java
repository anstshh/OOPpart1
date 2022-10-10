public class Main {
    public static void main(String[] args) {

        Human maksim = new Human();
        maksim.name = "Максим";
        maksim.age = 35;
        maksim.city = "Минск";

        Human anya = new Human();
        anya.name = "Аня";
        anya.age = 29;
        anya.city = "Москва";

        Human katya = new Human();
        katya.name = "Катя";
        katya.age = 28;
        katya.city = "Калининград";

        Human artyom = new Human();
        artyom.name = "Катя";
        artyom.age = 27;
        artyom.city = "Москва";

        System.out.println("Привет! Меня зовут …. Я из города …. Я родился в  … году. Я работаю на должности… . Будем знакомы!");
    }
}