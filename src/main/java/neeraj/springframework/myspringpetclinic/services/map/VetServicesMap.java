package neeraj.springframework.myspringpetclinic.services.map;

import neeraj.springframework.myspringpetclinic.model.Vet;
import neeraj.springframework.myspringpetclinic.services.CrudServices;

import java.util.Set;

public class VetServicesMap extends AbstractMapService<Vet,Long> implements CrudServices<Vet,Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}