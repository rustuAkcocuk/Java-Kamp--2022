package Kodlama.io.Devs.businnes.abstarct;

import Kodlama.io.Devs.entities.concretes.Lengith;

import java.util.List;

public interface LengithService {
    List<Lengith> getall();
    void save(Lengith lengith);
    void delete(Lengith lengith);
    void update (Lengith lengith,String newlengithName);
}
