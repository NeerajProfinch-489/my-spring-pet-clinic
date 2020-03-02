package neeraj.springframework.myspringpetclinic.services.map;

import neeraj.springframework.myspringpetclinic.model.Owner;
import neeraj.springframework.myspringpetclinic.model.Pet;
import neeraj.springframework.myspringpetclinic.services.CrudServices;

import java.util.Set;

public class PetServicesMap extends AbstractMapService<Pet,Long> implements CrudServices<Pet,Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
