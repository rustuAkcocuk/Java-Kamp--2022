package Kodlama.io.Devs.dataAccess.concrates;

import Kodlama.io.Devs.dataAccess.abstracts.LengithRepository;
import Kodlama.io.Devs.entities.concretes.Lengith;

import java.util.ArrayList;
import java.util.List;

public class InMemoryLengithRepository implements LengithRepository  {
    List<Lengith> lengith;

    public InMemoryLengithRepository(){
        lengith=new ArrayList<Lengith>();
        lengith.add( new Lengith(1,"C#"));
        lengith.add( new Lengith(2,"Java"));
        lengith.add(new Lengith(3,"Pythone"));
    }

    public List<Lengith> getAll() {
        return lengith;
    }

    public Lengith getnId(int id) {
        for(Lengith len :lengith) {
            if (len.getId() == id) {
                return len;
            }
        }
            System.out.println("Aranan Id bulunamadı");
            return null;
    }

    public void save(Lengith lengith) {
       this.lengith.add(lengith);

    }

    public void update(Lengith lengith, String newLengithName) {
         this.lengith.get(lengith.getId()-1).setName(newLengithName);
    }

    public void delete(Lengith lengith) {
        this.lengith.remove(lengith.getId()-1);
        System.out.println("İfasde silidi");

    }
}
