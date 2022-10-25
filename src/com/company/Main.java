package com.company;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
   try{
        PrintStream fileWriter = new PrintStream("Results.txt");

       ArrayList<VolleyballPlayer> team1 = new ArrayList<>();
        VolleyballPlayer Tom =new VolleyballPlayer("Tom",43,"opposite",4,4);
        VolleyballPlayer Sam =new VolleyballPlayer("Sam",33,"setter",2,3);
        VolleyballPlayer Larry =new VolleyballPlayer("Larry",23,"libero",5,4);
        VolleyballPlayer Steve =new VolleyballPlayer("Steve",35,"outside hitter",7,2);
        VolleyballPlayer Dave =new VolleyballPlayer("Dave",19,"serving specialist",8,2);
        VolleyballPlayer Vade =new VolleyballPlayer("Vade",53,"serving specialist",1,5);
        team1.add(Tom);
        team1.add(Sam);
        team1.add(Larry);
        team1.add(Steve);
        team1.add(Dave);
        team1.add(Vade);
        ArrayList<VolleyballPlayer> team2 = new ArrayList<>();
        VolleyballPlayer Mope =new VolleyballPlayer("Mope",25,"opposite",4,4);
        VolleyballPlayer Samos =new VolleyballPlayer("Samos",42,"setter",2,3);
        VolleyballPlayer Lars =new VolleyballPlayer("Lars",29,"libero",5,4);
        VolleyballPlayer Steven =new VolleyballPlayer("Steven",60,"outside hitter",7,2);
        VolleyballPlayer David =new VolleyballPlayer("David",30,"serving specialist",8,2);
        VolleyballPlayer Vader =new VolleyballPlayer("Vader",32,"serving specialist",1,4);
        team2.add(Mope);
        team2.add(Samos);
        team2.add(Lars);
        team2.add(Steven);
        team2.add(David);
        team2.add(Vader);
        VolleyballTeam Team1 = new VolleyballTeam("Team 1","Big Stadium","Jose Mourihno",team1);
        VolleyballTeam Team2 = new VolleyballTeam("Team 2","Big Stadium","Jose Mourihno",team2);
        System.out.println("BEFORE TRAIN AND REST");
        System.out.println(Team1);
        System.out.println(Team2);

        Team1.teamTraining();
        Team2.teamRest();
        System.out.println("AFTER TRAIN AND REST");
        System.out.println(Team1);
        System.out.println(Team2);


        Team1.playMatch(Team1,Team2);
        Team1.calculateStrength();

       fileWriter.println(Team1);
       fileWriter.println(Team2);
    }catch (Exception e){
       System.out.println("ERROR");
       System.out.println(e);
   }
    }
}













