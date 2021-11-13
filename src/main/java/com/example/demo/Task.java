package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task {

  /*
  Zwróć listę aktywnych graczy posortowanych po ich wyniku malejąco
   */

  public static List<Person> getActivePlayersByScoreDesc(List<Person> people) {
    Person person = new Person();
    List<Person> sortedActivePlayersByScoreDesc = new ArrayList<>(people);
    if (person.isActive()) {
      sortedActivePlayersByScoreDesc.sort(Comparator
                      .comparing(Person::getScore, Collections.reverseOrder()));
    }
    return sortedActivePlayersByScoreDesc;
  }

  /*
  Zwróć listę aktywnych graczy z danej grupy posortowanych po ich wyniku malejąco
   */

  public static List<Person> getActivePlayersByScoreDesc(List<Person> people, Group group) {
    List<Person> sortedActivePlayersFromGroupByScoreDesc = new ArrayList<>();
    switch (group) {
      case G1, G2, G3 -> {
        sortedActivePlayersFromGroupByScoreDesc = getActivePlayersByScoreDesc(people);
      }
    }
    return sortedActivePlayersFromGroupByScoreDesc;
  }

  /*
  Zwróć grupę, która posiada najwyższy wynik. Jeżeli wynik wielu grup jest taki sam, zwróć tę, która ma mniejszą liczbę aktywnych członków.
  Jeżeli ta liczba jest również równa, zwróć którąkolwiek z nich.
   */
    public static Group getGroupWithHighestScore (List < Person > people) {
      throw new RuntimeException("Not Implemented!");
    }

  /*
  Zwróć listę wyników posortowaną malejąco na podstawie ilości punktów per zespół.
  Pojedynczy String powinien mieć format: "NazwaGrupy CałkowityWynik (lista_aktywnych_członków) [ilość nieaktywnych członków]"
   */

    public static List<String> printPoints (List < Person > people) {
      throw new RuntimeException("Not Implemented!");
    }

}
