package br.com.hospital;

import java.util.Vector;

public class Setor {
    private Long id;
    private String name;
    private Vector<Sala> salas;

    Setor(Long id, String name, Sala sala1){
        this.id = id;
        this.name = name;
        this.salas.add(sala1);
    }

    //set
    void setName(String name){
        this.name = name;
    }
    void addSala (Sala sala){
        this.salas.add(sala);
    }

    //get
    String getName(){
        return this.name;
    }
    Long getID(){
        return this.id;
    }
    Sala getSala(Sala sala){
        int index = this.salas.indexOf(sala);
        return salas.get(index);    
    }

}
