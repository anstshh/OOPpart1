public class Main {
    public static void main(String[] args) {

        int currentYear = 2022;

        Human maksim = new Human(35, "Максим", "Минск", "Бренд-менеджер");
        Human anya = new Human(29, "Аня", "Москва", "Методист образовательных программ");
        Human katya = new Human(28, "Катя", "Калининград", "Продакт-менеджер");
        Human artyom = new Human(27, "Артем", "Москва", "Директор по развитию бизнеса");
        Human vladimir = new Human(21, "Владимир", "Казань", null);

        printInfo(maksim);
        printInfo(anya);
        printInfo(katya);
        printInfo(artyom);
        printInfo(vladimir);
    }

    private static void printInfo(Human human) {
        System.out.println("Привет! Меня зовут "+human.name+". Я из города "+human.getCity()+". Я родился в  "+human.getAge()+" году. Я работаю на должности "+human.position+".Будем знакомы!");

    }
}