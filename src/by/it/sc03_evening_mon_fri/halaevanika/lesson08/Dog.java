package by.it.sc03_evening_mon_fri.halaevanika.lesson08;

public class Dog {

    private String name;
    private int age;

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void setName(String name){
        this.name=name;
    }
    void setAge(int age){
      this.age=age;
    }
    public String toString(){
        return  "Кличка: "+this.name+". Возраст: "+this.age;
    }

}

