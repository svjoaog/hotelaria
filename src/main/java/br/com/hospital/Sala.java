package br.com.hospital;

public class Sala {
    private Long id;
    private String name;


    //constructor
    Sala(Long id, String name){
        this.id = id;
        this.name = name;
    }

    //set
    void setName (String name){
        this.name = name;
    }

    //get
    Long getID (){
        return this.id;
    }
    String getName(){
        return this.name;
    }

    
}
