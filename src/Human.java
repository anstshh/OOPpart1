public class Human {
    private int age;
    public String name;
    private String city;
    public String position;

    public Human(int age, String name, String city, String position) {
        if(age<0) {
            this.age = 0;
        } else {
            this.age = age;
        }
        if (name==null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (city==null) {
            this.city = "Информация не указана";
        } else {
            this.city = city;
        }
        if (position==null) {
            this.position = "Информация не указана";
        } else {
            this.position = position;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city==null) {
            this.city = "Информация не указана";
        } else {
            this.city = city;
        }
    }
}
