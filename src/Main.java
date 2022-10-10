public class Main {
    public static void main(String[] args) {

        int currentYear = 2022;

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

        System.out.println("Привет! Меня зовут "+maksim.name+". Я из города "+maksim.city+". Я родился в  "+(currentYear - maksim.age)+" году. Будем знакомы!");
        System.out.println("Привет! Меня зовут "+anya.name+". Я из города "+anya.city+". Я родился в  "+(currentYear - anya.age)+" году. Будем знакомы!");
        System.out.println("Привет! Меня зовут "+katya.name+". Я из города "+katya.city+". Я родился в  "+(currentYear - katya.age)+" году. Будем знакомы!");
        System.out.println("Привет! Меня зовут "+artyom.name+". Я из города "+artyom.city+". Я родился в  "+(currentYear - artyom.age)+" году. Будем знакомы!");
    }
}