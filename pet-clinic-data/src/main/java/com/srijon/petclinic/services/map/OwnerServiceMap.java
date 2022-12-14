package com.srijon.petclinic.services.map;

import com.srijon.petclinic.model.Owner;
import com.srijon.petclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService <Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner obj) {
        super.delete(obj);
    }

    @Override
    public Owner save(Owner obj) {
        return super.save(obj.getId(), obj);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
