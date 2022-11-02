package Kodlama.io.Devs.webApi.controllers;

import Kodlama.io.Devs.businnes.abstarct.LengithService;
import Kodlama.io.Devs.entities.concretes.Lengith;

import java.util.List;

@RestController
@RequestMapping("/api/lengith")
public class LengithControllers {
    private LengithService lengithService;

    public LengithControllers(LengithService lengithService){
        this.lengithService=lengithService;
    }
    @RequestMapping("/getall")
    public List<Lengith> getAll(){
        return lengithService.getall();
    }
}
