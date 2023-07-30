package com.lbleds.Repository;

import com.lbleds.Entity.Strain;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface StrainRepository extends CrudRepository<Strain,Long> {
}
