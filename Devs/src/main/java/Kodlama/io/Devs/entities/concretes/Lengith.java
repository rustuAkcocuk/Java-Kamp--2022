package Kodlama.io.Devs.entities.concretes;

public class Lengith {
    private int id;
    private String name;
    public Lengith(int id,String name){
        this.id=id;
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int setId(int id){
        return this.id=id;
    }
    public String setName(String name){
        return this.name=name;
    }
}
