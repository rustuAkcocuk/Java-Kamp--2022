package Kodlama.io.Devs.businnes.concretes;

import Kodlama.io.Devs.businnes.abstarct.LengithService;
import Kodlama.io.Devs.dataAccess.abstracts.LengithRepository;
import Kodlama.io.Devs.entities.concretes.Lengith;

import java.util.List;

public class LengithManager implements LengithService {
 public LengithRepository lengithRepository;

 public LengithManager(LengithRepository lengithRepository){
     this.lengithRepository=lengithRepository;
 }

    public List<Lengith> getall() {
        return lengithRepository.getAll();
    }

    public void save(Lengith lengith) {
       if(lengith!=null && lengithExistValidator(lengith)){
          lengithRepository.save(lengith);
       }
    }

    public void delete(Lengith lengith) {
     lengithRepository.delete(lengith);
    }

    public void update(Lengith lengith, String newlengithName) {
        if(newlengithName!=null && !lengithExistValidator(lengith)){
            lengithRepository.update(lengith,newlengithName);
        }
    }
   public boolean lengithExistValidator(Lengith lengith){
     for(Lengith len :lengithRepository.getAll()){
          if(len.getName().equalsIgnoreCase(lengith.getName())){
              System.out.println("Girmek istediğinz dil zaten mevcut");
              return false;
          }
     }
     return true;
   }
}
