package com.dannys_notepad.NamePairer

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class NamePairer
{
  public viod pairNames(ArrayList<String> names)
  {
    Collections.shuffle(names);
    String pairedNames;
    for(int i = 0; i < names.size(); i++)
    {
      pairedNames = String.fomat('%s as been paired with %s', names.get(i), names.get(++i))
      System.out.println(pairedNames);
    }
  }
  public static void main(String[] args)
  {
    List <String> names = new ArrayList<>();
    
    names.add("Lila Chen");
    names.add("Emily White");
    names.add("Ethan Patel");
    names.add("Lucas Brooks");
    names.add("Ava Lee");
    names.add("Isabella Smith");
    names.add("Ava Morales");
    names.add("Steven Hall");
    names.add("harper Davis");
    names.add("Mia Kim");
    
    pairNames(names);
  }
}

/*
Ava Morales & Ethan Patel
2. Lila Chen & Julian Sanchez
3. Ruby Singh & Lucas Brooks
4. Ava Lee & Sophia Hall
5. Mia Kim & Alexander Brown
6. Emily White & Grace Black
7. Harper Davis & Logan Russell
8. Evelyn Mitchell & Gabriel Martin
9. Julia Jenkins & Michael Reyes
10. Sofia Garcia & Daniel Lewis
11. Isabella*/