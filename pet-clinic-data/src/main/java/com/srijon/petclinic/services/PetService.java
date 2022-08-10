package com.srijon.petclinic.services;

import com.srijon.petclinic.model.Owner;
import com.srijon.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
