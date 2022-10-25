package com.company;

import java.util.ArrayList;
import java.util.Random;

public class VolleyballTeam {
private String name;
private String stadium;
private String manager;
public ArrayList<VolleyballPlayer> players;

    public String getName() {
        return name;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public ArrayList<VolleyballPlayer> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<VolleyballPlayer> players) {
        this.players = players;
    }

    VolleyballTeam(String name, String stadium, String manager, ArrayList<VolleyballPlayer> players){
    this.name=name;
    this.stadium=stadium;
    this.manager=manager;
    this.players=players;
}

 public int calculateStrength(){
       // players.forEach(VolleyballPlayer::getSkills);

       int i = players.get(0).getSkills() + players.get(1).getSkills() + players.get(2).getSkills() +
              players.get(3).getSkills()+ players.get(4).getSkills() + players.get(5).getSkills();
      return i;
  }
   public void teamTraining(){
        players.forEach(VolleyballPlayer::train);
    }
   public void teamRest(){
        players.forEach(VolleyballPlayer::rest);
    }
    public void playMatch(VolleyballTeam a,VolleyballTeam b){
        Random rand = new Random();
        int rand_int1 = rand.nextInt(24)+1;
        int rand_int2 = rand.nextInt(24)+1;
        if (a.calculateStrength()+rand_int1>rand_int2+b.calculateStrength()){
            System.out.println("team 1 wins "+a.calculateStrength()+rand_int1);

        }else{
            System.out.println("team 2 wins "+b.calculateStrength()+rand_int2);
        }
    }
    @Override
    public String toString() {
        return "VolleyballTeam{" +
                "name='" + name + '\'' +
                ", stadium='" + stadium + '\'' +
                ", manager='" + manager + '\'' +
                ", players=" + players +
                '}';
    }
}
//Да се създаде клас волейболен отбор с полета: име, стадион, треньор и играчи. Каква структура от
//данни ще използвате за играчите? Класът има и методи calculateStrength(), който изчислява силата на
//отбор като средно аритметично от уменията на играчите. Както и методи teamTraining() и teamRest() -
//целият отбор тренира или почива.