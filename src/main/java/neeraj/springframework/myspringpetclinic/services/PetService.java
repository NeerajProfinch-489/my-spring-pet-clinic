package neeraj.springframework.myspringpetclinic.services;

import neeraj.springframework.myspringpetclinic.model.Pet;

import java.util.Set;

public interface PetService extends CrudServices<Pet,Long>{
    //after implemented crudService all methods are inherited NO need to write
//    Pet findById(Long id);
//    Set<Pet> findAll();
//    Pet save();
}
