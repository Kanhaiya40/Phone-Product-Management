package com.webapp.derby.service;

import com.webapp.derby.dao.PhoneRepo;
import com.webapp.derby.model.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class PhoneService {
    @Autowired
    private PhoneRepo phone;

    public Phone addPhoneSetails(Phone p)
    {

         return phone.save(p);

    }

    public List<Phone> gettingPhoneDetails()
    {
        return phone.findAll();
    }

}
