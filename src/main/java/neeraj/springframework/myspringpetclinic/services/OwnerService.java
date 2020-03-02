package neeraj.springframework.myspringpetclinic.services;

import neeraj.springframework.myspringpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudServices<Owner,Long> {
    Owner findByLastName(String lastName);

    //after implemented crudService all methods are inherited NO need to write
//    Owner findById(Long id);
//    Set<Owner> findAll();
//    Owner save();
}
