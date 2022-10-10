public class Main {
    public static void main(String[] args) {

        int currentYear = 2022;

        Human maksim = new Human(35, "Максим", "Минск", "Бренд-менеджер");
        Human anya = new Human(29, "Аня", "Москва", "Методист образовательных программ");
        Human katya = new Human(28, "Катя", "Калининград", "Продакт-менеджер");
        Human artyom = new Human(27, "Артем", "Москва", "Директор по развитию бизнеса");


        System.out.println("Привет! Меня зовут "+maksim.name+". Я из города "+maksim.city+". Я родился в  "+(currentYear - maksim.age)+" году. Я работаю на должности "+maksim.position+".Будем знакомы!");
        System.out.println("Привет! Меня зовут "+anya.name+". Я из города "+anya.city+". Я родился в  "+(currentYear - anya.age)+" году. Я работаю на должности "+anya.position+". Будем знакомы!");
        System.out.println("Привет! Меня зовут "+katya.name+". Я из города "+katya.city+". Я родился в  "+(currentYear - katya.age)+" году. Я работаю на должности "+katya.position+". Будем знакомы!");
        System.out.println("Привет! Меня зовут "+artyom.name+". Я из города "+artyom.city+". Я родился в  "+(currentYear - artyom.age)+" году. Я работаю на должности "+artyom.position+". Будем знакомы!");
    }
}