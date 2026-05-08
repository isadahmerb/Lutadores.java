package org.example;

import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList <Lutadores> lutadores = new ArrayList<>();

        lutadores.add(new Lutadores("Nome", "Nacionalidade", 19, 1.75, 235, 12, 5 , 6));

        for (Lutadores l : lutadores){
            l.apresentar();
        }




    }
}