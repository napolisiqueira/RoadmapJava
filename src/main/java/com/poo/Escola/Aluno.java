package com.poo.Escola;

import java.util.jar.Attributes.Name;

public class Aluno {
    private String Name;
    private int Number;

    public void setName(String newName) {
        Name = newName;
    }    
    public String getName() {
        return Name;
    }

    public void setNumber(int newNumber) {
        Number = newNumber;
    }    
    public int getNumber() {
        return Number;
    }

}
