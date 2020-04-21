package com.webapp.derby.dao;

import com.webapp.derby.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepo extends JpaRepository<Phone,Integer> {
}
