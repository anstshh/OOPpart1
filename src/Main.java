public class Main {
    public static void main(String[] args) {

        int currentYear = 2022;

        Human maksim = new Human();
        maksim.name = "Максим";
        maksim.age = 35;
        maksim.city = "Минск";
        maksim.position = "Бренд-менеджер";

        Human anya = new Human();
        anya.name = "Аня";
        anya.age = 29;
        anya.city = "Москва";
        anya.position = "Методист образовательных программ";

        Human katya = new Human();
        katya.name = "Катя";
        katya.age = 28;
        katya.city = "Калининград";
        katya.position = "Продакт-менеджер";

        Human artyom = new Human();
        artyom.name = "Катя";
        artyom.age = 27;
        artyom.city = "Москва";
        artyom.position = "Директор по развитию бизнеса";

        System.out.println("Привет! Меня зовут "+maksim.name+". Я из города "+maksim.city+". Я родился в  "+(currentYear - maksim.age)+" году. Я работаю на должности "+maksim.position+".Будем знакомы!");
        System.out.println("Привет! Меня зовут "+anya.name+". Я из города "+anya.city+". Я родился в  "+(currentYear - anya.age)+" году. Я работаю на должности "+anya.position+". Будем знакомы!");
        System.out.println("Привет! Меня зовут "+katya.name+". Я из города "+katya.city+". Я родился в  "+(currentYear - katya.age)+" году. Я работаю на должности "+katya.position+". Будем знакомы!");
        System.out.println("Привет! Меня зовут "+artyom.name+". Я из города "+artyom.city+". Я родился в  "+(currentYear - artyom.age)+" году. Я работаю на должности "+artyom.position+". Будем знакомы!");
    }
}