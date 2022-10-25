package com.company;

public class VolleyballPlayer {
private String name;
private int age;
private String position;
private int skills;
int condition;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public int getSkills() {
        return skills;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public void setSkills(int skills) {
        this.skills = skills;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    VolleyballPlayer(String name, int age, String position, int skills, int condition){
    this.name=name;
    this.age=age;
    this.position=position;
    this.skills=skills;
    this.condition=condition;
}
 public void train(){
    this.skills=skills+1;
    this.condition=condition-1;
    if (this.condition==1){

    }}
    public void rest(){
        this.condition=condition+1;
     }

    @Override
    public String toString() {
        return "VolleyballPlayer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", skills=" + skills +
                ", condition=" + condition +
                '}';
    }
}
//име, възраст, позиция, умения (от 1 до 10), кондиция (от 1
//до 5)
//И метод train(), който увеличава уменията му с 1 и намаля кондицията с 1. Ако кондицията е 1 -
//     не може да тренира. И метод rest(), който увеличава кондицията му с 1.
