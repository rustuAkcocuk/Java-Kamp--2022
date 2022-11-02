package Kodlama.io.Devs.dataAccess.abstracts;

import Kodlama.io.Devs.entities.concretes.Lengith;

import java.util.List;

public interface LengithRepository {
    List<Lengith> getAll();
    Lengith getnId(int id);
    void save (Lengith lengith);
    void update(Lengith lengith,String newLengithName);
    void delete(Lengith lengith);
}
