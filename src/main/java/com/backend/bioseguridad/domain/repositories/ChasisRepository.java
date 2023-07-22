package com.backend.bioseguridad.domain.repositories;

import com.backend.bioseguridad.domain.models.Chasis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChasisRepository extends JpaRepository<Chasis, Long> {

    public Chasis findByUsername(String username);

}