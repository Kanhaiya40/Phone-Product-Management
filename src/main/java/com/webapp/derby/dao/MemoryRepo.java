package com.webapp.derby.dao;

import com.webapp.derby.model.Memory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoryRepo extends JpaRepository<Memory,Integer> {

}
