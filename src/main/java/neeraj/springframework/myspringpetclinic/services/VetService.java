package neeraj.springframework.myspringpetclinic.services;

import neeraj.springframework.myspringpetclinic.model.Vet;

import java.util.Set;

public interface VetService extends CrudServices<Vet,Long>{

    //after implemented crudService all methods are inherited NO need to write
//    Vet findById(Long id);
//    Set<Vet> findAll();
//    Vet save();
}
