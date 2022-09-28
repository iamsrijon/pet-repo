package com.srijon.petclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public abstract class AbstractMapService <T, ID> {
    protected HashMap<ID, T> map = new HashMap<>();
    Set<T> findAll() {
        return new HashSet<T>(map.values());
    }
    T findById(ID id) {
        return map.get(id);
    }
    T save(ID id, T obj) {
        map.put(id, obj);
        return obj;
    }
    void delete(T obj) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(obj));
    }
    void deleteById(ID id) {
        map.remove(id);
    }
}
