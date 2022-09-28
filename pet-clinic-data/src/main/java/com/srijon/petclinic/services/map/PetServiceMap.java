package com.srijon.petclinic.services.map;

import com.srijon.petclinic.model.Pet;
import com.srijon.petclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet obj) {
        super.delete(obj);
    }

    @Override
    public Pet save(Pet obj) {
        super.save(obj.getId(), obj);
        return obj;
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
