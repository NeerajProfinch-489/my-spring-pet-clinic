package neeraj.springframework.myspringpetclinic.services.map;

import neeraj.springframework.myspringpetclinic.model.Owner;
import neeraj.springframework.myspringpetclinic.services.CrudServices;

import java.util.Set;

public class OwnerServicesMap extends AbstractMapService<Owner,Long> implements CrudServices<Owner,Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
