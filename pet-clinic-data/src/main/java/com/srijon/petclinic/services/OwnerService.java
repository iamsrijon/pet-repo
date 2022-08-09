package com.srijon.petclinic.services;

import com.srijon.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(long id);
    Owner findByLastName(String lastName);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
